package codi;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class CrearXML {
	public static void crear(int p, File r) {
		float l = r.length();
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			
			//Elemento raíz
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("arxius");
			doc.appendChild(rootElement);
			
			//Primer elemento
			Element elemento1 = doc.createElement("parts");
			elemento1.setTextContent(Integer.toString(p));
			rootElement.appendChild(elemento1);
			
			//Segundo elemento
			Element elemento2 = doc.createElement("grandària");
			elemento2.setTextContent("" + l);
			rootElement.appendChild(elemento2);
			
			//Se escribe el contenido del XML en un archivo
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(r + ".xml"));
			transformer.transform(source, result);
			
		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}
	}
}
