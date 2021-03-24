package Animales;

public class Programa {
	public static void main(String[] args) {
		Avestruz a = new Avestruz();
		System.out.print("El " + a.getEspecie() + " ");
		hacerCaminar(a);
		esSalvaje(a.getSalvaje());
		queColor(a.getColor());
		
		Loro l = new Loro();
		System.out.print("\nEl " + l.getEspecie() + " ");
		hacerCaminar(l); hacerVolar(l); 
		esSalvaje(l.getSalvaje());
		queColor(l.getColor());
		
		Murcielago m = new Murcielago();
		System.out.print("\nEl " + m.getEspecie() + " ");
		hacerCaminar(m); hacerVolar(m); 
		esSalvaje(m.getSalvaje());
		cuantasPatas(m.getPatas());
		queColor(m.getColor());
		
		Tigre t = new Tigre();
		System.out.print("\nEl " + t.getEspecie() + " ");
		hacerCaminar(t); hacerNadar(t); 
		esSalvaje(t.getSalvaje());
		cuantasPatas(t.getPatas());
		queColor(t.getColor());
		
		Gato g = new Gato();
		System.out.print("\nEl " + g.getEspecie() + " ");
		hacerCaminar(g); hacerNadar(g); 
		esSalvaje(g.getSalvaje());
		cuantasPatas(g.getPatas());
		queColor(g.getColor());
	}
	
	public static void hacerCaminar(PuedeCaminar caminar) {
		caminar.caminar();
	}
	public static void hacerVolar(PuedeVolar volar) {
		volar.volar();
	}
	public static void hacerNadar(PuedeNadar nadar) {
		nadar.nadar();
	}
	public static void esSalvaje(boolean a) {
		if(a) { System.out.print("es salvaje,"); 
		} else { System.out.print("no es salvaje,");}
	}
	public static void cuantasPatas(int a) {
		System.out.print(" tiene " + a + " patas");
	}
	public static void queColor(String s) {
		System.out.print(" y es de color " + s);
	}
}

