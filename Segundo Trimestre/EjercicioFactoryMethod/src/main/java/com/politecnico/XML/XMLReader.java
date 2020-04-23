package com.politecnico.XML;

import com.politecnico.Factory.Creator;
import com.politecnico.Product.DataViewer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.crypto.Data;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class XMLReader {

    public ArrayList<DataLine> arrayInformacion = new ArrayList<>();

    public void read()
    {
        String dir = System.getProperty("user.dir");
        System.out.println(dir);
        try {
            File inputFile = new File("C:\\Users\\raulgp19\\IdeaProjects\\EjercicioFactoryMethod\\src\\main\\java\\com\\politecnico\\XML\\Informacion_Nacionalidades.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
		/*
		    DocumentBuilder.parse(file) puede generar:
		        IOException  - Error de lectura del archivo
                SAXException - Error de parseo
                IllegalArgumentException  - Cuando el archivo "file" es null
		*/
            doc.getDocumentElement().normalize();
		/*
		    Elimina nodos vacíos y combina adyacentes en caso de que los hubiera
		*/

            NodeList nl = doc.getDocumentElement().getChildNodes();
            /* Document.getDocumentElement() devuelve el nodo raíz */

            for (int i = 0; i < nl.getLength(); i++) {
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    Element el = (Element) nl.item(i);
                    String nacionalidad = nl.item(i).getAttributes().getNamedItem("Nacionalidad").getNodeValue();
                    int año = Integer.parseInt(nl.item(i).getAttributes().getNamedItem("Año").getNodeValue());
                    int numeroEmpadronados = Integer.parseInt(nl.item(i).getAttributes().getNamedItem("Número_de_empadronados").getNodeValue());
                    DataLine a = new DataLine(año, nacionalidad, numeroEmpadronados);
                    arrayInformacion.add(a);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }


    }

    public  void write()
    {
        Creator c = new Creator();
        for(int i = 0; i<arrayInformacion.size(); i++)
        {
            c.showData(arrayInformacion.get(i).getAño(), arrayInformacion.get(i).getNacionalidad(), arrayInformacion.get(i).getNumeroEmpadronados());
        }
    }
}
