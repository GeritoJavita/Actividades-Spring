package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public double operar(double a, double b, String operacion) {
        // Esto nos mostrará en la consola qué valor exacto llega desde Postman
        System.out.println("Operación recibida: [" + operacion + "]");

        return switch (operacion.toLowerCase().trim()) {
            case "suma" -> a + b;
            case "resta" -> a - b;
            case "multiplicacion" -> a * b;
            case "division" -> (b != 0) ? a / b : Double.NaN;
            default -> {
                System.out.println("⚠️ Operación no reconocida: " + operacion);
                yield 0;
            }
        };
    }
}
