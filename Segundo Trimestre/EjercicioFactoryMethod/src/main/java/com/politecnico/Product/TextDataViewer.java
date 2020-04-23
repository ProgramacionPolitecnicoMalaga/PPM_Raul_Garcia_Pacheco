package com.politecnico.Product;

public class TextDataViewer implements DataViewer {

    public void showData(int año, String nacionalidad, int numeroEmpadronados)
    {
        System.out.println("El total de empadronados en " +año+ " procedentes de "+nacionalidad+" fue de "+numeroEmpadronados+" personas.");
    }
}
