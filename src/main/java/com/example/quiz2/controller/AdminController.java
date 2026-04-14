package com.example.quiz2.controller;


import com.example.quiz2.entity.Kitchen;
import com.example.quiz2.repository.KitchenRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final KitchenRepository kitchenRepository;

    public AdminController(KitchenRepository kitchenRepository) {
        this.kitchenRepository = kitchenRepository;
    }

    // CREATE
    @PostMapping("/kitchen")
    public Kitchen create(@RequestBody Kitchen kitchen) {
        return kitchenRepository.save(kitchen);
    }

    // READ
    @GetMapping("/kitchen")
    public List<Kitchen> getAll() {
        return kitchenRepository.findAll();
    }

    // UPDATE
    @PutMapping("/kitchen/{id}")
    public Kitchen update(@PathVariable Long id, @RequestBody Kitchen kitchen) {
        kitchen.setId(id);
        return kitchenRepository.save(kitchen);
    }

    // DELETE
    @DeleteMapping("/kitchen/{id}")
    public void delete(@PathVariable Long id) {
        kitchenRepository.deleteById(id);
    }
}
