package com.example.quiz2.controller;

import com.example.quiz2.entity.Kitchen;
import com.example.quiz2.repository.KitchenRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kitchen")
public class KitchenController {

    private final KitchenRepository kitchenRepository;

    public KitchenController(KitchenRepository kitchenRepository) {
        this.kitchenRepository = kitchenRepository;
    }

    @GetMapping
    public List<Kitchen> getAll() {
        return kitchenRepository.findAll();
    }
}