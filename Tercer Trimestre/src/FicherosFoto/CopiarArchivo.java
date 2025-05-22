package FicherosFoto;

import java.io.*;

public class CopiarArchivo {

	public static void main(String[] args) {
	
		try (
			 FileInputStream in = new FileInputStream("foto.jpg");
			 FileOutputStream out = new FileOutputStream("copia.jpg");
		){
			
			byte [] buffer = new byte [1024];
			int bytesL;
			while((bytesL=in.read(buffer)) != -1) {
				out.write(buffer, 0, bytesL); //(de qué,cuál empieza,de cuántos)
			}
		
		} catch (IOException e) {
			
			System.out.println("Error");
			e.printStackTrace(); //para que te dé la info del error.
		}
	}
}


