package com.politecnico.modelo;

public class Persona {
    private String nombre;
    private String contraseña;

    public Persona(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;

    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
