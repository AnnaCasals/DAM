package dado;

import java.util.Random;

public class Dado {
	int num;
	//Dado() {
		//num = 0;
	//}
	void tirada() {
		//Random rnd = new Random();
		//num = (int) (rnd.nextDouble() * 6) + 1;
		num = (int) (Math.random()*6 + 1);
	}
	void printTirada() {
		System.out.println("El valor de la tirada és " + num);
	}
	int valor() {
		return num;
	}

}
