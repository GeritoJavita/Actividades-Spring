package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EdadService;

@RestController
@RequestMapping("/edad")
public class EdadController {

    private final EdadService edadService;

    public EdadController(EdadService edadService) {
        this.edadService = edadService;
    }

    // Ejemplo:
    // GET http://localhost:8080/edad/validar?nombre=Juan&edad=17
    @GetMapping("/validar")
    public String validarEdad(@RequestParam String nombre,
                              @RequestParam int edad) {
        return edadService.validarEdad(nombre, edad);
    }
}
