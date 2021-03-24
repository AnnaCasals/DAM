package prova2;
import java.util.Scanner;

public class exercici9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introdueix un temps en segons: ");
		int t = sc.nextInt();
		int h = t / 3600;
		int m = (t % 3600) / 60;
		int s = (t % 3600) % 60;
		System.out.print(h + " hores " + m + " minuts " + s + " segons");
	}
}
