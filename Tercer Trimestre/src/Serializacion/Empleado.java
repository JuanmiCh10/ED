package Serializacion;

import java.io.Serializable;

public class Empleado implements Serializable {
	String nombre;
	double salario;
	
	Empleado(String nombre,double salario){
		this.nombre = nombre;
		this.salario = salario;
	}

	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	double getSalario() {
		return salario;
	}

	void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "Nombre: "+nombre+" | Salario: "+salario+" €";
	}
	
}
