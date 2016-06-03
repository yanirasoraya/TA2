package Lector;


import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;





public class Lector {
	
	public static String leer(String tag, String subtag){

	      try {	
	         File inputFile = new File("xml//prueba.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         
	         NodeList nList = doc.getElementsByTagName(tag);
	         Node nNode = nList.item(0);
	         
	         Element e = (Element) nNode;
	            return e.getElementsByTagName(subtag).item(0).getTextContent();
	         
	      } catch (Exception e) {
                  e.printStackTrace();
              }
		return null;

	}
	 
}
