package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Libro;
import com.example.demo.Service.LibroService;

@RestController
@RequestMapping("/libros")
public class LibroController {

    private final LibroService libroService;

    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    // POST para agregar libros
    // JSON EJEMPLO EN POSTMAN ↓
    @PostMapping("/agregar")
    public String agregarLibro(@RequestBody Libro libro) {
        libroService.agregarLibro(libro);
        return "Libro agregado correctamente";
    }

    // GET para buscar por autor
    // Ejemplo:
    // GET http://localhost:8080/libros/autor/Gabriel%20Garcia%20Marquez
    @GetMapping("/autor/{autor}")
    public List<Libro> buscarPorAutor(@PathVariable String autor) {
        return libroService.buscarPorAutor(autor);
    }

    // GET para obtener todos los libros
    @GetMapping
    public List<Libro> obtenerTodos() {
        return libroService.obtenerTodos();
    }
}
