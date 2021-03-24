package codi;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import interfaces.FinestraDividir;

public class UnirCodigo {

	public static void unir(ArrayList<File> lista) throws IOException {
		File a;
		int char1;
		String b;
		//Ruta de l'arxiu en la primera posició de la llista
		String g = lista.get(0).getAbsolutePath();
		
		//Crea la variable per a poder llegir d'un arxiu
		FileInputStream leer;
		
		int z = Integer.parseInt(leer(lista.get(0)));
		if(z == lista.size() -1) {
			//Crea la variable per a poder escriure en l'arxiu "g + junt", si no existeix el crea
			FileOutputStream escribir = new FileOutputStream(g + "junt");
			
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
		} else {
			JOptionPane.showMessageDialog(null, "Error al llegir");
		}
	}
	
	public static  String leer(File xml) throws IOException {
		//Para acceder a él
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder;
		org.w3c.dom.Document document;
		String stringPartes = "";
		try {
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
			document = documentBuilder.parse(xml);
			//Accede al elemento del XML donde se almacena el número de partes
			stringPartes = ((org.w3c.dom.Document) document).getElementsByTagName("parts").item(0).getTextContent();
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
