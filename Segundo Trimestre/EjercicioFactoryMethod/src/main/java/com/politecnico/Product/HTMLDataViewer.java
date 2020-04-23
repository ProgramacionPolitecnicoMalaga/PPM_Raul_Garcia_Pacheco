package com.politecnico.Product;

public class HTMLDataViewer implements DataViewer {

    public void showData(int año, String nacionalidad, int numeroEmpadronados)
    {
        System.out.println("<table>\n" +
                "    <tr>\n" +
                "        <th>Nacionalidad</th><th>Año</th><th>Total</th>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td>"+nacionalidad+"</td><td>"+año+"</td><td>"+numeroEmpadronados+"</td>\n" +
                "    </tr>\n" +
                "</table>");
    }
}
