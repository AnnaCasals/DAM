package Tema2;
import java.util.*;
public class exercici7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix dos números: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		//while (b == 0) {
			//System.out.print("Introdueix un número que NO siga 0: ");
			//b = sc.nextDouble();
		//}
		if(b == 0) {
			System.out.println("No es pot fer la divisió");
		} else {
			double c = a/b;
			System.out.println("La divisió " + a + "/"+ b + " és igual a " + (c));
		}
	}
}
