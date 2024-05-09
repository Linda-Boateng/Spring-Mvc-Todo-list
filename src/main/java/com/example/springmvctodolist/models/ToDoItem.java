package com.example.springmvctodolist.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "todo")
@Getter
@Setter
public class ToDoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String title;

    @Column
    private boolean completed;
}
