package Tema2;
import java.util.*;
public class exercici10 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix el número de un mes: ");
		int m = sc.nextInt();
		switch(m) {
			case 1:
				System.out.println("És Gener i té 31 dies"); break;
			case 2:
				System.out.println("És Febrer i té 28/29 dies"); break;
			case 3:
				System.out.println("És Març i té 31 dies"); break;
			case 4:
				System.out.println("És Abril i té 30 dies"); break;
			case 5:
				System.out.println("És Maig i té 31 dies"); break;
			case 6:
				System.out.println("És Juny i té 30 dies"); break;
			case 7:
				System.out.println("És Juliol i té 31 dies"); break;
			case 8:
				System.out.println("És Agost i té 31 dies"); break;
			case 9:
				System.out.println("És Septembre i té 30 dies"); break;
			case 10:
				System.out.println("És Octubre i té 31 dies"); break;
			case 11:
				System.out.println("És Novembre i té 30 dies"); break;
			case 12:
				System.out.println("És Desembre i té 31 dies"); break;
			default: 
				System.out.println("El número del mes no és correcte");
		}
	}
}
