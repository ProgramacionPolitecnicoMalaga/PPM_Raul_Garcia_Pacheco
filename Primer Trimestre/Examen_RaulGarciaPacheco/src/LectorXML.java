import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
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

public class LectorXML {
    private NodeList nodeList;
    private NodeList nodeListChild;
    private int nodeIndex = 0;
    private int nodeIndexChild = 0;

    public int getNodeIndex() {
        return nodeIndex;
    }

    public int getNodeIndexChild() {
        return nodeIndexChild;
    }

    public NodeList getNodeList() {
        return nodeList;
    }

    public NodeList getNodeListChild() {
        return nodeListChild;
    }

    public LectorXML(String dir){

        System.out.println(dir);
        try {
            File inputFile = new File(dir  + File.separator);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            XPath xPath = XPathFactory.newInstance().newXPath();
            String xpathExpr = "/establecimientos/establecimiento";
            nodeList = (NodeList) xPath.compile(xpathExpr).evaluate(doc, XPathConstants.NODESET);
            File inputFileChild = new File("C:\\Users\\rauli\\Desktop\\Módulo\\Programación\\Examen_RaulGarciaPacheco\\src\\establecimientos.xml" + File.separator);
            DocumentBuilderFactory dbFactoryChild = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilderChild = dbFactory.newDocumentBuilder();
            Document docChild = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            XPath xPathChild = XPathFactory.newInstance().newXPath();
            String xpathChild = "/establecimientos/establecimiento/plato";
            nodeListChild = (NodeList) xPath.compile(xpathChild).evaluate(doc, XPathConstants.NODESET);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean hasNextChild()
    {
        return nodeIndexChild < nodeListChild.getLength();
    }

    public boolean hasNext(){
        return nodeIndex < nodeList.getLength();
    }

    public Plato nextChild()
    {
        Element elementNodeChild = (Element) nodeListChild.item(nodeIndexChild);
        Plato plato = new Plato(elementNodeChild.getAttribute("nombre"));
        nodeIndexChild++;
        return  plato;
    }

    public Establecimiento next(){
        Element elementNode = (Element) nodeList.item(nodeIndex);
        Establecimiento establecimiento = new Establecimiento(elementNode.getAttribute("nombre"), elementNode.getAttribute("ciudad"), Double.parseDouble(elementNode.getAttribute("latitud")), Double.parseDouble(elementNode.getAttribute("longitud")));

        nodeIndex++;
        return establecimiento;
    }
}
