package com.maximo.zoologico.service;

import com.maximo.zoologico.model.Animal;
import com.maximo.zoologico.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    public Animal getAnimalById(Long id) {
        return animalRepository.findById(id).orElse(null);
    }

    public Animal createAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    public Animal updateAnimal(Long id, Animal updatedAnimal) {
        if (animalRepository.existsById(id)) {
            updatedAnimal.setId(id);
            return animalRepository.save(updatedAnimal);
        }
        return null;
    }

    public void deleteAnimal(Long id) {
        animalRepository.deleteById(id);
    }
}

