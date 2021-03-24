package Tema2_figures;

import java.util.Scanner;

public class TringleInv2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix número de files: ");
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < a - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
