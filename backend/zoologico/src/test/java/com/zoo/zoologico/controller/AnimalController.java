package com.maximo.zoologico.controller;

import com.maximo.zoologico.model.Animal;
import com.maximo.zoologico.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/animais")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping
    public List<Animal> getAll() {
        return animalService.getAllAnimals();
    }

    @GetMapping("/{id}")
    public Animal getById(@PathVariable Long id) {
        return animalService.getAnimalById(id);
    }

    @PostMapping
    public Animal create(@RequestBody Animal animal) {
        return animalService.createAnimal(animal);
    }

    @PutMapping("/{id}")
    public Animal update(@PathVariable Long id, @RequestBody Animal animal) {
        return animalService.updateAnimal(id, animal);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        animalService.deleteAnimal(id);
    }
}


