package com.example.quiz2.repository;

import com.example.quiz2.entity.Chef;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChefRepository extends JpaRepository<Chef, Long> {
    Optional<Chef> findByUsername(String username);
}