package Examen;
import java.util.*;
public class Exercici2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la anchura del rombo: ");
		int a = sc.nextInt();
		for(int i = 0; i <= a/2; i++) {
			for(int j = 0; j < a/2 - i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int z = 0; z < a/2; z++) {
			for(int y = 1; y <= z + 1; y++) {
				System.out.print(" ");
			}
			for(int x = a - (z * 2 + 2); x > 0; x--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
