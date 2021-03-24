package codi;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import interfaces.FinestraDividir;

public class UnirCodigo {

	public static void unir(ArrayList<File> lista) throws IOException {
		File a;
		int char1;
		String b;
		int p = lista.size() - 1;
		//Ruta de l'arxiu en la primera posició de la llista
		String g = lista.get(1).getAbsolutePath();
		
		//Crea la variable per a poder llegir d'un arxiu
		FileInputStream leer;
		//Crea la variable per a poder escriure en l'arxiu "g + junt", si no existeix el crea
		FileOutputStream escribir = new FileOutputStream(g + "junt");
		
		//Ho faig així, perquè no sé com es llig un XML

		llegir(lista.get(0), p);
			codi.XMLIntern.intern(lista);
			//Bucle per a poder llegir diferents arxius
			for(int i = 1; i < lista.size(); i++) {
				//Arxiu que llegim
				a = lista.get(i);
				b = a.getAbsolutePath();
				leer = new FileInputStream(b);
			
				//Mentre queden bytes per llegir i els escribim en l'arxiu "g+junt"
				char1 = leer.read();
				while(char1 != -1) {
					escribir.write(char1);
					char1 = leer.read();
				}
			
				//Tanquem la lectura de l'arxiu(tanquem l'arxiu)
				leer.close();
			}
		
			//Tanquem l'escriptura en l'arxiu(tanquem l'arxiu)
			escribir.close();
		 
}
	
	
	public static boolean llegir(File f, int parts) {
		boolean luzVerde = false;
		File file = f;
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = (Document) dBuilder.parse(file);
			NodeList nList = ((Element) doc).getElementsByTagName("arxius");
			Node nNode = (Node) nList.item(0);
			
			if(nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				String xmlPartes = eElement.getElementsByTagName("parts").item(0).getTextContent();
				String xmlBytes = eElement.getElementsByTagName("grandària").item(0).getTextContent();
				
				if(xmlPartes.equals(String.valueOf((parts)) /*&& xmlBytes.equals(String.valueOf(bytes)*/)) {
					luzVerde = true;
				}
				
				//Comprueba los valosres leisdos en el XML y los recibidos en el constructor
				//Coinciden
			}
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "El archivo XML no se puede leer correctamente", "Error XML",
			JOptionPane.ERROR_MESSAGE);
		}
		return luzVerde;
	}
	
	
	public static String leer(File f) throws IOException {
		//Leyendo del XML los datos necesarios
		File leyendoXML = f;
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder;
		Document document;
		String stringPartes= "";
		try {
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
			document = (Document) documentBuilder.parse(leyendoXML);
			
			//Accede al elemento del XML donde se almacena el número de partes
			stringPartes = ((Element) document).getElementsByTagName("parts").item(0).getTextContent();
			System.out.println(stringPartes);

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch(SAXException e) {
			e.printStackTrace();
		}
		return stringPartes;
	}
	
	public static void main(String[] args) throws IOException {
	}
	
}
