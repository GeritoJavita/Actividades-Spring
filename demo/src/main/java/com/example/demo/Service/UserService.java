package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Model.User;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    
    private List<User> usuarios = new ArrayList<>();

    public User registrarUsuario(User user){
        usuarios.add(user);
        return user;
    }

    public List<User> listarUsuarios(){
        return usuarios;
    }

    public boolean eliminarUsuario(String correo) {
        return usuarios.removeIf(u -> u.getCorreo().equalsIgnoreCase(correo));
    }
}
