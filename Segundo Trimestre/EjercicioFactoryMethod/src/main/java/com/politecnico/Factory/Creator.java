package com.politecnico.Factory;

import com.politecnico.Product.DataViewer;
import io.github.cdimascio.dotenv.Dotenv;

;

public class Creator {
    Dotenv dotenv = Dotenv.configure().load();


    public void showData(int año, String nacionalidad, int numeroEmpadronados)
    {

        DataViewer d = crearDataViewer();
        d.showData(año, nacionalidad, numeroEmpadronados);
    }

    public DataViewer crearDataViewer()
    {
        if(dotenv.get("viewer").equals("html"))
        {
            ConcreteCreatorHTML a = new ConcreteCreatorHTML();
            return a.crearDataViewer();
        }
        else if(dotenv.get("viewer").equals("text"))
        {
            ConcreteCreatorText a = new ConcreteCreatorText();
            return a.crearDataViewer();
        }
        return null;
    }
}
