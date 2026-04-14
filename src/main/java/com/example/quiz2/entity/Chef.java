package com.example.quiz2.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Chef {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String name;
    private String specialization;
    private int age;
}