package tema3;

import java.util.Scanner;

public class Minumero {
	private int num;
	
	Minumero(int n) {
		num = n;
	}
	
	int doble() {
		return num * 2;
	}
	
	int triple() {
		return num * 3;
	}
	
	int quadruple() {
		return num * 4;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix un número enter: ");
		int a = sc.nextInt();
		
		Minumero b = new Minumero(a);
		
		System.out.println("El doble del número introduit és: " + b.doble());
		System.out.println("El triple del número introduit és: " + b.triple());
		System.out.println("El quàdruple del número introduit és: " + b.quadruple());
	}
}
