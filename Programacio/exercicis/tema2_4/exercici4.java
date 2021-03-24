package tema2_4;

import java.util.Scanner;

public class exercici4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introdueix la data de naixement: ");
		System.out.print("Dia: ");
		int d = sc.nextInt();
		System.out.print("Mes: ");
		int m = sc.nextInt();
		System.out.print("Any: ");
		int a = sc.nextInt();
		
		int t = d + m + a;
		int s = t / 1000 % 10;
		int s1 = t / 100 % 10;
		int s2 = t / 10 % 10;
		int s3 = t / 1 % 10;
		
		t = s + s1 + s2 + s3;
		s = t / 10 % 10;
		s1 = t / 1 % 10;
		
		t = s + s1;
		System.out.print(t);
		
	}
}
