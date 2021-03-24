package Tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ultxifra {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix un número: ");
		try {
			Integer a = new Integer(sc.nextInt());
			System.out.println("La última xifra és: " + (a % 10));
		} catch(InputMismatchException e) {
			System.err.println("Error en la dada introduida, ha de ser un ENTER");
		}
		/*
		 * 	public static int getNumber() {
		 * 		int dato = 0;
		 * 		InputStreamReader isr = new InputStreamReader(System.in);
		 * 		BufferedReader buff = new BufferedReader(isr);
		 * 		try {
		 * 			System.out.println("Introdueix una dada: ");
		 * 			String ln = buff.readLine();
		 * 			dato = Integer.parseInt(ln);
		 * 		} catch (IOException e) {
		 * 			System.err.println("S'ha produit un error");
		 * 			e.printStackTrace();
		 * 		} catch (Throwable e) {
		 * 			System.err.println("Error de programa: " + e);
		 * 			e.printStackTrace();
		 * 		}
		 * 		return (dato);
		 * 	}
		 * 	public void getUltimaCifra() {
		 * 		int d = 0;
		 *		String cad = String.valueOf(dato);
		 *		d = Integer.parseInt(cad.subString(cad.length() - 1));
		 * 		return d;
		 * 	}
		 * 	public static void main(String[] args) {
		 * 		Ultxifra a = new Ultxifra();
		 * 		a.getNumber();
		 * 		a.getUltimaCifra();
		 * 	}
		 */
	}
}
