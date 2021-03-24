package Tema2_figures;
import java.util.*;
public class PiramideInv {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix el número de files: ");
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for(int j = (2 * a) - (2 * i) - 1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
