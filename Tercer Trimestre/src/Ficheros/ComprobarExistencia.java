package Ficheros;

import java.io.*;

public class ComprobarExistencia {

	public static void main(String[] args) {
		
		File archivo = new File("nombres.txt");
		
		if(archivo.exists()) {
			System.out.println("Ruta: "+archivo.getAbsolutePath());
			System.out.println("Escribible: "+archivo.canWrite());
			System.out.println("Tamaño: "+archivo.length()+" bytes.");
			
		} else {
			System.out.println("El archivo no existe.");
		}
	}
}
