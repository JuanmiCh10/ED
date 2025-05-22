package Serializacion;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmpleadoGuardar {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado ("Juanmi",2500);
		
		try {
			FileOutputStream datos = new FileOutputStream("datosEmpleados.dat");
			ObjectOutputStream salida = new ObjectOutputStream(datos);
			
			salida.writeObject(e1);
			salida.close();
			System.out.println("Empleado guardado.");
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
