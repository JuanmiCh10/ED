package Serializacion3;

import java.io.Serializable;

public class Vehiculo implements Serializable {
	String marca;
	int año;
	
	Vehiculo(String marca,int año){
		this.marca = marca;
		this.año = año;
	}
	public String descripcion() {
		return "Marca: "+marca+" | Año: "+año;
	}
}

	class Coche extends Vehiculo {
		
		int puertas;
		
		Coche(String marca,int año,int puertas){
			super(marca,año);
			this.puertas = puertas;
		}
		public String descripcion() {
			return "\nCoche:  "+super.descripcion()+" | Número de puertas: "+puertas+"\n";
		}

	}
		
	class Moto extends Vehiculo {
			
		int cilindrada;
			
		Moto(String marca,int año,int cilindrada){
			super(marca,año);
			this.cilindrada = cilindrada;
			}
		
		public String descripcion() {
			return "\nMoto:  "+super.descripcion()+" | Cilindrada: "+cilindrada+" CC\n";
		}
	}

	


