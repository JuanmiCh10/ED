package Sesion07;

public interface Figura {
	void dibujar();
}

class Circulo implements Figura{
	public void dibujar() {
		System.out.println("Dibujando círculo.");
	}
}

class Cuadrado implements Figura{
	public void dibujar() {
		System.out.println("Dibujando cuadrado.");
	}
}
