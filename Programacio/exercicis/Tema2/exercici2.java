package Tema2;
import java.util.*;
public class exercici2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix un número enter: ");
		int a = sc.nextInt();
		if(a %10 == 0) {
			System.out.println("El número " + a + " és múltiple de 10");
		} else {
			System.out.println("El número " + a + " no és múltiple de 10");
		}
	}
}
