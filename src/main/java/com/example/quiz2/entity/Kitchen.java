package com.example.quiz2.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Kitchen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String restaurantName;
    private Long chefId;
    private int capacity;
}