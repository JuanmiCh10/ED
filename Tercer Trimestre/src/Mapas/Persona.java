package Mapas;

import java.util.*;

public class Persona {

	String nombre;
	int edad;
	
	Persona (String nombre,int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String toString() {
		return nombre+" | "+edad;
	}
	
}
