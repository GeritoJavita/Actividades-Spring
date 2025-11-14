package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Tarea;
import com.example.demo.Service.TareaService;


//endpoint http://localhost:8080/tareas/crear
//{
 // "id": 2,
  //"titulo": "barrer",
  //"descripcion": "Hogar neza",
  //"completada": false
//}

@RestController

@RequestMapping("/tareas")
public class TareaController {

    private final TareaService tareaService;
    public TareaController(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    @PostMapping("/crear")
    public void crearTarea(@RequestBody Tarea tarea) {
        tareaService.crearTarea(tarea);
    }

    @GetMapping("/listar")
    public List<Tarea> listarTareas() {
        return tareaService.listarTareas();
    }

    @PutMapping("/actualizar/{id}")
    public void actualizarTarea(@PathVariable int id, @RequestBody Tarea tarea) {
        tareaService.actualizarTarea(id, tarea);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarTarea(@PathVariable int id) {
        tareaService.eliminarTarea(id);
    }
}
