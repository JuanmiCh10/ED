package Sesion07;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
			List<Figura>poligono = new ArrayList<>();
			poligono.add(new Circulo());
			poligono.add(new Cuadrado());
			
			for(Figura f:poligono){
				f.dibujar();
			}
	}

}
