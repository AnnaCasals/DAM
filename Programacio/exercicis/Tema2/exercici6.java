package Tema2;
import java.util.*;
public class exercici6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix un caràcter: ");
		char a = sc.next().charAt(0);
		if(a >= '0' && a <= '9') {
			System.out.println("El caràcter és un número del 0 al 9.");
		} else {
			System.out.print("El caràcter no és un número");
		}
	}
}
// dins del if Character.isDigit(a);
