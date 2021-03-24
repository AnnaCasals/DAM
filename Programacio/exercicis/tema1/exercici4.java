package tema1;

public class exercici4 {
	public static void main(String[] args) {
		int a = 1, b = 2, c = 3, d = 4;
		int aux = b;
		System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d);
		b = c;
		System.out.println("b = " + b + " c = " + c);
		c = a;
		System.out.println("c = " + c + " a = " + a);
		a = d;
		System.out.println("a = " + a + " d = " + d);
		d = aux;
		System.out.println("d = " + d + " b = " + aux);
	}
}
