package Ficheros;

import java.io.*;

public class EscribirFichero {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("saludos.txt");
			fw.write("¡HOLA!");
			fw.close();
		} catch (IOException e) {
			System.out.println("Error");
		}
		try {
			FileWriter fw = new FileWriter("saludos.txt",true);//true = añade nueva información
			fw.write("¿Qué tal?");
			fw.close();
		} catch (IOException e) {
			System.out.println("Error");
		}
		try {
			FileWriter fw = new FileWriter("saludos.txt",false);//false = sobreescribe
			fw.write("Hola de nuevo");
			fw.close();
		} catch (IOException e) {
			System.out.println("Error");
		}
		try {
			FileReader fr = new FileReader ("saludos.txt");
			int contador = 1;
			int caracter;
			while((caracter = fr.read()) != -1) {
				if(caracter == '\n') {
					System.out.println(contador+".-");
					contador++;
				}
			}
			fr.close();
		} catch (IOException e) {
			System.out.println("Error");
		}
	}
}
