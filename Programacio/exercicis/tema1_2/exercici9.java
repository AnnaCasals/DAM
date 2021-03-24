package tema1_2;
import java.util.Scanner;
public class exercici9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quan valen els costats del triangle: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double s = (a + b + c) / 2;
		double alt = (2 / a) * (Math.sqrt(s * (s - a) * (s - b) * (s - c)));
		double area = a * alt / 2;
		System.out.println("L'àrea del triangle és: " + String.format("%.4f", area));
	}
}
