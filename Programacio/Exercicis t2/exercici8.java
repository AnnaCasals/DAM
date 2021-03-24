package Tema2;
import java.util.*;
public class exercici8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix quan val el radi: ");
		double r = sc.nextDouble();
		while(r <= 0) {
			System.out.print("Introdueix un valor CORRECTE per al radi: ");
			r = sc.nextDouble();
		}
		double v = (4 * Math.PI * Math.pow(r, 3)) / 3;
		System.out.println("El volum de l'esfera és: " + v);
	}
}
