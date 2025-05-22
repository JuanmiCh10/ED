package Serializacion2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ProductoLeer {

	public static void main(String[] args) {
		
		try {
			FileInputStream producto = new FileInputStream("datosProductos.dat");
			ObjectInputStream entrada = new ObjectInputStream(producto);
			
			
			ArrayList<Producto>productos = (ArrayList<Producto>) entrada.readObject();
			
			entrada.close();
			
			for(Producto p : productos) {
				System.out.println(p);
			}
			
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Error.");
		}

	}

}
