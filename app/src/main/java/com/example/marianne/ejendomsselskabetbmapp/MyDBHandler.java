package com.example.marianne.ejendomsselskabetbmapp;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.content.Context;
import android.content.ContentValues;

public class MyDBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "inspectionlist.db";
    public static final String TABLE_INSPECTIONLIST = "inspectionlist";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_DATE = "date";
    public static final String COLUMN_ROOM = "room";
    public static final String COLUMN_ADDRESS = "address";
    public static final String COLUMN_ACQUISITION = "acquisition";
    public static final String COLUMN_TASKDESCRIPTION = "taskdescription";
    public static final String COLUMN_SCHEDULED = "scheduled";
    public static final String COLUMN_COMPLETED = "completed";
    public static final String COLUMN_PICTUREADDRESS = "pictureaddress";

    public MyDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE "

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
