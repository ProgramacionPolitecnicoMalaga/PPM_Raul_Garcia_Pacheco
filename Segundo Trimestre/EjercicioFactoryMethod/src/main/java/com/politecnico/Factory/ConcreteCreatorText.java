package com.politecnico.Factory;


import com.politecnico.Product.DataViewer;
import com.politecnico.Product.TextDataViewer;

public class ConcreteCreatorText extends Creator {
    @Override
    public DataViewer crearDataViewer() {
        return new TextDataViewer();
    }
}
