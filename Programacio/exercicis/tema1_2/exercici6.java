package tema1_2;
import java.util.Scanner;
public class exercici6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix una velocitat amb Km/h: ");
		double kmh = sc.nextDouble();
		double ms = kmh * 1000 / 3600;
		System.out.println("la velocitat és " + String.format("%.2f", ms) + " m/s");
	}
}
