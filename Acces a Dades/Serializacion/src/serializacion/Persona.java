package serializacion;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String apellidos;
	private int edad;
	static ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

	
	Persona(String n, String a, int e) {
		nombre = n;
		apellidos = a;
		edad = e;
		//listaPersonas.add(this);
	}
	
	public String getNombre() { return nombre; }
	public void setNombre(String n) { nombre = n; }
	
	public String getApellidos() { return apellidos; }
	public void setApellidos(String a) { apellidos = a; }
	
	public int getEdad() { return edad; }
	public void setEdad(int e) { edad = e; }
	
	public String toString() {
		return getNombre() + " " + getApellidos() + ", " + getEdad(); 
	}
	
	
	public static void serializar() {
		ObjectOutputStream serializador = null;
		try {
			serializador = new ObjectOutputStream(new FileOutputStream("arxiu.dat"));
			serializador.writeObject(listaPersonas);
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if(serializador != null)
				try {
					serializador.close();
				} catch(IOException ioe) {
					ioe.printStackTrace();
				}
			
		}
	}
	
	public static void deserializar() {
		ObjectInputStream deserializador = null;
		listaPersonas = null;
		try {
			deserializador = new ObjectInputStream(new FileInputStream("arxiu.dat"));
			listaPersonas =  (ArrayList<Persona>) deserializador.readObject();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if(deserializador != null)
				try {
					deserializador.close();
					for(Persona persona : listaPersonas) {
						System.out.println(persona.toString());
					}
				} catch(IOException ioe) {
					ioe.printStackTrace();
				}
		}
	}
	
	public static void main(String[] args) {
		Persona a = new Persona("Anna", "Salvador Casals" ,  22);
		Persona c = new Persona("Manu", "Salvador Casals" , 26);
		listaPersonas.add(a);
		listaPersonas.add(c);
		serializar();
		deserializar();
	}
}
