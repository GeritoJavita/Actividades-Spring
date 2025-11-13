package com.example.demo.Controller;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User registrar(@RequestBody User user) {
        return userService.registrarUsuario(user);
    }

    @GetMapping
    public List<User> listar() {
        return userService.listarUsuarios();
    }

    @DeleteMapping("/{correo}")
    public String eliminar(@PathVariable String correo) {
        boolean eliminado = userService.eliminarUsuario(correo);
        return eliminado ? "Usuario eliminado." : "Usuario no encontrado.";
    }
}
