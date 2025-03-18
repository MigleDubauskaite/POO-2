package collsymaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class PrimerosPasos {

	public static void main(String[] args) {

		String frase = "La casa de la pradera es de todos";
		String[] palabras = frase.split(" ");

		ArrayList<String> palabrasArrayList = new ArrayList<>();
		HashSet<String> palabrasSet = new HashSet<>();
		TreeSet<String> palabrasTreeSet = new TreeSet<>();
		
		// constructor con colecciones
		//HashSet<String> palabrasSet = new HashSet<>(palabrasArrayList);

		for (String palabra : palabras) {
			palabrasArrayList.add(palabra);
			palabrasSet.add(palabra.toLowerCase());
			palabrasTreeSet.add(palabra.toLowerCase());
		}
		System.out.println(palabrasArrayList);
		System.out.println("SET: " + palabrasSet);
		System.out.println("TREE SET: " + palabrasTreeSet);

		for (String palabra : palabrasArrayList) {
			System.out.print("Array List: " + palabra + " ");
		}
		System.out.println();

		for (String palabra : palabrasSet) {
			System.out.print("Palabras Set: " + palabra + " ");
		}
		System.out.println();

		for (String palabra : palabrasTreeSet) {
			System.out.print("Palabras Tree: " +palabra + " ");
		}
		System.out.println("\n");
		
		
		// CREAMOS UN MAP
		HashMap<String, Integer> contadorPalabras = new HashMap<>();
		
		
		
		/*
		contadorPalabras.put("la", 1);
		contadorPalabras.put("casa", 1);
		contadorPalabras.put("de", 1);
		contadorPalabras.put("la", 2);
		contadorPalabras.put("pradera", 1);
		contadorPalabras.put("es", 1);
		contadorPalabras.put("de", 2);
		contadorPalabras.put("todos", 1);
		*/
		//System.out.println(contadorPalabras);
		
		for (String palabra : palabrasArrayList) {
			palabra = palabra.toLowerCase();
			if (contadorPalabras.get(palabra) == null) {
				// si la palabra aparece por primera vez le asignamos valor de 1
				contadorPalabras.put(palabra, 1);
			} else {
				// si palabra ya existe suma +1
				contadorPalabras.put(palabra, contadorPalabras.get(palabra) + 1);
			}
			
		}
		System.out.println("MAP");
		System.out.println(contadorPalabras);
		
		
			
		TreeMap<String, Integer> contadorPalabrasOrdenadas = new TreeMap<String, Integer>();
		
		for (String palabra : palabrasArrayList) {
			palabra = palabra.toLowerCase();
			if (contadorPalabrasOrdenadas.get(palabra) == null) {
				// si la palabra aparece por primera vez le asignamos valor de 1
				contadorPalabrasOrdenadas.put(palabra, 1);
			} else {
				// si palabra ya existe suma +1
				contadorPalabrasOrdenadas.put(palabra, contadorPalabrasOrdenadas.get(palabra) + 1);
			}
			
		}
		System.out.println("\nTREE MAP");
		System.out.println(contadorPalabrasOrdenadas);
		
		
		
		
		
		
	}

}
