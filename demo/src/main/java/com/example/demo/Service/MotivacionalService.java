package com.example.demo.Service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class MotivacionalService {

    private final List<String> mensajes = List.of(
            "Cree en ti mismo, todo es posible.",
            "Cada día es una nueva oportunidad.",
            "El éxito es la suma de pequeños esfuerzos.",
            "No te rindas, lo mejor está por venir."
    );

    private final Random random = new Random();

    public String obtenerMensaje() {
        return mensajes.get(random.nextInt(mensajes.size()));
    }
}
