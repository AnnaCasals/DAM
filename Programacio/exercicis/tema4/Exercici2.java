package tema4;
import java.util.*;
public class Exercici2 {
	static int fact(int n) {
		int factorial = 1;
		for(int i = 1; i < n; i++) {
			factorial *= n;
		}
		return factorial;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix un número ");
		int a = sc.nextInt();
		System.out.println("El factorial de " + a + " és: " + fact(a));
	}
}
