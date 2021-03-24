package Tema2;
import java.util.*;
public class exercici3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix un caràcter: ");
		char a = sc.next().charAt(0);
		//int c = (int)a;
		//if(c >= 65 && c <= 90) {
		if(Character.isUpperCase(a)) {
			System.out.print("El caràcter '" + a + "' és una lletra majúscula");
		} else { 
			System.out.print("El caràcter '" + a + "' no és una majúscula");
		}
	}
}
