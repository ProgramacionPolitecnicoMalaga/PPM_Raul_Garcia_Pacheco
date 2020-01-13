import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class XML {

    public void leerXML(String nombreArchivo, ArrayList cursos)
    {
        try {
            File inputFile = new File(nombreArchivo + File.separator);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            XPath xPath = XPathFactory.newInstance().newXPath();
            String xPathExpr = "/curso/asignatura";
            NodeList nodeList = (NodeList) xPath.compile(xPathExpr).evaluate(doc, XPathConstants.NODESET);

            for (int i = 0; i<nodeList.getLength(); i++)
            {
               Element element = (Element) nodeList.item(i);
               Curso curso = (Curso) element;
               cursos.add(curso);
                String nombre= element.getAttribute("nombre");
                curso.setNombre(nombre);
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
    }
}
