package tema2_3;

import java.util.Scanner;

public class exercici3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix quants números pars: ");
		int a = sc.nextInt();
		int pars = a *2;
		for(int i = 0; i < pars; i = i + 2) {
			System.out.println(i);
		}
	}
}
