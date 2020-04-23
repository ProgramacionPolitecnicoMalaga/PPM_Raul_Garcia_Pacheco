package com.politecnico.Factory;

import com.politecnico.Product.DataViewer;
import com.politecnico.Product.HTMLDataViewer;

public class ConcreteCreatorHTML extends Creator{
    @Override
    public DataViewer crearDataViewer() {
        return new HTMLDataViewer();
    }
}
