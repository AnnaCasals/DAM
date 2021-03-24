package tema4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cuadrado2 {
	
	public static void cuadrado(int dimension) {
		for(int i = 1; i <= dimension; i++) {
			for(int j = 1; j <= dimension; j++) {
				System.out.format("%5d" ,dato(i, j));
			}
			System.out.println(" ");
		}
	}
	
	public static int dato(int fila, int columna) {
		//if(columna < 1 || fila < 1) return 0;
		if(columna == 1 || fila == 1) return 1;
		else return dato(fila - 1, columna) + dato(fila, columna - 1);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int dimen;
		InputStreamReader isr = new InputStreamReader(System.in); //coge bytes y lo utiliza como caracteres
		BufferedReader buff = new BufferedReader(isr); //Coge caracteres y lo utiliza como arrays y líneas
		
		do {
		System.out.println("Introduce dimensión (0 para finalizar) ");
		dimen = Integer.parseInt(buff.readLine());
		cuadrado(dimen);
		
		} while(dimen != 0);
	}
	
	
}
