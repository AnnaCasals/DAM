package Programame;
import java.util.*;
public class Ahorro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
			while(a != 0) { 
				int t = 0;
				int max = 0;
				for(int i = 0; i < a; i++) {
					t += sc.nextInt();
					if(t > max) {
						max = t;
					}
				}
				System.out.println(t + " " + max);
				a = sc.nextInt();
			}
	}
}
