package tema3;

import java.util.Scanner;

public class Rebajas_2 {
	public static double descubrePorcentaje(double p, double pr) {
		double porcentaje = ((p - pr) * 100) / p;
		return porcentaje;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el precio actual: ");
		double actual = sc.nextDouble();
		System.out.println("Inreoduzca el precio original: ");
		double original = sc.nextDouble();
		System.out.println(String.format("%.2f", descubrePorcentaje(original, actual))+ "%");
	}
}
