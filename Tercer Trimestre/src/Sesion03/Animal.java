package Sesion03;

 abstract class Animal {
	String nombre;
	
	Animal (String nom){
		this.nombre = nom;
	}
	
	abstract void hacerSonido();

}

class Perro extends Animal {
	Perro (String nombre){
		super(nombre);
	}
	
	void hacerSonido() {
		System.out.println("Guau guau");
	}
}
