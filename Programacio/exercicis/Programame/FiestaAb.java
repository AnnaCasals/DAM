package Programame;

import java.util.Scanner;

public class FiestaAb {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		for(int o = 0; o < p; o++) {
			String a = sc.next();
			String b = sc.next();
			System.out.println("Hola, " + b + ".");
		}
	}
}
