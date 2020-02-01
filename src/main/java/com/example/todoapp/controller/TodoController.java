package com.example.todoapp.controller;

import com.example.todoapp.entity.Todo;
import com.example.todoapp.repository.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class TodoController {

    private TodoRepository todoRepository;

    @GetMapping("/unfinished")
    public List<Todo> getUnfinished() {
        return todoRepository.getUnfinished();
    }

    @GetMapping("/finished")
    public List<Todo> getFinished() {
        return todoRepository.getFinished();
    }

    @PostMapping("/unfinished")
    public void addUnfinished(@RequestBody Todo todo){
        todoRepository.addToUnfinished(todo);
    }

    @DeleteMapping("/unfinished")
    public void deleteUnfinished(@RequestBody Todo todo){
        todoRepository.deleteUnfinished(todo);
    }

    @DeleteMapping("/finished")
    public void deleteFinished(@RequestBody Todo todo){
        todoRepository.deleteFinished(todo);
    }

    @PutMapping("/unfinished")
    public void finishUnfinished(@RequestBody Todo todo){
        todoRepository.finish(todo);
    }

}
