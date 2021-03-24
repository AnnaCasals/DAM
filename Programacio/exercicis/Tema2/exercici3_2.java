package Tema2;
import java.util.*;
import java.io.*;
public class exercici3_2 {
	public static void main(String[] args) throws IOException {
		char car;
		System.out.print("Introdueix un caràcter: ");
		car = (char)System.in.read();
		if(Character.isUpperCase(car)) {
			System.out.println("EL caràcter SÍ que és majúscula");
		} else {
			System.out.println("El caràcter NO és majúscula");
		}
	}
}
