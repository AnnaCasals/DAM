package tema1_2;
import java.util.Scanner;
public class prova {
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
		while(m < 0 && m > 12 ) {
			System.out.println("Introdueix un mes CORRECTE: ");
			m = sc.nextInt();
		}
		System.out.print("Any: ");
		int a = sc.nextInt();
		while(a > 2018) {
			System.out.println("Introdueix un any CORRECTE: ");
			a = sc.nextInt();
		}
		while(!data(d, m, a)) {
			System.out.println("Introdueix un data que EXISTISCA: ");
			System.out.print("Dia: ");
			d = sc.nextInt();
			System.out.print("Mes: ");
			m = sc.nextInt();
			System.out.print("Any: ");
			a = sc.nextInt();
		}
		int s = d + m + a;
		for(int i = 0; i < 4; i++) {
			int g = (int)(s/Math.pow(10, i) % 10);
			sf += g;
		}
			System.out.println("El teu número de la sort és: " + sf);
	}
	
	private static boolean data(int dia, int mes, int any) {
		boolean dt = true;
		boolean bisiesto = false;
		if (any%4 == 0 && any%400 == 0 && any%100!=0) {bisiesto = true;}
		if(mes == 4 || mes == 6 || mes == 9 || mes == 11 || mes == 2) {
			if(dia == 31) {dt = false;}
			if(mes == 2 && (dia == 30 || dia == 29)) { 
				//if(bisiesto && dia == 29) {return true;}
				dt = false;
			}
			if(bisiesto && dia==29 && mes==2) {
				dt = true;
			}
		}
		return dt;
	}
}