package Examen;
import java.util.*;
public class Exercici4 {
	public static void main(String[] args) {
		int a = 0;
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix un número enter positiu: ");
		int i = sc.nextInt();
		while(a != 5) {
			if(i > 0) {
				System.out.println("OPCIONES: ");
				System.out.println("1. Decir si es o no primo.");
				System.out.println("2. Calcular el factorial.");
				System.out.println("3. Ver tabla.");
				System.out.println("4. Introducir otro número.");
				System.out.println("5. Salir del programa.");
				System.out.println("   Elige una opción...");
				int opc = sc.nextInt();
				switch(opc) {
				case 1:
					int h = 0;
					for(int q = 2; q < i; q++) {
						if(i % q == 0) {
							h = h + 1;
						}
					}
					if(h == 0) {
						System.out.println("El numero introducido es primo");
					} else {System.out.println("El número introducido NO es primo");	}
					a = 1;
					break;
				case 2:
					for(int k = 1; k <= i; k++) {
						fact *= k;
					}
					System.out.println("El factorial es: " + fact);
					a = 2;
					break;
				case 3: 
					for(int j = 0; j <= 10; j++) {
						System.out.println(i + " x " + j + " = " + (j * i));
					}
					a = 3;
					break;
				case 4: 
					System.out.println("Introduce el nuevo número: ");
					i = sc.nextInt();
					a = 4;
					break;
				case 5: a = 5; break;
				default: break;
				}
			}
		}
	}
}
