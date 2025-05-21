package Mapas;

import java.util.*;

public class Alumno {

	public static void main(String[] args) {
		
		//Crear mapa.
		Map <String, Double> notas = new HashMap<>();
		
		//Añadir alumnos en el mapa con sus notas.
			notas.put("Rosa", 4.86);//(Primer Atributo-Key,Segundo Atributo,etc)
			notas.put("Juanmi", 9.86);
			notas.put("Carlos", 5.86);
			notas.put("Lucía", 6.86);
			notas.put("Jesús", 8.86);
			
		//Modificar.
			notas.put("Rosa", 6.53);
			
			System.out.println(notas.get("Jesús"));
			
		//Quitar algo,solo escribimos la clave -key.
			notas.remove("Carlos");
			
		//Hacer media.
			double suma = 0;
			
			for (double nota:notas.values()) {
					suma+=nota;
			}
			
			double media = suma/notas.size();
			
			System.out.println(notas+"\n");
			
			for(String nombre:notas.keySet()) {
				System.out.println(nombre+": "+notas.get(nombre)+"\n");
			}
			
			for(Map.Entry<String, Double> entryAl : notas.entrySet()) {
				System.out.println(entryAl.getKey()+": "+entryAl.getValue());
			}
			
			System.out.println("\nLa media es "+media);

	}

}
