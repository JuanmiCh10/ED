package Sesion01;

public class MainEstudiante {

	public static void main(String[] args) {
		Curso ingles = new Curso ("Inglés");
		Estudiante e1 = new Estudiante ("Juanmi",25);
		Estudiante e2 = new Estudiante ("Jesus",25);
		
		ingles.agregarEst(e1);
		ingles.agregarEst(e2);
		
		ingles.mostrarEst();

	}

}
