package com.zoo.zoologico.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping("/api/teste")
    public String testarAPI() {
        return "API do Zoológico está funcionando!";
    }
}
