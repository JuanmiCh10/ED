package Sesion01;

public class MainCliente {

	public static void main(String[] args) {
		Cliente cl1 = new Cliente ("Pedro Pascal",2808);
		Pediido p1 = new Pediido (101,cl1);
		p1.mostrarPedido();

	}

}
