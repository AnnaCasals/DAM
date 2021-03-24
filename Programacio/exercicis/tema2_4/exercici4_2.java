package tema2_4;

import java.util.Scanner;

public class exercici4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introdueix la data de naixement: ");
		System.out.print("Dia: ");
		int d = sc.nextInt();
		System.out.print("Mes: ");
		int m = sc.nextInt();
		System.out.print("Any: ");
		int a = sc.nextInt();
		int t = d + m + a;
		int z = 0, y = 0, x = 0;
		
		for(int j = 0; j < 4; j++) {
			z += (int)(t / Math.pow(10, j) % 10); 
		}
		for(int i = 0; i < 2; i++) {
			y += (int)(z / Math.pow(10, i) % 10); 
		}
	
			System.out.print(x);
	}
}
