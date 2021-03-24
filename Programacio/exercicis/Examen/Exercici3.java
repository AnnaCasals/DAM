package Examen;
import java.util.*;
public class Exercici3 {
	public static void main(String[] args) {
		int c = 0;
		int g = 0;
		int empat = 0;
		int guanyat = 0;
		int perdut = 0;
		while(c < 10) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Pedra/Paper/Tisores: ");
			String a = sc.next();
			Random rdn = new Random();
			int v = (int) (rdn.nextDouble() * 3) + 1;
			
			switch(v) {
				case 1: System.out.print("Ordinador: Paper "); break;
				case 2: System.out.print("Ordinador: Pedra "); break;
				case 3: System.out.print("Ordinador: Tisores "); break;
			}
			
			if(a.equalsIgnoreCase("Paper")) {
				System.out.println("Usuari: Paper "); g = 1;
			} else if(a.equalsIgnoreCase("Pedra")) {
				System.out.println("Usuari: Pedra "); g = 2;
			} else if(a.equalsIgnoreCase("Tisores")) {
				System.out.println("Usuari: Tisores "); g = 3;
			} else {System.out.println("Escriu un valor vàlid");	}
		
			if(g == v) {
				System.out.print(" Has empatat "); empat++;
			} else if((g == 2 && v == 3)||(g == 1 && v == 2) || (g == 3 && v == 1)) {
				System.out.println(" Molt bé!. Has guanyat "); guanyat++;
			} else { System.out.println(" Ohh. Has perdut "); perdut++;	}
			
			c++;
		}
		System.out.println("Has guanyat: " + guanyat + " has perdut: " + perdut + " has empatat: " + empat);
	}
}
