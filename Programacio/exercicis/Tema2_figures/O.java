package Tema2_figures;

public class O {
	public static void main(String[] args) {
		int a = 9;
		for(int b = 1; b < a / 3; b++) {
			for(int c = 0; c < a; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int d = 0; d < a / 3; d++) {
			for(int e = 0; e < a/ 3; e++) {
				System.out.print("*");
			}
			for(int f = 0; f < a / 3; f++) {
				System.out.print(" ");
			}
			for(int g = 0; g < a / 3; g++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int h = 1; h < a / 3; h++) {
			for(int i = 0; i < a; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
