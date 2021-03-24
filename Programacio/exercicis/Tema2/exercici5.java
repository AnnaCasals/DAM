package Tema2;
import java.util.*;
public class exercici5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix dos caràcters: ");
		char a = sc.next().charAt(0);
		//System.out.print("Introdueix segon caràcter: ");
		char b = sc.next().charAt(0);
		if(Character.isLowerCase(a) && Character.isLowerCase(b)) {
			System.out.print("El caràcter '" + a + "' '"+ b + "' són minúscules");
		} else if(Character.isLowerCase(a) && !Character.isLowerCase(b)) {
				System.out.print("El caràcter '" + a + "' és minúscula, però el caràcter '" + b + "' és majúscula");
		} else if(!Character.isLowerCase(a) && Character.isLowerCase(b)) {
			System.out.print("El caràcter '" + a + "' és majúscula i el caràcter '" + b + "' és minúscula");
		} else {
			System.out.print("El caràcter '" + a + "' '" + b + "' les dos són majúscules");
		}
	}
}

