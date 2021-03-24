package tema3;
import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		double c = 0, f = 0;
		while(a != 3) {
			System.out.println("1. Passar de Celsius a Fahrenheit \n2. Passar de Fahrenheit a Celsius \n3. Eixir \nElegeix opció...");
			a = sc.nextInt();
			switch(a) {
				case 1:
					System.out.print("Introdueix una temperatura en celsius: ");
					c = sc.nextDouble();
					f = celsiusToFahrenheit(c);
					System.out.println("La temperatura en Fahrenheit és: " + f);
					System.out.println();
					a = 1; break; 
				case 2:
					System.out.print("Introdueix una temperatura en Fahrenheit: ");
					f = sc.nextDouble();
					c = fahrenheitToCelsius(f);
					System.out.println("La temperatura en celsius és: " + c);
					System.out.println();
					a = 2; break;
				case 3: 
					a = 3; break;
				default: 
					a = 3; break;
			}
		}
		sc.close();
	}
	
	public static double celsiusToFahrenheit(double c) {
		double f = 1.8 * c + 32;
		return f;
	}
	
	public static double fahrenheitToCelsius(double f) {
		double c = (f - 32) / 1.8;
		return c;
	}
}
