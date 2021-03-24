package Tema2_figures;

import java.util.Scanner;

public class Abeto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix com de gran vols que siga l'arbre: ");
		int a = sc.nextInt();
		for(int d = 2; d <= a; d++) {
			for(int b = 1; b <= d; b++) {
				for(int c = 1; c <= b; c++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		System.out.println("**");
		System.out.println("**");
		sc.close();
	}
}
