package Mapas;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Map;

public class PersonaMain {

	public static void main(String[] args) {
		
		/*HashMap <String, Persona> gente = new HashMap<>();
			gente.put("12345678A",new Persona("Ale",12));
			gente.put("87654321A",new Persona("Juanmi",25));
			gente.put("11223344A",new Persona("Marco",24));
			
			Scanner teclado = new Scanner(System.in);
			System.out.println("Introduce el dni a buscar: ");
			String dniBusqueda = teclado.nextLine();
			
			if(gente.containsKey(dniBusqueda)) {
				
				System.out.println("Persona con ese DNI: "+gente.get(dniBusqueda));
			}else {
				System.out.println("El DNI introducido no está en nuestro sistema.");
		}*/
			
			TreeMap <String, Persona> gente = new TreeMap<>(Collections.reverseOrder());
			gente.put("12345678A",new Persona("Ale",12));
			gente.put("87654321A",new Persona("Juanmi",25));
			gente.put("11223344A",new Persona("Marco",24));
			
			System.out.println("Listado: ");
			
			for (Map.Entry<String, Persona> entry : gente.entrySet()) {
				System.out.println(entry.getKey()+" | "+entry.getValue());
		}
	}
}
