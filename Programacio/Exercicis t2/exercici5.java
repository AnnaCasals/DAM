package Tema2;
import java.util.*;
public class exercici5 {
	private static final double PI = 3.1416;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduiu el radi de una circumferència: ");
		double r = sc.nextDouble();
		double l = 2*PI*r;
		double a = PI * r * r;
		System.out.println("Longitut: " + l + " Àrea: " + a);
	}
}
