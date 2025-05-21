package Conjuntos;

import java.util.*;

public class Palabras {

	public static void main(String[] args) {
		
		//HashSet : no admite duplicados.
		
		HashSet <String> palabras = new HashSet<>();
		
		palabras.add("Ale");
		palabras.add("Manzana");
		palabras.add("Juanmi");
		palabras.add("Carlos");
		palabras.add("Juanmi");//no lo lee la lista porque ya esta añadido,y el HashSet no admite duplicados.
		
		System.out.println(palabras);
		
	LinkedHashSet<String>palabrass = new LinkedHashSet<>();
		
		palabrass.add("Ale");
		palabrass.add("Juanmi");
		palabrass.add("Carlos");
		palabrass.add("Jesús");
		
		System.out.println(palabrass);
		
		TreeSet <String> palabrasss = new TreeSet<>();
		
		palabrasss.add("Ale");
		palabrasss.add("Manzana");
		palabrasss.add("Juanmi");
		palabrasss.add("Carlos");
		palabrasss.add("Juanmi");//no lo lee la lista porque ya esta añadido,y el TreeSet no admite duplicados.
		
		System.out.println(palabrasss);
		
		//Comparator.reverseOrder() : orden inverso.
		
		TreeSet <String> palabrassss = new TreeSet<>(Comparator.reverseOrder());
		
		palabrassss.add("Ale");
		palabrassss.add("Manzana");
		palabrassss.add("Juanmi");
		palabrassss.add("Carlos");
		palabrassss.add("Juanmi");//no lo lee la lista porque ya esta añadido,y el TreeSet no admite duplicados.
		
		System.out.println(palabrassss);
		
	}
}
