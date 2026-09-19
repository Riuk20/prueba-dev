package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/saludo")
    public String enviarSaludo() {
        return "¡Hola! Este es un saludo desde tu controlador REST en Spring Boot.";
    }
}