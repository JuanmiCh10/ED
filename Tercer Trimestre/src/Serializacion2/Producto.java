package Serializacion2;

import java.io.Serializable;

public class Producto implements Serializable {
	
	String nombre;
	double precio;
	
	Producto(String nombre,double precio){
		this.nombre = nombre;
		this.precio = precio;
	}

	
	
	String getNombre() {
		return nombre;
	}



	void setNombre(String nombre) {
		this.nombre = nombre;
	}



	double getPrecio() {
		return precio;
	}



	void setPrecio(double precio) {
		this.precio = precio;
	}



	public String toString() {
		return "\nNombre: "+nombre+" | Precio: "+precio+" €\n";
	}
}
