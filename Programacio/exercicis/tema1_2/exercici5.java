package tema1_2;
import java.util.Scanner;
public class exercici5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduiu el radi de una circumferència: ");
		double r = sc.nextDouble();
		while(r <= 0) {
			System.out.print("Introduiu un radi CORRECTE: ");
			r = sc.nextDouble();
		}
		double l = 2 * Math.PI * r;
		double a = Math.PI * Math.pow(r, 2);
		System.out.println("Longitud: " + String.format("%.2f", l) + " Àrea: " + String.format("%.2f", a));
	}
}
