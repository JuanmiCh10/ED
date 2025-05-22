package FicherosFoto;

import java.io.*;

public class CopiarTexto {

	public static void main(String[] args) {
		
	//PRIMERA FORMA DE COPIAR TEXTO
		try (
				 FileInputStream in = new FileInputStream("lineas.txt");
				 FileOutputStream out = new FileOutputStream("copialineas.txt");
			){
				
				byte [] buffer = new byte [1024];
				int bytesL;
				while((bytesL=in.read(buffer)) != -1) {
					out.write(buffer, 0, bytesL); //(de qué,cuál empieza,de cuántos)
				}
			
			} catch (IOException e) {
				
				System.out.println("Error");
				e.printStackTrace();

		}
	}
}

