package com.example.rajeshnarayanarao.sqlitedatabasedemo;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

public class MyCoreDatabase extends SQLiteOpenHelper {

    static final private String DB_NAME = "Education";
    static final private String DB_TABLE = "student";
    static final private int DB_VER = 1;

    Context ctx;
    SQLiteDatabase myDb;

    public  MyCoreDatabase(Context ct) {
        super(ct, DB_NAME, null, DB_VER);
        ctx = ct;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + DB_TABLE + " (_id integer primary key autoincrement, " +
                "student_name text, college_name text);");
        Log.i("Database", "Table created");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + DB_TABLE);
        onCreate(db);
    }

    public void insertData(String s1, String s2) {
        myDb = getWritableDatabase();

        myDb.execSQL("insert into " + DB_TABLE + " (student_name, college_name) values('" + s1 +
                "', '" + s2 + "');");
        Toast.makeText(ctx, "Data Saved Successfully", Toast.LENGTH_SHORT).show();
    }

    public void getAll() {
        myDb = getReadableDatabase();
        Cursor cr = myDb.rawQuery("select * from " + DB_TABLE,null);
        StringBuilder sbr = new StringBuilder();

        while (cr.moveToNext()) {
            String s1 = cr.getString(1);
            String s2 = cr.getString(2);
            sbr.append(s1 + "     " + s2 + " \n");
        }

        Toast.makeText(ctx, sbr.toString(), Toast.LENGTH_LONG).show();

    }

}
