package Tema2_figures;

public class V {
	public static void main(String[] args) {
		int a = 7;
		for(int i = 0; i < a - 1; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 3; k++) {
				System.out.print("*");
			}
			for(int l = 0; l < (a - i - 2) * 2; l++) {
				System.out.print(" ");
			}
			
			for(int m = 0; m < 3; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int z = 0; z < 1; z++) {
			for(int x = 0; x < a - 1; x++) {
				System.out.print(" ");
			}
			for(int y = 0; y < 4; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
