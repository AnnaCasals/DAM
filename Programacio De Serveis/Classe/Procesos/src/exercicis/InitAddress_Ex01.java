package exercicis;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InitAddress_Ex01 {
	public static void main(String[] args) {
		   InetAddress dir = null;
		   System.out.println("========================================================");
		   System.out.println("ESCRIU UN NOM DE M�QUINA O UNA DIRECCI� IP: ");
		   Scanner sc = new Scanner(System.in);
		   String a = sc.next();
		   try {
			dir = InetAddress.getByName(a);
			pruebaMetodos(dir);//

		     System.out.println("\tDIRECCIONS IP PER A: " + dir.getHostName());
		     InetAddress[] direcciones = 
		                   InetAddress.getAllByName(dir.getHostName());
		     for (int i = 0; i < direcciones.length; i++)
		          System.out.println("\t\t"+direcciones[i].toString());
					
			System.out.println("========================================================");
					
		  } catch (UnknownHostException e1) { 
			  e1.printStackTrace();
		  }
	}// main
		
		private static void pruebaMetodos(InetAddress dir) {		
		      System.out.println("\tM�tode getByName():  " + dir);
			InetAddress dir2;
			try {
				dir2 = InetAddress.getLocalHost();
				System.out.println("\tM�tode getLocalHost(): " + dir2);
			} catch (UnknownHostException e) {e.printStackTrace();}	

			// USAMOS METODOS DE LA CLASE
			System.out.println("\tM�tode getHostName(): "+dir.getHostName());
			System.out.println("\tM�tode getHostAddress(): "+ 
		                                                 dir.getHostAddress());
			System.out.println("\tM�tode toString(): " + dir.toString());
			System.out.println("\tM�tode getCanonicalHostName(): " + 
		                                          dir.getCanonicalHostName());		
			}//pruebaMetodos	
			
	}//fin
