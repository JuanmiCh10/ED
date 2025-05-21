package RepasarConjuntos;

public class Alumno implements Comparable<Alumno>{

	String nombre; 
	int nota;
	
	Alumno (String nom,int nota){
		this.nombre = nom;
		this.nota = nota;
		
	}

	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	int getNota() {
		return nota;
	}

	void setNota(int nota) {
		this.nota = nota;
	}

	//Comparar notas de alumnos.
	
	
	public int compareTo(Alumno a) {
		return Integer.compare(this.nota, a.nota);
	}
	
}
