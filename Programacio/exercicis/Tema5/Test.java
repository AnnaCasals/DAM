package Tema5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	int num1, num2;
	
	public void leeNumeros() {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(isr);
		
		try {
			System.out.print("Introdueix el primer número: ");
			String ln = buff.readLine();
			num1 = Integer.parseInt(ln);
			System.out.print("Introdueix el segon número: ");
			ln = buff.readLine();
			num2 = Integer.parseInt(ln);
		} catch(IOException e) {
			System.err.println("S'ha produit una IOException");
			e.printStackTrace();
		} catch (Throwable e) {
			System.err.println("Error de programa: " + e);
			e.printStackTrace();
		}
	}
	public void muestraNumeros() {
		try {
			System.out.println("La suma dóna: " + (num1 + num2));
			System.out.println("La multiplicació dóna: " + (num1 * num2));
			System.out.println("La divisió dóna: " + (num1 / num2));
			System.out.println("El módul és: " + (num1 % num2));
		} catch (ArithmeticException e) {
			System.err.println("Divisió per 0");
		} catch (Exception e) {
			System.err.println("S'ha produit un error en el programa");
		}
	}
		
	public static void main(String[] args) {
		Test t = new Test();
		t.leeNumeros();
		t.muestraNumeros();
	}
		/* 	public static void main(String[] args) {
		 * 		Scanner sc = new Scanner(System.in);
		 * 		System.out.print("Introdueix dos números: ");
		 * 		try {
		 * 			int a = sc.nextInt(); int b = sc.nextInt();
		 * 			Integer sum = new Integer(a + b);
		 * 			Integer mult = new Integer(a * b);
		 * 			Integer div = new Integer(a / b);
		 * 			Integer mod = new Integer(a % b);		
		 * 			System.out.println("La suma dóna: " + sum +"\nLa multiplicació dóna: " + mult + "\nLa divisió dóna: " + div + "\nEl mòdul dóna: " + mod);
		 * 		} catch(ArithmeticException e) {
		 * 			System.err.println("No es pot dividir entre 0");
		 * 		} catch(InputMismatchException e) {
		 * 			System.err.println("Introdueix dos enters");
		 * 		}
		 * 	}
		 */
}
