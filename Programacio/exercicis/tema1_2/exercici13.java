package tema1_2;
import java.util.Scanner;
public class exercici13 {
	public static void main(String[] args) {
		int sf = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introdueix la teua data de naixement");
		System.out.print("Dia: ");
		int d = sc.nextInt();
		while(d < 0 || d > 31) {
			System.out.println("Introdueix un dia CORRECTE: ");
			d = sc.nextInt();
		}
		System.out.print("Mes: ");
		int m = sc.nextInt();
		while(m < 0 || m > 12) {
			System.out.println("Introdueix un mes CORRECTE: ");
			m = sc.nextInt();
		}	
		System.out.print("Any: ");
		int a = sc.nextInt();
		while(a > 2018 || a < 1900) {
			System.out.println("Introdueix un any CORRECTE: ");
			a = sc.nextInt();
		}
		int s = d + m + a;
		for(int i = 0; i < 4; i++) {
			int g = (int)(s / Math.pow(10, i) % 10);
			sf += g;
		}
		System.out.println("El teu número de la sort és: " + sf);
	}
}
