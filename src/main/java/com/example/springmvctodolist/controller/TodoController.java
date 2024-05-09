package com.example.springmvctodolist.controller;

import com.example.springmvctodolist.models.ToDoItem;
import com.example.springmvctodolist.repositories.TodoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class TodoController {

    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/todos")
    public ResponseEntity<?> getAllTodos(){
        todoRepository.findAll();
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PostMapping("/todo/add")
    public ResponseEntity<?> addTodo(@RequestBody ToDoItem item){
        todoRepository.save(item);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

    @PutMapping("/todo/complete/{id}")
    public  ResponseEntity<?> updateTodo(@PathVariable("id") Long id){
        Optional<ToDoItem> todoExist = todoRepository.findById(id);
        if(todoExist.isEmpty()) throw new IllegalArgumentException("Todo not found");
        ToDoItem todo = todoExist.get();
        todo.setCompleted(true);
        todoRepository.save(todo);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
