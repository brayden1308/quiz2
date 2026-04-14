package com.example.quiz2.controller;


import com.example.quiz2.entity.Chef;
import com.example.quiz2.repository.ChefRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chef")
public class ChefController {

    private final ChefRepository chefRepository;
   //crud funcional
    public ChefController(ChefRepository chefRepository) {
        this.chefRepository = chefRepository;
    }

    // Ver todos los chefs
    @GetMapping
    public List<Chef> getAll() {
        return chefRepository.findAll();
    }

    // Simula /chef/me
    @GetMapping("/me")
    public Chef getMe() {
        return chefRepository.findAll().stream().findFirst().orElse(null);
    }
}