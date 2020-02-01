package com.example.todoapp.repository;

import com.example.todoapp.entity.Todo;
import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

@Component
public class TodoRepository {
    private List<Todo> unfinished = new LinkedList<>();
    private List<Todo> finished = new LinkedList<>();

    private int autoGenNum = 0;

    public void addToUnfinished(Todo todo){
        todo.setId(++autoGenNum);
        todo.setCreatedTime(LocalDateTime.now());
        unfinished.add(todo);
    }

    public void finish(Todo todo){
        Todo finded = null;
        for (Todo t : unfinished) {
            if (t.getId() == todo.getId()) {
                finded = t;
                break;
            }
        }
        unfinished.remove(finded);
        finished.add(finded);
    }

    public List<Todo> getUnfinished() {
        return unfinished;
    }

    public List<Todo> getFinished() {
        return finished;
    }

    public void deleteUnfinished(Todo todo){
        unfinished.remove(todo);
    }

    public void deleteFinished(Todo todo){
        finished.remove(todo);
    }


}
