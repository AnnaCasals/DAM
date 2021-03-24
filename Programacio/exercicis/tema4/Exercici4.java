package tema4;

import javax.swing.JOptionPane;

public class Exercici4 {
	public static int elemento(int fila, int columna) {
		if(columna == 1) return 1;
		if(columna < 1 || columna > fila) return 0;
		return elemento(fila - 1, columna) + elemento(fila - 1, columna - 1);
	}
	public static void main(String[] args) {
		int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la altura de la pirámide", "PIRAMIDE", JOptionPane.QUESTION_MESSAGE));
		for(int i = 1; i <= altura; i++) {
			//for(int e = 0; e < (altura - 1); e++) {}
				System.out.println(" ");
			for(int j = 1; j <= altura; j++) {
				int dato = elemento(i, j);
				if(dato > 0) {
					System.out.print(dato + " ");
				}
			}
		}
		System.out.println();
	}
}
