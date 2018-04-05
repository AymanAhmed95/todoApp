package com.example.root.todo.Model.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import javax.inject.Inject;



public class TodoDbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "notes.db";
    public static final int DATABASE_VERSION = 1;


    public TodoDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY,%s TEXT,%s TEXT,%s TEXT,%s TEXT,%s TEXT);",
                                    TodoContract.TodoTable.TABLE_NAME,
                                    TodoContract.TodoTable._ID,
                                    TodoContract.TodoTable.COLUMN_TODO_TITLE,
                                    TodoContract.TodoTable.COLUMN_TODO_CONTENT,
                                    TodoContract.TodoTable.COLUMN_TODO_DATE,
                                    TodoContract.TodoTable.COLUMN_CREATED,
                                    TodoContract.TodoTable.COLUMN_UPDATED);
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TodoContract.TodoTable.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

}
