package Sesion01;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private int edad;
	String uni;
	
	Estudiante(String nom,int edad) {
		this.nombre = nom;
		this.edad=edad;
		this.uni="US";
		
	}

	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	int getEdad() {
		return edad;
	}

	void setEdad(int edad) {
		this.edad = edad;
	}

	String getUni() {
		return uni;
	}

	void setUni(String uni) {
		this.uni = uni;
	}
 
}

class Curso {
		String nombre;
		ArrayList<Estudiante> estudiantes;
		
		Curso (String nombre){
			this.nombre=nombre;
			this.estudiantes=new ArrayList<>();
		}
		
		void agregarEst(Estudiante alumno) {
			estudiantes.add(alumno);
		}
		void mostrarEst() {
			System.out.println("\nCurso: "+nombre);
			for(Estudiante est : estudiantes) {
				System.out.println("\n-------------------------\n");
				System.out.println("Nombre: "+est.getNombre()+"\nEdad: "+est.getEdad()+"\nUniversidad: "+est.uni);
			}
		}
}

