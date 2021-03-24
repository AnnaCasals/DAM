package codi;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLIntern {
		public static void intern(ArrayList<File> lista) {
			try {
				DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
				
				//Elemento raíz
				Document doc = docBuilder.newDocument();
				Element rootElement = doc.createElement("arxius");
				doc.appendChild(rootElement);
				
				//Elements
				Element b;
				for(int i = 0; i < lista.size(); i++) {
					b = doc.createElement("arxiu" + i);
					b.setTextContent(lista.get(i).getAbsolutePath());
					rootElement.appendChild(b);
				}
				
				
				//Se escribe el contenido del XML en un archivo
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(new File("arxiu.xml"));
				transformer.transform(source, result);
				
			} catch (ParserConfigurationException pce) {
				pce.printStackTrace();
			} catch (TransformerException tfe) {
				tfe.printStackTrace();
			}
		}
	}

