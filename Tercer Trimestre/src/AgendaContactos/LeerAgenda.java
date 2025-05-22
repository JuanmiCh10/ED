package AgendaContactos;

import java.io.*;

public class LeerAgenda {

	public static void main(String[] args) {
		
		try(BufferedReader br1 = new BufferedReader (new FileReader("Agenda.txt"))){
			String linea;
			//	Para contar lineas
			int contador = 0;
			while((linea=br1.readLine()) != null) {
			contador++;
			System.out.println(linea);
			} 
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
