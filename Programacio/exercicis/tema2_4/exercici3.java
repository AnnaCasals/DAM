package tema2_4;

import java.util.Scanner;

public class exercici3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix com de alt és el rombe: ");
		int a = sc.nextInt();
		for(int i = 1; i <= (a/2); i++) { 
			for(int j = 1; j <= a/2 - i + 1; j++) {
				System.out.print("-");
			}
			for(int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int o = 1; o <= a; o++) {
			System.out.print("*");
		} 
		System.out.println();
		
		for(int l = 1; l <= (a/2); l++) { 
			for(int m = l; m >= 1; m--) {
				System.out.print("-");
			}
			for(int n = a - (l*2); n >= 1; n--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
