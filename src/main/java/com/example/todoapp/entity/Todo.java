package com.example.todoapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

enum Importance {
    HIGH, MIDDLE, LOW;
}

@EqualsAndHashCode(of = {"id"})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {
    private int id;
    private String content;
    private Importance importance;
    private LocalDateTime createdTime;
    boolean isComplete;
}
