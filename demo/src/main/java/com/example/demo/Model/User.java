package com.example.demo.Model;

public class User {
    private String nombre;
    private String correo;
    private int edad;


    

    public User(String nombre, String correo, int edad) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
    }
    public User(){}
    
    
    public String getNombre() {
        return nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
