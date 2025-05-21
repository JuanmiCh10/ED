package Sesion05;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		List<Mensaje>mensajeria = new ArrayList<>();
			mensajeria.add(new SMS());
			mensajeria.add(new Email());
			mensajeria.add(new Teams());
		
		for (Mensaje m:mensajeria) {
			m.enviar("Hola chavaleria.");
		
		}
	}

}
