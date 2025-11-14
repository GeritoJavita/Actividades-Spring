package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class EdadService {

    public String validarEdad(String nombre, int edad) {
        return edad >= 18
                ? nombre + " es mayor de edad."
                : nombre + " es menor de edad.";
    }
}
