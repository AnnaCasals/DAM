package tema1_2;
import java.util.Scanner;
public class exercici4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduix temperatura en ºC: ");
		double c = sc.nextDouble();
		double f = 32 + (9 * c / 5);
		System.out.println("Fahrenheit: " + f);
	}
}
