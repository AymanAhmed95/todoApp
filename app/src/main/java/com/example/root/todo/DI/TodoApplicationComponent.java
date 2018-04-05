package com.example.root.todo.DI;



import com.example.root.todo.UI.Activities.MainActivity;

import dagger.Component;

@Component(modules = {ContextModule.class,DbHelperModule.class,DbManagerModule.class})
public interface TodoApplicationComponent {


    // if you don't want to use inject and @inject annotation then you may make getter methods for your dependencies then call them when you need a dependency
    // you should specify class you want to inject into, you should make a method for each class
    void inject(MainActivity mainActivity);
}
