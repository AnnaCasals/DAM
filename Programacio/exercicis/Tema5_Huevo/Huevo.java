package Tema5_Huevo;

public class Huevo {
	class Yema {
		Yema() {
			System.out.println("Inicializando yema... ");
		}
	}
	class Clara {
		Clara() {
			System.out.println("Inicializando clara... ");
		}
	}
	Yema hazYema() {
		return new Yema();
	}
	Clara hazClara() {
		return new Clara();
	}
	public static void main(String[] args) {
		Huevo h = new Huevo();
		Yema y = h.hazYema();
		Clara c = h.hazClara();
	}
}
