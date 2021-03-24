package Utilidades.mates;

public class Potenciar {
	public int potencia(int b, int i) {
		//return (int)Math.pow(b, i);
		int res = 1;
		for(int j = 1; j <= i; j++) {
			res *= b;
		}
		return res;
	}
}
