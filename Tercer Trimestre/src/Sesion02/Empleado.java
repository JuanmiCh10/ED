package Sesion02;

public class Empleado {
	
	String nombre;
	double salarioBase;
	
	Empleado (String nom){
		
		this.nombre = nom;
		this.salarioBase = 1500;
	}
	
	void mostrarInfo () {
		System.out.println("Empleado: "+nombre+ "\nSalario Base: "+salarioBase);
	}

	
}
class Desarrollador extends Empleado {
	
	String lenguaje;
	Desarrollador(String nombreL,double extra,String lenguaje){
		super(nombreL);
		this.salarioBase += extra;
		this.lenguaje = lenguaje;
	}
	void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Lenguaje: "+lenguaje);
	}
}

class Gerente extends Empleado {
	
	String departamento;
	Gerente (String nombre,String dpto){
		super(nombre);
		this.salarioBase += 500;
		this.departamento = dpto;
	}
	void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Departamento: "+departamento);
	}
}