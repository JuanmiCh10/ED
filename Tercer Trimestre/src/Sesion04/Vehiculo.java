package Sesion04;

public interface Vehiculo {

	void acelerar();
	void frenar();
	
}
	interface VehicElect {
		void cargar ();
	}

 class Coche implements Vehiculo {
	 
	public void acelerar() {
		System.out.println("El coche acelera.");
	}
	
	public void frenar() {
		System.out.println("El coche frena.");
	}
 }
 
 class Yego implements Vehiculo,VehicElect {
	 
	 String nombre;
	 Yego(String nom){
		 this.nombre = nom;
	 }
	public void cargar() {
		System.out.println("La yego "+nombre+" se carga.");
	}
	
	public void acelerar() {
		System.out.println("La yego "+nombre+" acelera.");
	}
	
	public void frenar() {
		System.out.println("La yego "+nombre+" frena.");
	}
	
 }
 	