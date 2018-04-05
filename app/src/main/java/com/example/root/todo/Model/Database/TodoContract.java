package com.example.root.todo.Model.Database;

import android.provider.BaseColumns;

/**
 * Created by root on 3/27/18.
 */

public class TodoContract {

    public class TodoTable implements BaseColumns{
        public static final String TABLE_NAME = "todo";
        public static final String COLUMN_TODO_TITLE = "title";
        public static final String COLUMN_TODO_CONTENT = "content";
        public static final String COLUMN_TODO_DATE = "date";
        public static final String COLUMN_CREATED = "created_at";
        public static final String COLUMN_UPDATED = "updated_at";

    }
}
