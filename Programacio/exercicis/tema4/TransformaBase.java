package tema4;
import java.util.*;
public class TransformaBase {
	public static void transforma(int decimal, int base) {
		if(decimal < base) {
			switch(decimal) {
				case 10: System.out.print("A"); break;
				case 11: System.out.print("B"); break;
				case 12: System.out.print("C"); break;
				case 13: System.out.print("D"); break;
				case 14: System.out.print("E"); break;
				case 15: System.out.print("F"); break;
				default: System.out.print(decimal);
			}
		} else {
			transforma(decimal/base, base);
			switch(decimal % base) {
				case 10: System.out.print("A"); break;
				case 11: System.out.print("B"); break;
				case 12: System.out.print("C"); break;
				case 13: System.out.print("D"); break;
				case 14: System.out.print("E"); break;
				case 15: System.out.print("F"); break;
				default: System.out.print(decimal % base);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix núm en decimal: ");
		int d = sc.nextInt();
		System.out.print("Introdueix la base: ");
		int b = sc.nextInt();
		transforma(d , b);
	}
}
