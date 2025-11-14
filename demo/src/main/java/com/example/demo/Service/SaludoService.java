package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {
    public String saludar(String nombre) {
        return "Hola " + nombre + ", ¡bienvenido!";
    }
}
