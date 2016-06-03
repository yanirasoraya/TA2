package Lector;


import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YANI
 */
public class Lector {
    
    public static String Leer(String tag, String subtag)
    {
        
        try{
            File file=new File("XML//prueba.xml");
            DocumentBuilderFactory dbFactory= DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder= dbFactory.newDocumentBuilder();
            Document docu= dbBuilder.parse(file);
            docu.getDocumentElement().normalize();

            NodeList nList= docu.getElementsByTagName(tag);
            Node nNode= nList.item(0);
            
            Element e=  (Element) nNode;
            return e.getElementsByTagName(subtag).item(0).getTextContent();
        }
        catch(Exception e)
        {            
            e.printStackTrace();
        }
        
        return null;
    }
    
}
