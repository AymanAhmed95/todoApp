package com.example.root.todo.DI;


import com.example.root.todo.Model.Database.DbManager;
import com.example.root.todo.Model.Database.TodoDbHelper;

import dagger.Module;
import dagger.Provides;

@Module
public class DbManagerModule {

    @Provides
    DbManager provideDbManager(TodoDbHelper todoDbHelper){
        return new DbManager(todoDbHelper);
    }
}
