package tema4;

import java.util.Scanner;

public class Fibonacci {
	public static int fib(int num) {
		if((num >= 1) && (num <= 2)) { return 1; }
		int este = 0, ant1, ant2;
		ant1 = ant2 = 1;
		for(int i = 2; i < num; i++) {
			este = ant1 + ant2;
			ant2 = ant1;
			ant1 = este;
		}
		return este;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la posición ");
		int a = sc.nextInt();
		for(int i = 1; i <= a; i++) {
			System.out.print(fib(i) + " ");
		}
	}
}
