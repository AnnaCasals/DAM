package tema4;
import java.util.*;

public class Exercici1 {
	/* Precondició n >= 0 */
	public static int fact(int n) {
		if(n == 0) {
			return 1;
		} else {
			return n * fact(n-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix un número enter ");
		int a = sc.nextInt();
		System.out.println("El factorial de " + a  + " és " + fact(a));
	}
}
