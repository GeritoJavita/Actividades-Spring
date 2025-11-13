package com.example.demo.Controller;

import com.example.demo.Service.TemperaturaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/temperatura")
public class TemperaturaController {

    private final TemperaturaService temperaturaService;
    public TemperaturaController(TemperaturaService temperaturaService) {
        this.temperaturaService = temperaturaService;
    }

    @GetMapping("/convertir")
    public String convertir(@RequestParam double celsius) {
        double fahrenheit = temperaturaService.convertirCelsiusAFahrenheit(celsius);
        return celsius + " °C = " + fahrenheit + " °F";
    }
}
