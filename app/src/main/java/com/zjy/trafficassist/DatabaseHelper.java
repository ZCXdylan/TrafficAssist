package com.zjy.trafficassist;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ZJY on 2016/4/12.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "mydata.db";//数据库名称
    private static final int VERSION = 1;//数据库版本

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table if not exists user"
                + "(_id integer primary key autoincrement not null, " +
                    "username varchar(11) not null, password varchar(20) not null)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}