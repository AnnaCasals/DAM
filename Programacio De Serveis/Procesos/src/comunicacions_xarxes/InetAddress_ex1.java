package comunicacions_xarxes;

import java.net.*;
import java.util.Scanner;

/* 	Realiza un programa que admita desde la línea de comandos
	un nombre de máquina o una dirección IP y visualice información
	sobre ella */

public class InetAddress_ex1 {
	
	public static void main(String args[]) {
		InetAddress dir = null;
		System.out.println("========================================================");
		System.out.println("Escriu el nom de la màquina o una direcció IP");
		// Llegir de la línia de comandos
		//dir = ...
		
		try {
			
			dir = InetAddress.getByName("Màquina elegida ");
			pruebaMetodos(dir);

			
					
		     // Array de tipo InetAddress con todas las direcciones IP 
		     //asignadas a google.es
		     System.out.println("\tDirecció IP per a: " + dir.getHostName());
		     InetAddress[] direcciones = 
		                   InetAddress.getAllByName(dir.getHostName());
		     for (int i = 0; i < direcciones.length; i++)
		          System.out.println("\t\t"+direcciones[i].toString());
					
			System.out.println("========================================================");
					
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		}
	} // main
	
	private static void pruebaMetodos(InetAddress dir) {		
	      System.out.println("\tMetodo getByName():  " + dir);
	      InetAddress dir2;
	      try {
			dir2 = InetAddress.getLocalHost();
			System.out.println("\tMetodo getLocalHost(): " + dir2);
	      } catch (UnknownHostException e) {
	    	  e.printStackTrace();
	      }	

	      // USAMOS METODOS DE LA CLASE
	      System.out.println("\tMetodo getHostName(): " + dir.getHostName());
	      System.out.println("\tMetodo getHostAddress(): " + dir.getHostAddress());
	      System.out.println("\tMetodo toString(): " + dir.toString());
	      System.out.println("\tMetodo getCanonicalHostName(): " +  dir.getCanonicalHostName());		
	} //pruebaMetodos	
}
