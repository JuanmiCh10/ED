package Serializacion;

import java.io.*;

public class EmpleadoLeer {

	public static void main(String[] args) {
		
		try {
			FileInputStream datos = new FileInputStream("datosEmpleados.dat");
			ObjectInputStream entrada = new ObjectInputStream(datos);
			
			Empleado empLeido = (Empleado) entrada.readObject();
			entrada.close();
			
			System.out.println(empLeido);
			
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Error.");
		}

	}

}
