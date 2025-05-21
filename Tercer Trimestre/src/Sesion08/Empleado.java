package Sesion08;

public abstract class Empleado {
	String nombre;
	
	Empleado(String nombre){
		this.nombre = nombre;
	}
	
	public abstract double calcularSueldo();
	
	public void mostrarInfo() {
		System.out.println("Nombre: "+nombre+"\nSalario: "+calcularSueldo()+" €\n");
	}
}

	class Asalariado extends Empleado{
		double salario;
		
		Asalariado(String nombre,double salario){
			super(nombre);
			this.salario = salario;
		}
		public double calcularSueldo() {
			return salario;
		}
}
	
	class porHoras extends Empleado {
		double pagoHora;
		double horas;
		
		porHoras(String nombre,double pagoHora,double horas){
			
			super(nombre);
			this.pagoHora = pagoHora;
			this.horas = horas;
		}
		
		public double calcularSueldo () {
				return pagoHora * horas;
		}
	}


