package com.maximo.zoologico.repository; // Ajuste para o seu pacote real

import com.maximo.zoologico.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}


