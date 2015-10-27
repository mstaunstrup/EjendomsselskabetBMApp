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
        String query = "CREATE TABLE " + TABLE_INSPECTIONLIST + "(" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_DATE + "TEXT, " +
                COLUMN_ROOM + "TEXT, " +
                COLUMN_ADDRESS + "TEXT, " +
                COLUMN_ACQUISITION + "INTEGER DEFAULT 0, " +
                COLUMN_TASKDESCRIPTION + "TEXT, " +
                COLUMN_SCHEDULED + "INTEGER DEFAULT 0, " +
                COLUMN_COMPLETED + "INTEGER DEFAULT 0, " +
                COLUMN_PICTUREADDRESS + "TEXT" +
                ");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_INSPECTIONLIST);

        onCreate(db);

            }

    public void addProduct(Inspectionlist product) {
        ContentValues values = new ContentValues();
        values.put(COLUMN_TASKDESCRIPTION, product.get_taskdescription());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_INSPECTIONLIST, null, values);
        db.close();
    }

    public String databaseToString(){
        String dbString = "";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_INSPECTIONLIST + " WHERE 1";

        //Cursor point to a location in your results
        Cursor c = db.rawQuery(query, null);
        //Move to the first row in your results
        c.moveToFirst();

        while (!c.isAfterLast()){
            if (c.getString(c.getColumnIndex("taskdescription"))!=null){
                dbString += c.getString(c.getColumnIndex("taskdescription"));
                dbString += "\n";
            }
            c.moveToNext();
        }
        db.close();
        return dbString;
    }
}
