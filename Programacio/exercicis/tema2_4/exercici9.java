package tema2_4;

import java.util.Random;

public class exercici9 {
	public static void main ( String [ ] args) {
		//int valor = (int)(Math.random() * 100) + 100;
		Random rnd = new Random();
		int valor = rnd.nextInt(100) + 100;
		if(valor % 2 == 0) {
			System.out.println(valor + " és parell");
		} else {
			System.out.println(valor + " és imparell");
		}
		
		}

}
