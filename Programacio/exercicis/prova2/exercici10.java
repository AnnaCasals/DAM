package prova2;
import java.util.Scanner;

public class exercici10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix un import d'euros: ");
		int e = sc.nextInt();
		int b500 = 0, b200 = 0, b100 = 0, b50 = 0, b20 = 0, b10 = 0;
		int b5 = 0, m2 = 0, m1 = 0; 
		while(e >= 500) {
			b500++;
			e -= 500;
		} if(b500 != 0) { System.out.println(b500 + " billetes de 500"); }
		while(e >= 200) {
			b200++;
			e -= 200;
		} if(b200 != 0) { System.out.println(b200 + " billetes de 200"); }
		while(e >= 100) {
			b100++;
			e -= 100;
		} if(b100 != 0) { System.out.println(b100 + " billetes de 100"); }
		while(e >= 50) {
			b50++;
			e -= 50;
		} if(b50 != 0) { System.out.println(b50 + " billetes de 50"); } 
		while(e >= 20) {
			b20++;
			e -= 20;
		} if(b20 != 0) { System.out.println(b20 + " billetes de 20"); } 
		while(e >= 10) {
			b10++;
			e -= 10;
		} if(b10 != 0) { System.out.println(b10 + " billetes de 10"); } 
		while(e >= 5) {
			b5++;
			e -= 5;
		} if(b5 != 0) { System.out.println(b5 + " billetes de 5"); } 
		while(e >= 2) {
			m2++;
			e -= 2;
		} if(m2 != 0) { System.out.println(m2 + " monedas de 2"); } 
		while(e >= 1) {
			m1++;
			e -= 1;
		} if(m1 != 0) { System.out.println(m1 + " monedas de 1"); }
	}
}
