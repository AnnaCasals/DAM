package Tema5;

import java.util.Scanner;

public class Conversor {
	private int numero;
	private String a = "";
	
	Conversor(int a) {
		numero = a;
	}
	
	String getNumero(String p) { 
		if(p.equalsIgnoreCase("b")) {
			a = Integer.toBinaryString(numero);
		} else if(p.equalsIgnoreCase("h")) {
			a = Integer.toHexString(numero).toUpperCase();
		} else {
			a = Integer.toOctalString(numero);
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix un número a convertir: ");
		int a = sc.nextInt();
		System.out.print("A quin sistema ho vols passar: 'b' 'h' 'o' ");
		String b = sc.next();
		Conversor c = new Conversor(a);
		if(b.equalsIgnoreCase("b")) {
			System.out.print("Binario: " + c.getNumero(b));
		} else if(b.equalsIgnoreCase("h")) {
			System.out.print("Hexadecimal: " + c.getNumero(b));
		} else {
			System.out.print("Octal: " + c.getNumero(b));
		}
	}
}
