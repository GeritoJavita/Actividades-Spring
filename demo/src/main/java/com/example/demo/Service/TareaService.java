package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Tarea;

@Service
public class TareaService {
    private List<Tarea> tareas = new ArrayList<>();
    private int contador = 1;

    public void crearTarea(Tarea tarea) {
        tarea.setId(contador++);
        tareas.add(tarea);
    }

    public List<Tarea> listarTareas() {
        return tareas;
    }

    public void actualizarTarea(int id, Tarea tarea) {
        for (Tarea t : tareas) {
            if (t.getId() == id) {
                t.setTitulo(tarea.getTitulo());
                t.setDescripcion(tarea.getDescripcion());
                t.setCompletada(tarea.isCompletada());
            }
        }
    }

    public void eliminarTarea(int id) {
        tareas.removeIf(t -> t.getId() == id);
    }
}
