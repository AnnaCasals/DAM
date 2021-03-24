package tema2_3;

import java.util.Scanner;

public class exercici4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introdueix les altures de les persones: ");
		double a = 0.0;
		int i = 0;
		while(sc.hasNextDouble()) {
			a += sc.nextDouble();
			System.out.println(a);
			i++;
			System.out.println(i);
		}
		sc.close();
		double b = a / i;
		System.out.println(b);
	}
}
