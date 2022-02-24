package com.example.example_sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.media.metrics.Event;

import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {

    public static final String CUST_TABLE = "cust_table";
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String AGE = "age";
    public static final String ACTIVE_USER = "active_user";

    public Database(@Nullable Context context) {
        super(context, "customer.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query= "Create table " + CUST_TABLE + "(" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + NAME + " TEXT," + AGE + " INT," + ACTIVE_USER + " BOOLEAN)";
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public Boolean add1(customer cust)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(NAME,cust.getCustomer_name());
        cv.put(AGE,cust.getAge());
        cv.put(ACTIVE_USER,cust.isActive_user());
        Long insert = db.insert(CUST_TABLE,null,cv);
        if(insert==-1){
            return false;
        }
        else
            return true;
    }
}
