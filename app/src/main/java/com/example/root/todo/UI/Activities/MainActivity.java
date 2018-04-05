package com.example.root.todo.UI.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.root.todo.DI.ContextModule;
import com.example.root.todo.DI.DaggerTodoApplicationComponent;
import com.example.root.todo.DI.DbHelperModule;
import com.example.root.todo.DI.DbManagerModule;
import com.example.root.todo.DI.TodoApplicationComponent;
import com.example.root.todo.Model.Database.DbManager;
import com.example.root.todo.Model.Database.TodoDbHelper;
import com.example.root.todo.Model.Models.ToDo;
import com.example.root.todo.R;
import com.example.root.todo.UI.Adapters.TodoAdapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    TodoApplicationComponent todoApplicationComponent;

    @Inject
    DbManager dbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        todoApplicationComponent = DaggerTodoApplicationComponent.builder().contextModule(new ContextModule(this)).dbHelperModule(new DbHelperModule()).dbManagerModule(new DbManagerModule()).build();
        todoApplicationComponent.inject(this);


        String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH mm").format(Calendar.getInstance().getTime());

        ToDo toDo = new ToDo("test1","test1111",timeStamp,timeStamp,timeStamp);
//        if (dbManager.insertTodo(toDo)){
//            Log.i("TODO", "onCreate: toDo inserted ");
//        }else {
//            Log.i("TODO", "onCreate: error ");
//        }

        ArrayList<ToDo> result = dbManager.getAllTodos();
//        for(int i = 0;i < result.size();i++){
//
//            Log.i("TODO", "onCreate: todos number >>>>>>> " + result.get(i).getToDoTitle());
//        }

        TodoAdapter todoAdapter = new TodoAdapter(result);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setAdapter(todoAdapter);
        recyclerView.setLayoutManager(layoutManager);

    }
}
