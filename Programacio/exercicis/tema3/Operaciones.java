package tema3;

import java.util.Scanner;

public class Operaciones {
	private int a;
	private int b;
	
	Operaciones(int s, int h) {
		a = s;
		b = h;
	}
	
	int sumar() {
		return a + b;
	}
	
	int restar() {
		return a - b;
	}
	
	int multiplicar() {
		return a * b;
	}
	
	double dividir() {
		return a / b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer número entero ");
		int z = sc.nextInt();
		System.out.print("Introduce el segundo número entero ");
		int y = sc.nextInt();
		Operaciones h = new Operaciones(z, y);
		
		int q = h.sumar();
		System.out.println("La suma dels dos números done " + q);
		int w = h.restar();
		System.out.println("La resta dels dos números done " + w);
		int e = h.multiplicar();
		System.out.println("La multiplicació dels dos números done " + e);
		double r = h.dividir();
		System.out.println("La divisió dels dos números done " + r);
	}
}
