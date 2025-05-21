package Conjuntos;

import java.util.*;

public class Numeros {

	public static void main(String[] args) {
		
		//HashSet:no admite duplicados y en el caso de números se ordena de menor a mayor pero no asegura nada como sí hace el Tree.
		
		HashSet<Integer> num = new HashSet<>();
		
		num.add(2);
		num.add(5);
		num.add(2);//no lo lee la lista porque ya esta añadido,y el HashSet no admite duplicados.
		num.add(3);
		num.add(1);
		
		System.out.println(num);
		
		
		//LinkedHashSet : Mantiene el orden de inserción (atributos añadidos) y tampoco admite duplicados.
		
		LinkedHashSet<Integer>numeros = new LinkedHashSet<>();
		
		numeros.add(5);
		numeros.add(1);
		numeros.add(5);
		numeros.add(3);
		
		System.out.println(numeros);
		
		//Tree : Ordena y tampoco admite duplicados.
		
		TreeSet <Integer> numero = new TreeSet();
		
		numero.add(2);
		numero.add(1);
		numero.add(5);
		numero.add(4);
		numero.add(3);
		numero.add(2);
		
		System.out.println(numero);
		
		//Comparator.reverseOrder() : orden inverso.
		
		TreeSet <Integer> numeross = new TreeSet(Comparator.reverseOrder());
		
		numeross.add(2);
		numeross.add(1);
		numeross.add(5);
		numeross.add(4);
		numeross.add(3);
		numeross.add(2);
		
		System.out.println(numeross);
	}
}
