package controlador;

import java.util.*;

import javax.print.attribute.SetOfIntegerSyntax;
import javax.swing.*;

import model.*;
import vista.*;

public class Controlador {
	
	private static int idUsuari = -1;
	private static int idConversa = -1;
	
	private static Object[] conversa = null;
	
	public static void setIdUsuari(int id) { idUsuari = id;}
	public static int getIdUsuari() { return idUsuari; }
	
	public static void setIdConversa(int id) { idConversa = id; }
	public static int getIdConversa() { return idConversa; }
	
	public static void setConversa(Object[] a) { conversa = a; }
	public static Object[] getConversa() { return conversa; }
	
	//Entrar directament a l'aplicació
	public static void logIn(String n, String c) {
		BBDDConnectar.connectar();
		c = CodificarContrasenya.convertirSHA256(c);
		if(!BBDDUsuaris.comprobar(n, c)) {
			JOptionPane.showMessageDialog(null, "Nom i/o contrasenya no són correctes");
		} else {
			JOptionPane.showMessageDialog(null, "Són correctes");
		}
	}
	
	//Per a registrar-se un usuari
	public static void registre(String n, String c) {
		BBDDConnectar.connectar();
		c = CodificarContrasenya.convertirSHA256(c);
		if(!BBDDUsuaris.comprobar(n, c)) {
			BBDDUsuaris.insertar(n, c);
			JOptionPane.showMessageDialog(null, "Per a entrar, has de polsar el botó entrar!!!");
		} else {
			JOptionPane.showMessageDialog(null, "Ja existeix un usuari amb ixe nom i ixa contrasenya");
		}
	}
	
	//Saber el id de l'usuari amb el que s'ha entrat a l'aplicació
	public static int idUsuari(String n, String c) {
		c = CodificarContrasenya.convertirSHA256(c);
		int i = BBDDUsuaris.consultaIdUsuari(n, c);
		return i;
	}
	
	//Saber les converses de l'usuari, guardant-les completament en un array, i tornant-les
	public static ArrayList<Object[]> converses() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Object[]> converses = new ArrayList<Object[]>();
		
		String t = "";
		//array en totes les converses a les que participa
		a = BBDDPertany.consultaConverses(idUsuari);
		//Bucle per a saber la info de les converses completes
		for(int i = 0; i < a.size(); i++) {
			converses.add(BBDDConversa.conversaCompleta(a.get(i)));
		}
		return converses;
	}
	
	//Eixir d'una conversa
	public static void exirDeConversa(int idConv) {
		BBDDPertany.eixirConversa(idUsuari, idConv);
	}
	
	public static void enviarDelGrup(int idUsu) {
		BBDDPertany.eixirConversa(idUsu, idConversa);
	}
	
	//CONVERSA ACTUAL 
	public static String titolConversaActual() {
		String titol = (String) conversa[4];
		idConversa = (int) conversa[0];
		return titol;
	}
	
	//Saber els missatges d'una conversa, guardant-los completament en un array, i tornant l'array
	public static ArrayList<Object[]> missatges() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Object[]> missatges = new ArrayList<Object[]>();
		
		String t = "";
		//array en totes els missatges
		a = BBDDEnvia.consultaMissatges(idConversa);
		
		//Bucle per a saber la info de les converses completes
		for(int i = 0; i < a.size(); i++) {
			missatges.add(BBDDMissatges.missatgesComplets(a.get(i)));
		}
		return missatges;
	}
	
	//Comprobar que siga l'usuari qui ha enviat el missatge, si és aixina borrar-lo
	public static boolean borrarMissatge(int idMsj) {
		boolean a = true;
		int b = BBDDEnvia.idUsuariDeMissatge(idMsj);
		
		if(b != idUsuari) {
			a = false;
		} else {
			BBDDMissatges.borrarMissatge(idMsj);
		}
		return a;
	}
	
	//Enviar Missatge a una conversa
	public static void enviarMissatge(String s) {
		BBDDMissatges.insertarMissatge(s, idConversa, idUsuari);
	}
	
	//Afegir un usuari a una conversa ja creada
	public static void insertarUsuariConversa(int idUsuari) {
		BBDDPertany.insertarUsuariConversa(idUsuari, idConversa);
	}
	
	//Usuaris registrats i que no estan en la conversa
	public static ArrayList<Object[]> usuarisNoConversa() {
		ArrayList<Object[]> tots = usuaris();
		ArrayList<Integer> conversa = BBDDPertany.usuarisConversa(idConversa);
		for(int i = 0; i < tots.size(); i++) {
			int z = (int) tots.get(i)[0];
			for(int j = 0; j < conversa.size(); j++) {
				if(z == conversa.get(j)) {
					tots.remove(i);
					j = conversa.size();
				}
			}
		}
		return tots;
	}
	//Usuaris que pertanyen a una conversa
	public static ArrayList<Object[]> usuarisConversa() {
		ArrayList<Object[]> usuaris = new ArrayList<Object[]>();
		ArrayList<Integer> conversa = BBDDPertany.usuarisConversa(idConversa);
		Object[] b;
		for(int i = 0; i < conversa.size(); i++) {
			b = BBDDUsuaris.usuari(conversa.get(i));
			usuaris.add(b);
		}
		return usuaris;
	}
	
	//Canvia titol conversa
	public static void canviaTitol(String t) {
		BBDDConversa.updateTitol(idConversa, t);
	}
	
	//Torna tots els usuaris registrats
	public static ArrayList<Object[]> usuaris() {
		ArrayList<Object[]> u = new ArrayList<Object[]>();
		u = BBDDUsuaris.consultaUsuaris();
		return u;
	}
	
	//Insertar Conversa
	public static void insertarConversa(String titol) {
		int idConv = BBDDConversa.insertarConversa(titol, idUsuari);
		idConversa = idConv;
	}
	
	//Torna un usuari Complet
	public static Object[] usuariComplet() {
		Object[] usuari = BBDDUsuaris.usuari(idUsuari);
		return usuari;
	}
	
	//Canvia Nom usuari
	public static void canviaNom(String nom) {
		BBDDUsuaris.updateNom(nom, idUsuari);
	}
	
	//Canvia contrasenya usuari
	public static void canviaContrasenya(String contrasenya) {
		contrasenya = CodificarContrasenya.convertirSHA256(contrasenya);
		BBDDUsuaris.updateContrasenya(contrasenya, idUsuari);
	}
}
