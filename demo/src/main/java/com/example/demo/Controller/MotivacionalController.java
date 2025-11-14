package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.MotivacionalService;

@RestController
@RequestMapping("/motivacion")
public class MotivacionalController {

    private final MotivacionalService motivacionalService;

    public MotivacionalController(MotivacionalService motivacionalService) {
        this.motivacionalService = motivacionalService;
    }

    // Ejemplo:
    // GET http://localhost:8080/motivacion/mensaje
    @GetMapping("/mensaje")
    public String obtenerMensaje() {
        return motivacionalService.obtenerMensaje();
    }
}
