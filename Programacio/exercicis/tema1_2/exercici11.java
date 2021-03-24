package tema1_2;
import java.util.Scanner;
public class exercici11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix un nombre de cinc xifres: ");
		int a = sc.nextInt();
		while(a >= 100000) {
			System.out.print("Introdueix un nombre de CINC xifres: ");
			a = sc.nextInt();
		}
		for(int i = 4; i >= 0; i--) {
			int g = (int)(a / Math.pow(10, i) % 10);
			System.out.println("Xifra " + (i + 1) + ": " + g);
		}
	}
}