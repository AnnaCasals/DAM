package Tema2;
import java.util.*;
public class exercici8 {
	public static void  main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix tres números enters: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a >= b && a >= c) {
			if(a == b) {
				if (b == c) { System.out.println(a + ", " + b + " i " + c + ": són els tres números iguals"); 
				} else { System.out.println(a + " i " + b + " :el primer i segon números són els dos més grans"); }
			} else if(a == c) { System.out.println(a + " i " + c + " :el primer i el tercer números són els dos més grans"); 
			} else System.out.println(a + " :és el número més gran");
		} else if(b > a && b >= c) {
			if(b == c) { System.out.println(b + " i " + c + " :el segon i el tercer números són els més grans"); }
			else System.out.println(b + " :és el número més gran");
		} else { System.out.println(c + " :és el número més gran"); } 
	}
}
