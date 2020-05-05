package com.politecnico.Builder;

import com.politecnico.Producto.Habitacion;

public class HabitacionDirector {
    private HabitacionBuilder builder;

    public HabitacionDirector(HabitacionBuilder builder)
    {
        this.builder = builder;
    }

    public Habitacion packBasico()
    {
        return builder.setTipo(TipoHabitacion.Simple)
                .addDesayuno()
                .getResultado();
    }

    public Habitacion packRomance()
    {
        return builder.setTipo(TipoHabitacion.Doble)
                .addCena()
                .getResultado();
    }

    public Habitacion packFamiliar()
    {
        return builder.setTipo(TipoHabitacion.Doble)
                .addCamaAdicional()
                .addDesayuno()
                .addAlmuerzo()
                .addCena()
                .addParqueDeAtracciones()
                .addActividadesInfantiles()
                .addCineEnLaPlaya()
                .getResultado();
    }

    public Habitacion packPadresRelajados()
    {
        return builder.setTipo(TipoHabitacion.Doble)
                .addCamaAdicional()
                .addDesayuno()
                .addAlmuerzo()
                .addCena()
                .addActividadesInfantiles()
                .addCursoDeKiteSurf()
                .addCineEnLaPlaya()
                .getResultado();
    }

    public Habitacion packDeluxe()
    {
        return builder.setTipo(TipoHabitacion.Suite)
                .addDesayuno()
                .addAlmuerzo()
                .addCena()
                .addCursoDeKiteSurf()
                .addCineEnLaPlaya()
                .getResultado();
    }

    public Habitacion packDeluxeFamiliar()
    {
        return builder.setTipo(TipoHabitacion.Suite)
                .addCamaAdicional()
                .addDesayuno()
                .addAlmuerzo()
                .addCena()
                .addCursoDeKiteSurf()
                .addParqueDeAtracciones()
                .addActividadesInfantiles()
                .addCineEnLaPlaya()
                .getResultado();
    }
}
