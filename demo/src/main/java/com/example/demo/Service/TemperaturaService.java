package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class TemperaturaService {
    
     public double convertirCelsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
