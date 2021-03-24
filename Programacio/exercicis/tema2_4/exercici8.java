package tema2_4;
import java.util.Scanner;

public class exercici8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix un número: ");
		int a = sc.nextInt();
		
		int m = a / 1000;
		int m1 = a % 1000;
		while(m > 0 && m < 4) {
			System.out.print("M");
			m--;
		}
		
		int d = m1 / 500;
		int d1 = m1 % 500;
		if(m1 >= 900) {
			System.out.print("CM");
			d1 = m1 - 900;
			d = 0;
		} else if (d == 1) {
			System.out.print("D");
		}
		
		int c = d1 / 100;
		int c1 = d1 % 100;
		if(d1 >= 400) {
			System.out.print("CD");
			c1 = m1 - 400;
			c  = 0;
		}
		while(c > 0) {
			System.out.print("C");
			c--;
		}
		
		int l = c1 / 50;
		int l1 = c1 % 50;
		if(c1 >= 90) {
			System.out.print("XC");
			l1 = c1 - 90;
			l = 0;
		}
		while(l > 0) {
			System.out.print("L");
			l--;
		}
		
		int x = l1 / 10;
		int x1 = l1 % 10;
		if(l1 >= 40) {
			System.out.print("XL");
			x1 = l1 - 40;
			x = 0;
		}
		while(x > 0) {
			System.out.print("X");
			x--;
		}
		
		int v = x1 / 5;
		int v1 = x1 % 5;
		if(x1 == 9) {
			System.out.print("IX");
			v1 = x1 - 9;
			v = 0;
		}
		if(v == 1) {
			System.out.print("V");
		}
		while(v1 > 0 && v1<4) {
			System.out.print("I");
			v1--;
		}
		if(v1 == 4) {
			System.out.print("IV");
		}
	}
}
