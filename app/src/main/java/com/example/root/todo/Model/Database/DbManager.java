package com.example.root.todo.Model.Database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.root.todo.Model.Models.ToDo;

import java.util.ArrayList;

import javax.inject.Inject;



public class DbManager implements DbManagerInterface {

    public TodoDbHelper todoDbHelper ;
    public SQLiteDatabase todoDB;



    public DbManager(TodoDbHelper todoDbHelper) {
        this.todoDbHelper = todoDbHelper;
        this.todoDB = todoDbHelper.getWritableDatabase();

    }

    @Override
    public boolean insertTodo(ToDo toDo) {

        ContentValues values = new ContentValues();
        values.put(TodoContract.TodoTable.COLUMN_TODO_TITLE,toDo.getToDoTitle());
        values.put(TodoContract.TodoTable.COLUMN_TODO_CONTENT,toDo.getToDoContent());
        values.put(TodoContract.TodoTable.COLUMN_TODO_DATE,toDo.getToDoDate());
        values.put(TodoContract.TodoTable.COLUMN_CREATED,toDo.getCreatedAt());
        values.put(TodoContract.TodoTable.COLUMN_UPDATED,toDo.getUpdatedAt());

        long result = todoDB.insert(TodoContract.TodoTable.TABLE_NAME,null,values);

        if(result != -1){
            return true;
        }else {

            return false;
        }

    }

    @Override
    public boolean updateTodo(ToDo toDo) {

        return false;
    }

    @Override
    public boolean deleteTodo(ToDo toDo) {
        return false;
    }

    @Override
    public ArrayList<ToDo> getAllTodos() {
        Cursor resultCursor = todoDB.query(TodoContract.TodoTable.TABLE_NAME,null,null,null,null,null,null);
        if(resultCursor.getCount() > 0){
            ArrayList<ToDo> result = new ArrayList<ToDo>();
            while (resultCursor.moveToNext()){
                int id = resultCursor.getInt(resultCursor.getColumnIndex(TodoContract.TodoTable._ID));
                String title = resultCursor.getString(resultCursor.getColumnIndex(TodoContract.TodoTable.COLUMN_TODO_TITLE));
                String content = resultCursor.getString(resultCursor.getColumnIndex(TodoContract.TodoTable.COLUMN_TODO_CONTENT));
                String date = resultCursor.getString(resultCursor.getColumnIndex(TodoContract.TodoTable.COLUMN_TODO_DATE));
                String createdAt = resultCursor.getString(resultCursor.getColumnIndex(TodoContract.TodoTable.COLUMN_CREATED));
                String updatedAt = resultCursor.getString(resultCursor.getColumnIndex(TodoContract.TodoTable.COLUMN_UPDATED));
                ToDo record = new ToDo(title,content,date,createdAt,updatedAt);
                record.setId(id);
                result.add(record);
            }
            return result;
        }
        return null;
    }


}
