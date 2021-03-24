package controlador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import baseDeDades.*;
import interficie.*;

public class Controlador {
	
	public static void logIn(String n, String c) {
		Connexio.connectar();
		if (!BBDDTUsuaris.comprobar(n, c)) {
			JOptionPane.showMessageDialog(null, "Nom i/o usuari no no són correctes");
		} else {
			JOptionPane.showMessageDialog(null, "Són correctes");
		}
		
	}
	
	public static void registre(String n, String c) {
		Connexio.connectar();
		if(!BBDDTUsuaris.comprobar(n, c)) {
			BBDDTUsuaris.insertar(n, c);
		} else {
			JOptionPane.showMessageDialog(null, "Ja existeix un usuari amb ixe nom i ixa contrasenya");
		}
	}
	
	public static int id(String n, String c) {
		int i = BBDDTUsuaris.consultaIdUsuari(n, c);
		return i;
	}
	
	public static ArrayList<String> converses(int id) {
		Connexio.connectar();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<String> b = new ArrayList<String>();
		String t = "";
		a = BBDDPertany.consultaConverses(id);
		for(int i = 0; i < a.size(); i++) {
			t = BBDDConversa.TitolConversa(a.get(i));
			b.add(t);
		}
		return b;
	}
	
	public static ArrayList<String> converses2(int id) {
		Connexio.connectar();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<String> b = new ArrayList<String>();
		ArrayList<Object[]> aux = new ArrayList<Object[]>();
		
		String t = "";
		a = BBDDPertany.consultaConverses(id);
		for(int i= 0; i < a.size(); i++) {
			aux = BBDDConversa.conversesCompletes(a.get(i));
			t = (String) aux.get(i)[4];
			b.add(t);
		}
		return b;
	}
	
	public static ArrayList<Object[]> usuaris() {
		Connexio.connectar();
		ArrayList<Object[]> u = new ArrayList<Object[]>();
		u = BBDDTUsuaris.consultaUsuaris();
		return u;
	}
}
