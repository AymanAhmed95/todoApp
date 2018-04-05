package com.example.root.todo.Model.Models;

/**
 * Created by root on 3/26/18.
 */

public class ToDo {
    private int id;

    private String toDoTitle;

    private String toDoContent;
    private String toDoDate;
    private String createdAt;
    private String updatedAt;
    public ToDo(String toDoTitle, String toDoContent, String toDoDate, String createdAt, String updatedAt) {
        this.toDoTitle = toDoTitle;
        this.toDoContent = toDoContent;
        this.toDoDate = toDoDate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToDoTitle() {
        return toDoTitle;
    }

    public void setToDoTitle(String toDoTitle) {
        this.toDoTitle = toDoTitle;
    }

    public String getToDoContent() {
        return toDoContent;
    }

    public void setToDoContent(String toDoContent) {
        this.toDoContent = toDoContent;
    }

    public String getToDoDate() {
        return toDoDate;
    }

    public void setToDoDate(String toDoDate) {
        this.toDoDate = toDoDate;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "toDoTitle='" + toDoTitle + '\'' +
                '}';
    }
}
