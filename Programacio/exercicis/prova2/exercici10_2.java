package prova2;


public class exercici10_2 {
	public static void main(String[] args) {
		int cantidad = 1897;
	
		int b500 = cantidad/500;
		System.out.println(b500 + " billetes de 500");
		int cambio = cantidad - (b500 * 500);
	
		int b200 = cambio/200;
		System.out.println(b200 + " billetes de 200");
		cambio = cambio - (b200 * 200);
	
		int b100 = cambio/100;
		System.out.println(b100 + " billetes de 100");
		cambio = cambio - (b100 * 100);
	
		int b50 = cambio/50;
		System.out.println(b50 + " billetes de 50");
		cambio = cambio - (b50 * 50);
	
		int b20 = cambio/20;
		System.out.println(b20 + " billetes de 20");
		cambio = cambio - (b20 * 20);
	
		int b10 = cambio/10;
		System.out.println(b10 + " billetes de 10");
		cambio = cambio - (b10 * 10);
	
		int b5 = cambio/5;
		System.out.println(b5 + " billetes de 5");
		cambio = cambio - (b5 * 5);
		
		int m2 = cambio/2;
		System.out.println(m2 + " monedas de 2");
		cambio = cambio - (m2 * 2);
		
		System.out.print(cambio + " monedas de 1");
	}
}
