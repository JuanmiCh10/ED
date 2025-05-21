package Sesion01;

import java.util.ArrayList;

public class Producto {
	
	String nombre;
	double precio;
	
	Producto (String nom,double pre){
		this.nombre = nom;
		this.precio = pre;
	}

}

class Pedido {
	
	int numPedido;
	ArrayList<Producto> ticket; //Productos = ticket.
	
	Pedido(int numP){
		this.numPedido=numP;
		this.ticket=new ArrayList<>();
		
	}
	
	void agregarProd (Producto articulo) {
		ticket.add(articulo);
		
		}
	
	void mostrarTicket() {
		System.out.println("\nNúmero de pedido: "+numPedido);
		for(Producto p : ticket) {
			System.out.println("\n-------------------------\n");
			System.out.println("Producto: "+p.nombre+"\nPrecio: "+p.precio+" €");
		}
	}
	
}
