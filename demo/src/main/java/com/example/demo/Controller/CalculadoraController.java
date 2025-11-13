package com.example.demo.Controller;

import com.example.demo.Service.CalculadoraService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    private final CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @GetMapping
    public String calcular(@RequestParam double a,
                           @RequestParam double b,
                           @RequestParam String operacion) {

        double resultado = calculadoraService.operar(a, b, operacion);
        return "Resultado de la " + operacion + ": " + resultado;
    }
}
