package Serializacion3;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class VehiculoLeer {

	public static void main(String[] args) {
		
		try {
			
		
		FileInputStream producto = new FileInputStream("datosVehiculos.dat");
		ObjectInputStream entrada = new ObjectInputStream(producto);
		
		ArrayList<Vehiculo> concesionario = (ArrayList <Vehiculo>) entrada.readObject();
		
		entrada.close();
		
		for(Vehiculo v : concesionario) {
			System.out.println(v.descripcion());
		}
		
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Error.");
		}
		
	}

}
