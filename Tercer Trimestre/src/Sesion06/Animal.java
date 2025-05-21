package Sesion06;

class Animal {

	String nombre;
	Animal(String nom){
		this.nombre = nom;
	}
	
	void hacerSonido() {
		System.out.println("Animal hace sonido.");
	}
}

class Perro extends Animal {
	
	Perro(String nombre){
	super(nombre);
	}
	
	void hacerSonido () {
		System.out.println("Guau");
	}
}

class Gato extends Animal {
	
	enum tipog {salvaje,domestico}
	tipog tipo;
	
	
	Gato(String nombre,tipog tipo){
		super(nombre);
		this.tipo = tipo;
		}
	
	
	void hacerSonido() {
		if(tipo==tipog.domestico) {
			System.out.println("MIAU");
		}else if(tipo==tipog.salvaje){
			System.out.println("MIIIIIIAAAAAAAUUUUUU");
		}
	}
}
	
