package Sesion05;

public interface Mensaje {

	void enviar(String msj);
	
}
class SMS implements Mensaje{

	public void enviar(String msj) {
		System.out.println("Se ha enviado el siguiente mensaje por SMS: "+msj);
	}
}

class Email implements Mensaje{
	
	public void enviar(String msj) {
		System.out.println("Se ha enviado el siguiente mensaje por email: "+msj);
	}
}

class Teams implements Mensaje{
	
	public void enviar(String msj) {
		System.out.println("Se ha enviado el siguiente mensaje por Teams: "+msj);
	}
}
