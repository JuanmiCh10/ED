package Ficheros;

import java.util.Scanner;
import java.io.*;

public class EscribirNombre {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		try (FileWriter f2 = new FileWriter("nombres.txt")){
			for(int i = 0;i < 3;i++) {
				System.out.println("Introduce el nombre: ");
				String nombre = teclado.nextLine();
				f2.write("Nombre: "+nombre+"\n");
			}
		}catch (IOException e) {
			System.out.println("Error");
		}
		teclado.close();
		
		try { 
			FileReader fr2 = new FileReader("nombres.txt");
			int a;
			while((a = fr2.read()) != -1) {
				System.out.print((char) a);
			}
			fr2.close();
		} catch (IOException e) {
			System.out.println("Error");
		}
	}
}