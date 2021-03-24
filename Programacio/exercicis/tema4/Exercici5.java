package tema4;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercici5 {
	public static int elemento(int fila, int columna) {
		if(fila < 1 || columna < 1) return 0;
		if(columna == 1) return 1;
		
		return elemento(fila - 1, columna) + elemento(fila - 1, columna - 1) + elemento(fila - 1, columna - 2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la altura de la pirámide: ");
		int numfilas = sc.nextInt();
		for(int i = 1; i <= numfilas; i++) {
			for(int e = 1; e <= (numfilas - i); e++)
				System.out.print("\t");
			for(int j = 1; j < (2 * numfilas + 1); j++) {
				int dato = elemento(i, j);
				if(dato > 0) 
					System.out.print(dato + "\t");
				
			}
			System.out.println(" ");
		}
	}
}
