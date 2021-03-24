package tema1_2;
import java.util.Scanner;
public class exercici10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix un nombre de tres xifres: ");
		int a = sc.nextInt();
		while(a >= 1000) {
			System.out.print("Introdueix un nombre de TRES xifres: ");
			a = sc.nextInt();
		}
		for(int i = 0; i < 3; i++) {
			int g = (int)(a / Math.pow(10, i) % 10);
			System.out.println("Xifra " + (3 - i) + ": " + g);
		}
	}
}
