package Programame;

import java.util.Scanner;

public class Hexagono {
	public static void main(String[] args) {
		int a = 1;
		char b = '1';
		Scanner sc = new Scanner(System.in);
		while(a != 0 | b != '0') {
			a = sc.nextInt();
			b = sc.next().charAt(0);
			for(int z = 0; z < a; z++) {
				for(int i = 0; i < a - z - 1; i++) {
					System.out.print(" ");
				}
				for(int j = 0; j < (a + z * 2); j++) {
					System.out.print(b);
				}
				System.out.println();
			}
			for(int x = 1; x < a; x++) {
				for(int i = x; i > 0; i--) {
					System.out.print(" ");
				}
				for(int k = (a * 3) - (x * 2) - 2; k > 0; k--) {
					System.out.print(b);
				}
				System.out.println();
			}
		}
	}
}
