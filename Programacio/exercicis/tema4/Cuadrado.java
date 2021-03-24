package tema4;
import java.util.*;
public class Cuadrado {
	public static int cuad(int fil, int col) {
		if(fil == 1 || col == 1) { return 1; }
		else { return cuad(fil - 1, col) + cuad(fil, col - 1); }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix la dimensió del quadrat: ");
		int a = sc.nextInt();
		cuad(a, a);
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= a; j++) {
				int dato = cuad(i, j);
					System.out.print(dato + "\t");
			}
			System.out.println();
		}
		
	}
}
