package Tema2;
import java.util.*;
public class exercici9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix l'hora: ");
		int h = sc.nextInt();
	//while(h < 0 || h > 23) {
		//	System.out.println("L'hora NO es correcta, introdueix una hora vàlida: ");
			//h = sc.nextInt();
		//}
		System.out.print("Introdueix els minuts: ");
		int m = sc.nextInt();
		//while(m < 0 || m > 59) {
			//System.out.println("Els minuts NO són correctes, introdueix uns minuts vàlids: ");
			//m = sc.nextInt();
		//}
		System.out.print("Introdueix els segons: ");
		int s = sc.nextInt();
		//while(s < 0 || s > 59) {
			//System.out.println("Els segons NO són correctes, introdueix uns segons vàlids: ");
			//s = sc.nextInt();
		//}
		if(h < 0 || h > 23) { System.out.println("L'hora és incorrecta"); 
		} else if(m < 0 || h > 59) { System.out.println("Els minuts són incorrectes"); 
		} else if(s < 0 || s > 59) { System.out.println("Els segons són incorrectes"); }
		
	}
}
