package com.example.todoserver.controller;

import com.example.todoserver.model.TodoResponse;
import com.example.todoserver.service.TodoService;
import lombok.AllArgsConstructor;
import lombok.Generated;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping("/")
public class TodoController {

    private final TodoService todoService;

    @PostMapping
    public ResponseEntity<TodoResponse> create(){
        System.out.println("CREATE");
        return null;
    }

    @PostMapping("{id}")
    public ResponseEntity<TodoResponse> readOne(){
        System.out.println("READ ONE");
        return null;
    }

    @GetMapping
    public ResponseEntity<List<TodoResponse>> realAll() {
        System.out.println("READ ALL");
        return null;
    }

    @PatchMapping
    public ResponseEntity<TodoResponse> update(){
        System.out.println("UPDATE");
        return null;
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteOne(){
        System.out.println("DELETE");
        return null;
    }

    @DeleteMapping
    public ResponseEntity<?> deleteAll(){
        System.out.println("DELETE ALL");
        return null;
    }
}
