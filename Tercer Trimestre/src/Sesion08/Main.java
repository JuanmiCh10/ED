package Sesion08;

import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		List<Empleado> empleados = new ArrayList <>();
		empleados.add(new Asalariado("Juanmi",2000));
		empleados.add(new porHoras("Ale",123,12));
		
		for(Empleado e:empleados) {
			System.out.println("Empleado: \n");
			e.mostrarInfo();
		}
	}

}
