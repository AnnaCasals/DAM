package prova2;
import java.util.Scanner;
public class exercici8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix l'edat: ");
		int edad = sc.nextInt();
		System.out.print("Introdueix el nivell d'estudis: ");
		int nivel_de_estudios = sc.nextInt();
		System.out.print("Introdueix els ingressos: ");
		int ingresos = sc.nextInt();
		boolean jasp = ((edad <= 28 && nivel_de_estudios > 3) || (edad < 30 && ingresos > 28000));
		System.out.print(jasp);
	}
}
