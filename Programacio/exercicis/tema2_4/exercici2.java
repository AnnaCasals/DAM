package tema2_4;

import java.util.Scanner;

public class exercici2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantes files té el triangle: ");
		int f = sc.nextInt();
		for(int i = 1; i <=f; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
