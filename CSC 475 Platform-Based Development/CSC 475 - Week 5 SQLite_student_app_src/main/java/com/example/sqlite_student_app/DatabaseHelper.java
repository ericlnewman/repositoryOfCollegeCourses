package com.example.sqlite_student_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    //fields to create database table
    public static final String DATABASE_NAME = "Students.db";
    public static final String TABLE_NAME = "student_table";
    public static final String COL_1 = "ID"; // primary key (k)
    public static final String COL_2 = "First_Name";
    public static final String COL_3 = "Last_Name";
    public static final String COL_4 = "Grades";

    // constructor of DatabaseHelper and creates database table
    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME,
                null, 1);
    }

    //methods from SQLiteOpenHelper
    @Override
    public void onCreate(SQLiteDatabase db) {
        // creating table with fields above
        final String table = ("CREATE TABLE " + TABLE_NAME + "(" + COL_1 +
                " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_2 +" TEXT," + COL_3 + " TEXT, " +
                COL_4 +" INTEGER"+")");
        db.execSQL(table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);           // delete the old table
        onCreate(db);                                               // create a new table
    }

    // method to add data to the database
    public boolean insertData(String firstName, String lastName, String grades){
        SQLiteDatabase db = this.getReadableDatabase();          // create the database and table
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, firstName);
        contentValues.put(COL_3, lastName);
        contentValues.put(COL_4, grades);
        long result = db.insert(TABLE_NAME, null, contentValues);

        if(result == -1){ return false;}
        else{return true;}
    }

    // query the database and storing it in the Cursor instance res
    public Cursor getAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
        return res;
    }

    public boolean updateData(String ID, String firstName, String lastName, String grades){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, firstName);
        contentValues.put(COL_3, lastName);
        contentValues.put(COL_4, grades);
        db.update(TABLE_NAME, contentValues, "ID = ?", new String[]{ID});
        return true;
    }

    public Integer deleteData(String ID){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "ID = ?", new String[]{ID});
    }
}
