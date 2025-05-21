package Sesion01;

public class MainProducto {

	public static void main(String[] args) {
		
		Pedido p1 = new Pedido (101);
		Producto pro1 = new Producto ("TV",879.99);
		Producto pro2 = new Producto ("Play 5",499.99);
		
		p1.agregarProd(pro1);
		p1.agregarProd(pro2);
		
		p1.mostrarTicket();
		 
		
		

	}

}
