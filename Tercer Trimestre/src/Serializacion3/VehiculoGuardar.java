package Serializacion3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.IOException;


public class VehiculoGuardar {

	public static void main(String[] args) {
		
		ArrayList<Vehiculo>concesionario = new ArrayList<>();
			concesionario.add(new Coche("Peugeot",2018,5));
			concesionario.add(new Coche("Mercedes",2023,5));
			concesionario.add(new Moto("Bmw",2025,895));
			concesionario.add(new Moto("Suzuki",2015,652));
		
		try {
		FileOutputStream datosVeh = new FileOutputStream("datosVehiculos.dat");
		ObjectOutputStream salida = new ObjectOutputStream(datosVeh);
		
		salida.writeObject(concesionario);
		salida.close();
		
		System.out.println("Lista de vehículos en el concesionario guardada.");
		
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
