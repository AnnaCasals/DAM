package tema4;

import java.util.Scanner;

public class TransformaBase2 {
	public static void muestraCifra(int dato) {
		if(dato < 10) {
			System.out.print(dato);
		}
		else {
			dato = dato - 10;
			char c = (char)('A' + dato);
			System.out.print(c);
		}
	}
	public static void transforma(int dato, int base) {
		if(base > dato) {
			muestraCifra(dato);
		} else {
			transforma(dato / base, base);
			muestraCifra(dato % base);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix el número en decimal: ");
		int d = sc.nextInt();
		System.out.print("Introdueix la base: ");
		int b = sc.nextInt();
		transforma(d, b);
	}
}
