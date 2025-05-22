package AgendaContactos;

import java.io.*;
import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		try (FileWriter ac1 = new FileWriter("Agenda.txt",true)) {
			System.out.println("Introduce nombre del contacto.");
			String nombre = teclado.nextLine();
			System.out.println("Introduce teléfono del contacto.");
			String telefono = teclado.nextLine();
			
			ac1.write("Nombre: "+nombre+" || Teléfono: "+telefono+"\n ");
			
		} catch(IOException e) {
			System.out.println("Error");
		}	
	}
}
