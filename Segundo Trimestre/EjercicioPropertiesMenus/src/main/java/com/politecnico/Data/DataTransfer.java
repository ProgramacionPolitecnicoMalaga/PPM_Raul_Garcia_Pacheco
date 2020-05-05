package com.politecnico.Data;


import java.util.TreeMap;

public class DataTransfer{
    public TreeMap<String,Object> datos = new TreeMap<>();

    public void put(String clave, Object objeto){
        datos.put(clave,objeto);
    }

    public Object get(String clave){
        return datos.get(clave);
    }
}
