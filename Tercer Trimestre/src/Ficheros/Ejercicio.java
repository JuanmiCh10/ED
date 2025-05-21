package Ficheros;

import java.io.*;
import java.util.*;

public class Ejercicio {

	public static void main(String[] args) {
		
		File a1 = new File("tareas.txt");
		
		if(!a1.exists()) {
			System.out.println("El archivo no existe.");
		}
			try(FileWriter fw1 = new FileWriter(a1,false)) {
				fw1.write("Fregar los platos.");
				fw1.write("Poner lavadora.");
		}catch (IOException e) {
			System.out.println("Error");
		}
			Scanner teclado = new Scanner(System.in);
			try(FileWriter fw1 = new FileWriter(a1,true)){
				System.out.println("Añade tarea.");
				String tarea = teclado.nextLine();
				fw1.write(tarea);
			}catch(IOException e) {
				System.out.println("Error.");
			}
			
			try { 
				FileReader fw1 = new FileReader("tareas.txt");
				int a;
				while((a = fw1.read()) != -1) {
					System.out.print((char) a);
				}
				fw1.close();
			} catch (IOException e) {
				System.out.println("Error");
			}
	}
}
