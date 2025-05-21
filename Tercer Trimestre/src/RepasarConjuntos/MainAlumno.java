package RepasarConjuntos;

import java.util.*;

public class MainAlumno {

	public static void main(String[] args) {
		
		
		TreeSet<Alumno> clase = new TreeSet<>();
		
		clase.add(new Alumno ("Juanmi",8));
		clase.add(new Alumno ("Jesús",7));
		clase.add(new Alumno ("Carlos",4));
		clase.add(new Alumno ("Marco",6));
		clase.add(new Alumno ("Arafat",5));
		
			System.out.println("---------------------------\n");
			System.out.println("·Lista de alumnos·\n");
			
		for (Alumno a : clase) {
			System.out.println("Nombre : "+a.nombre+"\nNota : "+a.nota+"\n" );
		}
		
		
		//Se compara alfabeticamente el nombre primero y en el caso de estar el nombre repetido se ordena según la nota.
		
		TreeSet<Alumno> clasee = new TreeSet<>(Comparator.comparing(Alumno::getNombre).thenComparing(Alumno::getNota));
		
		clasee.add(new Alumno ("Juanmi",8));
		clasee.add(new Alumno ("Jesús",7));
		clasee.add(new Alumno ("Carlos",6));
		clasee.add(new Alumno ("Carlos",4));
		clasee.add(new Alumno ("Arafat",5));
		
			System.out.println("---------------------------\n");
			System.out.println("·Lista de alumnos·\n");
			
		for (Alumno a : clasee) {
			System.out.println("Nombre : "+a.nombre+"\nNota : "+a.nota+"\n" );
		}
		
		//Se compara la nota primero y en el caso de estar la nota repetida se ordena según el nombre.
		
		TreeSet<Alumno> claseee = new TreeSet<>(Comparator.comparingInt(Alumno::getNota).thenComparing(Alumno::getNombre));
				
		claseee.add(new Alumno ("Juanmi",8));
		claseee.add(new Alumno ("Jesús",7));
		claseee.add(new Alumno ("Carlos",7));
		claseee.add(new Alumno ("Marco",6));
		claseee.add(new Alumno ("Arafat",5));
		
			System.out.println("---------------------------\n");
			System.out.println("·Lista de alumnos·\n");
						
		for (Alumno a : claseee) {
			System.out.println("Nombre : "+a.nombre+"\nNota : "+a.nota+"\n" );
		}
	}
}