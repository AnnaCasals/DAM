package tema3;
import java.util.*;
public class Finanzas {
	static double cambio;
	double cant;
	public static Scanner teclado = new Scanner(System.in);
	
	//Constructor sense saber a quant està el canvi
	Finanzas() {
		cambio = 1.36;
		System.out.print("El cambio está a "+ cambio + " $ el €");
		System.out.println();
	}
	
	//Constructor sabent a quant està el canvi
	Finanzas(double camb) {
		cambio = camb;
		System.out.println("El cambio está a " + cambio + " $ el euro");
	}
	
	//Passar de dòlars a Euros
	public void dolaresToEuros() {
		System.out.print("Introduce valor en dolares: ");
		cant = teclado.nextDouble();
		System.out.println(cant + " $ equivalen a " + String.format("%.3f", (cant*cambio)) + " €");
	}
	
	//Passar de euros a dòlars
	public void eurosToDolares() {
		System.out.print("Introducir el valor en euros: ");
		cant = teclado.nextDouble();
		System.out.println(cant + " € equivalen a " + String.format("%.3f", (cant / cambio)) + " $");
	}
	
	//Comprobació de tots els mètodes
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¿Conoces el valor del cambio de euro a dolar? ");
		String resp = sc.nextLine();
		
		if(resp.equalsIgnoreCase("si")) { //L'usuari sap a quant està el canvi
			System.out.print("Introduce el valor del cambio ");
			cambio = sc.nextDouble(); //Li pregunta a l'usuari i el que li posa serà a quant està el canvi per a esta execució
			Finanzas n = new Finanzas(cambio); //Crida al constructor
			
			System.out.println();
			n.eurosToDolares();  //Crida al mètode per a passar de euros a dòlars, i fa el print de dins del mètode
			System.out.println();
			n.dolaresToEuros(); //Crida al mètode per a passar de dòlars a euros, i fa el print de dins del mètode
			
		} else if(resp.equalsIgnoreCase("no")) { //L'usuari NO sap a quant està el canvi
			Finanzas n = new Finanzas(); //Crida al constructor
			System.out.println();
			
			n.eurosToDolares(); //Crida al mètode per a passar de euros a dòlars, i fa el print de dins del mètode
			System.out.println();
			n.dolaresToEuros(); //Crida al mètode per a passar de dòlars a euros, i fa el print de dins del mètode
		}
	}
}
