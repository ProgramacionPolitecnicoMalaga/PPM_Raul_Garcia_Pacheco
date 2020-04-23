package com.politecnico;

import com.politecnico.Factory.ConcreteCreatorHTML;
import com.politecnico.Factory.ConcreteCreatorText;
import com.politecnico.XML.DataLine;
import com.politecnico.XML.XMLReader;
import io.github.cdimascio.dotenv.Dotenv;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        XMLReader reader = new XMLReader();
        reader.read();
        reader.write();
    }
}
