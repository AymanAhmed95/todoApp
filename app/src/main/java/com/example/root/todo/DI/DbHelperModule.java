package com.example.root.todo.DI;


import android.content.Context;

import com.example.root.todo.Model.Database.TodoDbHelper;

import dagger.Module;
import dagger.Provides;

@Module
public class DbHelperModule {

    @Provides
    TodoDbHelper provideDbHelper(Context context){
        return new TodoDbHelper(context);
    }
}
