package tema3;

import java.util.Scanner;

public class Coche2 {
	private static String marca;
	private static String modelo;
	
	Coche2() {
		marca = modelo = "a";
	}
	Coche2(String mar, String mod) {
		marca = mar;
		modelo = mod;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el modelo del coche ");
		String mod = sc.next();
		System.out.print("Introduce la marca del coche ");
		String mar = sc.next();
		Coche2 a = new Coche2(mar, mod);
		System.out.println("El coche es de la marca " + marca + " del modelo " + modelo);
		Coche2 b = new Coche2();
		System.out.println("El coche es de la marca " + marca + " del modelo " + modelo);
	}
}
