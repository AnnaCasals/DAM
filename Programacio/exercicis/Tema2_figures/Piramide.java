package Tema2_figures;
import java.util.*;

public class Piramide {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix el número de files: ");
		int a = sc.nextInt();
		for(int i = 1; i <= a; i++) {
			for(int j = 0; j < a - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2 * i - 1 ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
