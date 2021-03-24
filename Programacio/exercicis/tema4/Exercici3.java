package tema4;
import java.util.*;
public class Exercici3 {
	public static int fib(int n) {
		if (n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix quants números de fibbonaci vols: ");
		int a = sc.nextInt();
		for(int i = 0; i <= a; i++) {
			System.out.print(fib(i) + ", ");
		}
	}
}
