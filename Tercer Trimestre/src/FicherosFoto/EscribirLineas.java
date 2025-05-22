package FicherosFoto;

import java.io.*;

public class EscribirLineas {

	public static void main(String[] args) {
		
		//PrintWriter
		
		try (PrintWriter pw1 = new PrintWriter("lineas.txt")) {
			pw1.println("Hola a todos cojones");
			pw1.println("Bienvenidos a clase.");
			pw1.println("Juanmi Pr");
			pw1.println("Un saludo");
			
		} catch(IOException e) {
			System.out.println("Error");
		}
		
	}

}
