package com.example.root.todo.Model.Database;

import com.example.root.todo.Model.Models.ToDo;

import java.util.ArrayList;

/**
 * Created by root on 3/27/18.
 */

public interface DbManagerInterface {


    boolean insertTodo(ToDo toDo);

    boolean updateTodo(ToDo toDo);

    boolean deleteTodo(ToDo toDo);

    ArrayList<ToDo> getAllTodos();

}
