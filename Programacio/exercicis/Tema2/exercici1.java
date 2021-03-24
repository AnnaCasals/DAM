package Tema2;
import java.util.*;
public class exercici1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix un número enter: ");
		int a = sc.nextInt();
		if(a % 2 == 0) {
			System.out.println("El número " + a + " és parell");
		} else { 
			System.out.println("El número " + a + " és imparell");
		}
	} 
}
