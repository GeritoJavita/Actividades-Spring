package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class MonedaService {

    private final double TASA_USD_A_COP = 4300; // Tasa fija

    public double convertir(double dolares) {
        return dolares * TASA_USD_A_COP;
    }
}
