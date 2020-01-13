import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CrunchifyCSVtoArrayList {
    public void leerCSV(String dir, ArrayList<Plato> platos){

        BufferedReader crunchifyBuffer = null;

        try {
            String crunchifyLine;
            crunchifyBuffer = new BufferedReader(new FileReader(dir));


           while ((crunchifyLine = crunchifyBuffer.readLine()) != null) {

               crunchifyCSVtoArrayList(crunchifyLine, platos);

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (crunchifyBuffer != null) crunchifyBuffer.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    // Utility which converts CSV to ArrayList using Split Operation
    public static ArrayList<String> crunchifyCSVtoArrayList(String crunchifyCSV, ArrayList<Plato> platos) {
        ArrayList<String> crunchifyResult = new ArrayList<String>();

        if (crunchifyCSV != null) {
            String[] splitData = crunchifyCSV.split(";");
            for (int i = 0; i < splitData.length; i++) {
                if (!(splitData[i] == null) || !(splitData[i].length() == 0)) {
                    crunchifyResult.add(splitData[i].trim());
                    platos.add(new Plato());

                    if(platos.get(i).getNombre() == null)
                    {
                       platos.get(i).setNombre(splitData[i]);
                    }
                    if (platos.get(i).getDescripcion() == null)
                    {
                        platos.get(i).setDescripcion(splitData[i]);
                    }
                    if(platos.get(i).getCiudad() == null)
                    {
                        platos.get(i).setCiudad(splitData[i]);
                    }
                }
            }
        }

        return crunchifyResult;
    }

}