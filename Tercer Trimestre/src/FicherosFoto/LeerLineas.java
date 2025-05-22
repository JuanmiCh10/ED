package FicherosFoto;

import java.io.*;

public class LeerLineas {

	public static void main(String[] args) {
		
		//BufferedReader
		
		try(BufferedReader br1 = new BufferedReader (new FileReader("lineas.txt"))){
			String linea;
			//	Para contar lineas
			int contador = 0;
			while((linea=br1.readLine()) != null) {
			contador++;
			System.out.println(linea);
			} 
			System.out.println(contador+" línea/s.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
