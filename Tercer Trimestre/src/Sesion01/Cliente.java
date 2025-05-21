package Sesion01;

public class Cliente {
	String nombre;
	int numSocio;
	
	Cliente(String nom, int num){
	this.nombre=nom;
	this.numSocio=num;
	}
	
}

	class Pediido {
		int numPedido;
		Cliente cliente;
		
		Pediido(int num,Cliente cli){
			this.numPedido=num;
			this.cliente=cli;
		}
		
		void mostrarPedido() {
			System.out.println("Número Pedido: "+numPedido+ "\nNúmero Socio: "+cliente.numSocio+ "\nNombre Cliente: "+cliente.nombre);
			
		}
	}
