public class Nomina {
    private int sueldoBase;

    public double calcSueldo (double tiempo, double factorProductividad)
    {
        return sueldoBase+(tiempo*factorProductividad);
    }

}
