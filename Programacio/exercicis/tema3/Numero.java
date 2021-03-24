package tema3;

import java.util.Scanner;

public class Numero {
	private double num;
	
	Numero() {
		num = 0;
	}
	Numero(double a) {
		num = a;
	}
	
	void anyade(double a) {
		num = num + a;
	}
	
	void resta(double a) {
		num = num - a;
	}
	
	double getValor() {
		return num;
	}
	
	double getDouble() {
		return num * 2;
	}
	
	double getTriple() {
		return num * 3;
	}
	
	void setNumero(double a) {
		num = a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix un número: ");
		double a = sc.nextDouble();
		Numero b = new Numero(a);
		Numero c = new Numero();
		b.anyade(1);
		c.anyade(2);
		System.out.println("El valor b més 1 és: " + b.getValor());
		System.out.println("El valor c 2 és: " + c.getValor());
		b.resta(1);
		c.resta(1);
		System.out.println("El valor b menys 1 és: " + b.getValor());
		System.out.println("El valor c menys 1 és: " + c.getValor());
		System.out.println("El doble de b és: " + b.getDouble());
		System.out.println("El doble de c és: " + c.getDouble());
		System.out.println("El triple de b és: " + b.getTriple());
		System.out.println("El triple de c és: " + c.getTriple());
		b.setNumero(2);
		System.out.println("Cambiem b per 2: " + b.getValor());
	}
}
