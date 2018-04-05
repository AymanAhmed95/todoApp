package com.example.root.todo.UI.Adapters;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.root.todo.Model.Models.ToDo;
import com.example.root.todo.R;

import java.util.ArrayList;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.TodoViewHolder> {

    ArrayList<ToDo> toDos;

    public TodoAdapter(ArrayList<ToDo> toDos) {
        this.toDos = toDos;
    }

    @Override
    public TodoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View todoCardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.todo_layout,null);
        TodoViewHolder holder = new TodoViewHolder(todoCardView);

        return holder;
    }
    @Override
    public void onBindViewHolder(TodoViewHolder holder, int position) {
        ToDo toDo = toDos.get(position);
        holder.title.setText(toDo.getToDoTitle());
        holder.content.setText(toDo.getToDoContent());
        holder.date.setText(toDo.getToDoDate());
    }

    @Override
    public int getItemCount() {
        return toDos.size();
    }

    public class TodoViewHolder extends RecyclerView.ViewHolder{

        TextView title,content,date;

        public TodoViewHolder(View itemView) {
            super(itemView);
            title  = itemView.findViewById(R.id.todo_title);
            content = itemView.findViewById(R.id.todo_content);
            date = itemView.findViewById(R.id.todo_date);
        }
    }


}
