package com.politecnico.Builder;

import com.politecnico.Producto.Habitacion;

public class HabitacionBuilder {
    private Habitacion habitacion;

    public HabitacionBuilder()
    {
        habitacion = new Habitacion();
    }

    public HabitacionBuilder setTipo(TipoHabitacion tipo)
    {
        habitacion.setTipo(tipo);
        return this;
    }

    public HabitacionBuilder addDesayuno()
    {
        habitacion.setDesayuno();
        return this;
    }

    public HabitacionBuilder addAlmuerzo()
    {
        habitacion.setAlmuerzo();
        return this;
    }

    public HabitacionBuilder addCena()
    {
        habitacion.setCena();
        return this;
    }

    public HabitacionBuilder addCamaAdicional()
    {
        habitacion.setCamaAdicional();
        return this;
    }

    public HabitacionBuilder addParqueDeAtracciones()
    {
        habitacion.setParqueDeAtracciones();
        return this;
    }

    public HabitacionBuilder addActividadesInfantiles()
    {
        habitacion.setActividadesInfantiles();
        return this;
    }

    public HabitacionBuilder addCineEnLaPlaya()
    {
        habitacion.setCineEnLaPlaya();
        return this;
    }

    public HabitacionBuilder addCursoDeKiteSurf()
    {
        habitacion.setCursoDeKiteSurf();
        return this;
    }

    public Habitacion getResultado()
    {
        return habitacion;
    }
}
