package Sesion02;

public class MainEmpresa {

	public static void main(String[] args) {
		
		Desarrollador des = new Desarrollador ("Juanmi",350,"Java");
		Gerente ger = new Gerente ("Ale","Informática");
		
		ger.mostrarInfo();
		des.mostrarInfo();
	}

}
