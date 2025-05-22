package FicherosFoto;

import java.io.*;

public class CopiarTexto2 {

	public static void main(String[] args) {
		
		try(BufferedReader br2 = new BufferedReader (new FileReader("lineas.txt"));
			PrintWriter pw2 = new PrintWriter ("copialineas2.txt")){
			String linea;
			
			while((linea=br2.readLine()) != null) {
			pw2.println(linea);
			} 
			System.out.println("Realizado con éxito.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
