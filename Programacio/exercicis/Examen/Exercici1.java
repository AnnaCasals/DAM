package Examen;
import java.util.*;
public class Exercici1 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un tiempo en segundos: ");
		int t = sc.nextInt();
		int h = t / 3600;
		int m = (t / 60) - (h * 60);
		int s = t - (m * 60) - (h * 3600);
		System.out.print("Horas: " + h + " Minutos: " + m + " Segundos: " + s);
	}

}
