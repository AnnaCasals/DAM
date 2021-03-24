package Tema2;
import java.util.*;
public class exercici4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix dos caràcters: ");
		char a = (sc.next().charAt(0));
		char b = (sc.next().charAt(0));
		if(a == b) {
			System.out.println("Són el mateix caràcter");
		} else { 
			System.out.println("NO són el mateix caràcter");
		}
	}
}
