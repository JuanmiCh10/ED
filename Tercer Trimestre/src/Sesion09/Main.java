package Sesion09;

import java.util.ArrayList;
import java.util.List;

import Sesion09.Gato.tipog;

public class Main {

	public static void main(String[] args) {
			
				//Crear lista
		
				List<Animal> domesticos = new ArrayList<>();
				
					//add: añadir elementos
				
					domesticos.add(new Gato("Garfio",tipog.salvaje));
					domesticos.add(new Perro("Tyson"));
					domesticos.add(new Gato("Bobby ",tipog.domestico));
					domesticos.add(new Perro("Dibu"));
					
					domesticos.add(1,new Perro("Rocky")); //se añade en la posición,recuerda empieza en 0.
					
					//size: tamaño
					
					System.out.println("Hay "+domesticos.size()+" animales.");
					
					//consultar posición
					
					System.out.print("\nEl animal de la posición 2 es "+domesticos.get(2).nombre+" y hace ");
					domesticos.get(2).hacerSonido();
					System.out.print("El animal de la posición 0 es "+domesticos.get(0).nombre+" y hace ");
					domesticos.get(0).hacerSonido();
					System.out.print("El animal de la posición 1 es "+domesticos.get(1).nombre+" y hace ");
					domesticos.get(1).hacerSonido();
					
					//reemplazar
					
					domesticos.set(1, new Perro("Pastelito"));
					System.out.print("El animal de la posición 1 ha cambiado y ahora es "+domesticos.get(1).nombre+" y hace ");
					domesticos.get(1).hacerSonido();
					
					//ver si está (si contiene)
					
					Animal a1 = new Gato ("Pelusa",tipog.salvaje); 
					Animal a2 = new Perro ("Antonio");
					
					domesticos.add(a1);
					
					System.out.println("\n¿Pelusa está?"+domesticos.contains(a1));
					System.out.println("¿Dibu  está?"+domesticos.contains(a2)+"\n");
					
					
					//remove: quitar algo
					
					domesticos.remove(0);
					
						System.out.println("\nLista de animales: \n");
					for (Animal a : domesticos) {
						System.out.println(a.nombre);
					}
					
					//clear: borrar lista
						
						System.out.println("\n¿Está vacía la lista?"+domesticos.isEmpty());
						domesticos.clear();
						System.out.println("¿Está vacía la lista?"+domesticos.isEmpty());

		}
	}

