package tema1;

public class exercici7 {
	public static void main(String[] args) {
		int c = 110;
		System.out.println("variable = " + c);
		System.out.println(c < 0 ? "És negatiu" : "És positiu");
		System.out.println(c % 2 == 0 ? "És parell" : "És imparell");
		System.out.println(c % 5 == 0 ? "ÉS múltiple de 5" : "NO ÉS múltiple de 5");
		System.out.println(c % 10 == 0 ? "ÉS múltiple de 10" : "NO ÉS múltiple de 10");
		System.out.println(c == 100 ? "És igual que 100" : c < 100 ? "És MENOR que 100" : "És MAJOR que 100");
	}
}
