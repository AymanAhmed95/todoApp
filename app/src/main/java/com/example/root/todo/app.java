package com.example.root.todo;

import android.app.Application;

import com.example.root.todo.DI.ContextModule;
import com.example.root.todo.DI.DaggerTodoApplicationComponent;
import com.example.root.todo.DI.DbHelperModule;
import com.example.root.todo.DI.DbManagerModule;
import com.example.root.todo.DI.TodoApplicationComponent;


public class app extends Application {

    TodoApplicationComponent todoApplicationComponent;
//    @Override
//    public void onCreate() {
//        super.onCreate();
//
//        todoApplicationComponent = DaggerTodoApplicationComponent.builder().contextModule(new ContextModule(this)).dbHelperModule(new DbHelperModule()).dbManagerModule(new DbManagerModule()).build();
//        todoApplicationComponent.inject(this);
//
//
//    }
}
