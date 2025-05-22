package Serializacion2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ProductoGuardar {

	public static void main(String[] args) {
		
		ArrayList<Producto> productos = new ArrayList<>();
			productos.add(new Producto("Microondas",25.99));
			productos.add(new Producto("Air Frier",69.99));
			productos.add(new Producto("Frigorífico",699.99));
		
		try {
			FileOutputStream producto = new FileOutputStream("datosProductos.dat");
			ObjectOutputStream salida = new ObjectOutputStream(producto);
			
			salida.writeObject(productos);
			salida.close();
			System.out.println("Lista de productos guardada.");
			
		}catch (IOException e) {
			e.printStackTrace();
			
		}
	}

}
