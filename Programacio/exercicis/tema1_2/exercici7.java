package tema1_2;
import java.util.Scanner;
public class exercici7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Longitud catetos: ");
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double a = Math.sqrt(b * b + c * c);
		System.out.println("La longitud de l'hipotenusa és: " + a);
	}
}
