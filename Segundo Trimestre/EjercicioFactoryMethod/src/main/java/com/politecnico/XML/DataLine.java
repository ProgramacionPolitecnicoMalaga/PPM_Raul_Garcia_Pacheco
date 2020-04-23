package com.politecnico.XML;

public class DataLine {
    private int año;
    private String nacionalidad;
    private int numeroEmpadronados;

    public DataLine(int año, String nacionalidad, int numeroEmpadronados)
    {
        this.año = año;
        this.nacionalidad = nacionalidad;
        this.numeroEmpadronados = numeroEmpadronados;
    }

    public int getAño() {
        return año;
    }

    public int getNumeroEmpadronados() {
        return numeroEmpadronados;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
}
