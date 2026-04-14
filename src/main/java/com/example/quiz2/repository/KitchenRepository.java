package com.example.quiz2.repository;

import com.example.quiz2.entity.Kitchen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KitchenRepository extends JpaRepository<Kitchen, Long> {
}