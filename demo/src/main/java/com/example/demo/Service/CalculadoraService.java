package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    


    public double operar(double a, double b, String operacion) {
        return switch (operacion.toLowerCase()) {
            case "suma" -> a + b;
            case "resta" -> a - b;
            case "multiplicacion" -> a * b;
            case "division" -> b != 0 ? a / b : Double.NaN;
            default -> 0;
        };
    }
}

