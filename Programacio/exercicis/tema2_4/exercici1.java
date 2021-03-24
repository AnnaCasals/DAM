package tema2_4;
import java.util.*;
public class exercici1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix tres nombres enters: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a > b && a > c) {
			System.out.println("El número més gran és el primer, " + a);
			if(b < c) {
				System.out.println("El número més menut és el segon, " + b);
			} else {
				System.out.println("El número més menut és el tercer, " + c);
			}
		} else if(b > a && b > c) {
			System.out.println("EL número més gran és el segon, " + b);
			if(a < c) {
				System.out.println("El número més menut és el primer, " + a);
			} else { 
				System.out.println("El número més menut és el tercer, " + c);
			}
		} else {
			System.out.println("El número més gran és el tercer, " + c);
			if(a < b) {
				System.out.println("El número més menut és el primer, " + a);
			} else {
				System.out.println("El número més menut és el segon, " + b);
			}
		}
	}
}