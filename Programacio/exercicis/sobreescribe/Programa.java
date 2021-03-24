package sobreescribe;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quin és el sou base? ");
		Empleado b = new Empleado();
		double c = sc.nextDouble();
		b.setSueldo(c);
		System.out.println("El sou base és: " + c);
		System.out.println("El sou de l'empleat és: " + b.getSueldo());
		Encargado a = new Encargado();
		a.setSueldo(c);
		System.out.println("El sou de l'encarregat és: " + a.getSueldo());
	}
}
