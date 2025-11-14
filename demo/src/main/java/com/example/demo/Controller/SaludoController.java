package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.SaludoService;
// EndPoint http://localhost:8080/saludo?nombre=Gerito
@RestController
@RequestMapping("/saludo")
public class SaludoController {

    private final SaludoService saludoService;
    public SaludoController(SaludoService saludoService) {
        this.saludoService = saludoService;
    }

    @GetMapping
    public String saludar(@RequestParam String nombre) {
        return saludoService.saludar(nombre);
    }
}
