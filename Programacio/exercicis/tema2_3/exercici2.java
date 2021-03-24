package tema2_3;
import java.util.Scanner;

public class exercici2 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix el número de files: ");
		int a = sc.nextInt();
		for(int i = 1; i <= a; i++) { //mientras sea menor/igual ve haciendo filas
			for(int j = 1; j <= a - i; j++) { //hace el dibujo de "-". Encontrar ecuación. 1a fila-> 3 - 1 = 2.
				System.out.print(" ");
			}
			for(int k = 1; k <=  2 * i - 1; k++) { //hace el dibujo "*". Encontrar ecuación. la 1a fila-> 2 * 1 - 1 == 1
				System.out.print("*");
			}
			for(int l = 1; l <= a - i; l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
