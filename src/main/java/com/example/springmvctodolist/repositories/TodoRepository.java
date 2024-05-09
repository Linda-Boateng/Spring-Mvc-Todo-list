package com.example.springmvctodolist.repositories;

import com.example.springmvctodolist.models.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<ToDoItem,Long> {}
