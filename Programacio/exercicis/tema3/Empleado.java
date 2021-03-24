package tema3;

import java.util.Scanner;

public class Empleado {
	private String nombre;
	private double sueldo;
	
	Empleado(String n, double s) {
		nombre = n;
		sueldo = s;
	}
	void datosEmpleado() {
		System.out.println("El nombre del empleado es " + nombre + " y su sueldo es " + sueldo);
	}
	void pagarImpuestos() {
		if(sueldo > 3000) {
			System.out.println("El empleado tiene que pagar impuestos");
		} else {
			System.out.println("El empleado NO tiene que pagar impuestos");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el nombre del empleado ");
		String n = sc.next();
		System.out.print("Introduce el sueldo del empleado ");
		double s = sc.nextDouble();
		Empleado a = new Empleado(n, s);
		a.datosEmpleado();
		a.pagarImpuestos();
	}
}
//Scanner sc = new Scanner(System.in);
//Empleado() {
//	System.out.print("Introduce el nombre del empleado");
//	nombre = sc.nextLine();
//	System.out.print("Introduce el sueldo del empleado");
//	sueldo = sc.nextDouble();
