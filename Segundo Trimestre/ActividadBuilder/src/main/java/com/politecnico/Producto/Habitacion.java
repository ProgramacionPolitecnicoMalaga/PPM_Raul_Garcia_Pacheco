package com.politecnico.Producto;

import com.politecnico.Builder.TipoHabitacion;

public class Habitacion {
    private TipoHabitacion tipo;
    private boolean desayuno;
    private boolean almuerzo;
    private boolean cena;
    private boolean camaAdicional;
    private boolean parqueDeAtracciones;
    private boolean actividadesInfantiles;
    private boolean cineEnLaPlaya;
    public boolean cursoDeKiteSurf;

    public void setAlmuerzo() {
       almuerzo = true;
    }

    public void setDesayuno() {
        desayuno = true;
    }

    public void setCena() {
        cena = true;
    }

    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
    }

    public void setCamaAdicional() {
        camaAdicional = true;
    }

    public void setParqueDeAtracciones() {
        parqueDeAtracciones = true;
    }

    public void setActividadesInfantiles() {
        actividadesInfantiles = true;
    }

    public void setCineEnLaPlaya() {
        cineEnLaPlaya = true;
    }

    public void setCursoDeKiteSurf() {
       cursoDeKiteSurf = true;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "tipo=" + tipo +
                ", desayuno=" + desayuno +
                ", almuerzo=" + almuerzo +
                ", cena=" + cena +
                ", camaAdicional=" + camaAdicional +
                ", parqueDeAtracciones=" + parqueDeAtracciones +
                ", actividadesInfantiles=" + actividadesInfantiles +
                ", cineEnLaPlaya=" + cineEnLaPlaya +
                ", cursoDeKiteSurf=" + cursoDeKiteSurf +
                '}';
    }
}
