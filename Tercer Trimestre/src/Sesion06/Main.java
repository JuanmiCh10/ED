package Sesion06;

import Sesion06.Gato.tipog;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Animal [] domesticos = {new Perro("Toby"),new Gato("Misifu",tipog.salvaje),new Gato("Gala",tipog.domestico)};
		
		for (Animal a : domesticos) {
			System.out.print(a.nombre+": ");
			a.hacerSonido();
		
		}
	}
}

