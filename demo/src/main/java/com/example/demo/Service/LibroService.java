package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Libro;

@Service
public class LibroService {

    private final List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public List<Libro> buscarPorAutor(String autor) {
        return libros.stream()
                .filter(l -> l.getAutor().equalsIgnoreCase(autor))
                .toList();
    }

    public List<Libro> obtenerTodos() {
        return libros;
    }
}
