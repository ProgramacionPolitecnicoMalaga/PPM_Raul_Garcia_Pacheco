package com.politecnico.Data;

import com.politecnico.modelo.Persona;

public class DataTransferAPersona {
    public static Persona transformar(DataTransfer datos){
        String nombre = (String) datos.get("nombre");
        String contraseña = (String) datos.get("contraseña");
        return new Persona(nombre, contraseña);
    }
}
