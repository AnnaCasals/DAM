package tema3;

public class Rebajas {
	private double original;
	private double rebajado;
	Rebajas() {
		original = 0; rebajado = 0;
	}
	public void setOriginal(double o) { original = o; }
	public void setRebajado(double d) { rebajado = d; }
	public void printDes() {
		System.out.println("El precio original és: " + original + " el rebajado és: "
				+ rebajado);
	}
	public double descubrePorcentaje(double o, double d) {
		double des = o - d;
		double b = des * 100 / o;
		return b;
	}
	public static void main(String[] args) {
		Rebajas a = new Rebajas();
		double des = a.descubrePorcentaje(40, 30);
		System.out.println(des);
	}
}
