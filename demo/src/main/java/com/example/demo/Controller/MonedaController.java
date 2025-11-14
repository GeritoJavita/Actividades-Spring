package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.MonedaService;

@RestController
@RequestMapping("/moneda")
public class MonedaController {

    private final MonedaService monedaService;

    public MonedaController(MonedaService monedaService) {
        this.monedaService = monedaService;
    }

    // Ejemplo:
    // GET http://localhost:8080/moneda/convertir?usd=10
    @GetMapping("/convertir")
    public String convertir(@RequestParam double usd) {
        double cop = monedaService.convertir(usd);
        return usd + " USD equivalen a " + cop + " COP";
    }
}
