package metodos_arrayList;

import java.util.ArrayList;

public class ArrayFrutas {
	
	public static void main(String[] args) {
		
		ArrayList<String> frutas = new ArrayList<>();
		
		// Añade las siguientes frutas repetidamente hasta alcanzar 50 elementos: //manzana, plátano, naranja, pera, fresa, uva, kiwi.
		
		String[] frutasDisponibles = {"manzana", "plátano", "naranja", "pera", "fresa", "uva", "kiwi"};
		
		/*
		while (frutas.size() < 50) {
			for (String frutass : frutasDisponibles) {
				if (frutas.size() < 50) {
					frutas.add(frutass);
				} 
			}
		}
		*/
		
		for (int i = 0; i < 50; i++) {
			frutas.add(frutasDisponibles [i % frutasDisponibles.length]);
		}
		
		System.out.println("FOR");
		System.out.println("-----");
		for (int i = 0; i < frutas.size(); i++) {
			System.out.print(frutas.get(i) + " ");
		}
		
		System.out.println();
		System.out.println("Tamaño actual [" + frutas.size() + "].");
		System.out.println();
		System.out.println("FOR EACH");
		System.out.println("-----");
		for (String fruta : frutas) {
			System.out.print(fruta + " ");
		}
		
		System.out.println();
		System.out.println("Tamaño actual [" + frutas.size() + "].");
		System.out.println();
		
		// Busca la segunda aparición de pera y elimínala.
		Integer contadorPera = 0;
		for (int i = 0; i < frutas.size(); i++) {
			if (frutas.get(i).equals("pera")) {
				contadorPera++;
				
				if (contadorPera == 2) {
					frutas.remove(i);
				}
			}
		}
		
		System.out.println("Busca la segunda aparición de pera y elimínala.");
		System.out.println("----------------------------------------------------");
		for (String fruta : frutas) {
			System.out.print(fruta + " ");
		}
		
		System.out.println();
		System.out.println("Tamaño actual [" + frutas.size() + "].");
		System.out.println();
		
		// Elimina todas las apariciones de fresa usando un bucle while.
		
		for (int i = 0; i < frutas.size(); i++) {
			while (frutas.get(i).equals("fresa")) {
				frutas.remove(i);
			}
		}
		
		 
		System.out.println("Elimina todas las apariciones de fresa usando un bucle while.");
		System.out.println("----------------------------------------------------");
		
		for (String fruta : frutas) {
			System.out.print(fruta + " ");
		}
		System.out.println();
		System.out.println("Tamaño actual [" + frutas.size() + "].");
		System.out.println();
		
		
	}

}
