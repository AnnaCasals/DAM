package tema2_3;

import java.util.Scanner;

public class exercici7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		while(a != 999) {
			System.out.print("Introdueix un número enter: ");
			a = sc.nextInt();
			b += a;
		}
		System.out.println("La suma de tots els números dóna " + b);
		if(b > 0) {
			System.out.println("El número " + b + " és major que 0");
		} else if(b < 0) {
			System.out.println("El número " + b + " és menor que 0");
		} else {
			System.out.println("El número és igual a 0");
		}
	}
}