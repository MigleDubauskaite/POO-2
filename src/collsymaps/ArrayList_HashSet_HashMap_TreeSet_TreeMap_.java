package collsymaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

// https://chatgpt.com/c/67aca30a-3db8-8007-96f0-cc2e8ae4f633

public class ArrayList_HashSet_HashMap_TreeSet_TreeMap_ {

	public static void main(String[] args) {

		String frase = "La casa de la pradera es de todos";

		String palabras[] = frase.split(" ");

		// imprimimos palabras con Array List
		ArrayList<String> palabrasEnArrayList = new ArrayList<>();
		for (String palabra : palabras) {
			palabra = palabra.toLowerCase();
			palabrasEnArrayList.add(palabra);
		}
		System.out.println("ARRAY LIST: \n" + palabrasEnArrayList);
		
		for (String palabra : palabrasEnArrayList) {
			System.out.print(palabra + " ");
		}

		// imprimimos palabras con Hash Set
		HashSet<String> palabrasHashSet = new HashSet<>();
		for (String palabra : palabras) {
			palabra = palabra.toLowerCase();
			palabrasHashSet.add(palabra);
		}
		System.out.println("\n\nHASH SET: \n" + palabrasHashSet);
		for (String palabra : palabrasHashSet) {
			System.out.print(palabra + " ");
		}

		// imprimimos palabras con Tree Set
		TreeSet<String> palabrasTreeSet = new TreeSet<>();
		for (String palabra : palabras) {
			palabra = palabra.toLowerCase();
			palabrasTreeSet.add(palabra);
		}
		System.out.println("\n\nTREE SET: \n" + palabrasTreeSet);
		for (String palabra : palabrasTreeSet) {
			System.out.print(palabra + " ");
		}
		
		// creamos un mapa - MAP
		HashMap<String, Integer> contadorPalabras = new HashMap<>();
		
		for (String palabra : palabrasEnArrayList) {
			palabra = palabra.toLowerCase();
			
			if (contadorPalabras.get(palabra) == null) {
				contadorPalabras.put(palabra, 1);
				// si la palabra aparece por primera vez le asignamos valor de 1
			} else {
				contadorPalabras.put(palabra, contadorPalabras.get(palabra) + 1);
			}
		}
		
		System.out.println("\n\nMAPA CON HASH MAP \n" + contadorPalabras);
		
		
		
		TreeMap<String, Integer> contadorPalabrasOrdenadas = new TreeMap<>();
		
		for (String palabra : palabrasEnArrayList) {
			palabra = palabra.toLowerCase();
			
			if (contadorPalabrasOrdenadas.get(palabra) == null) {
				contadorPalabrasOrdenadas.put(palabra, 1);
				// si la palabra aparece por primera vez le asignamos valor de 1
			} else {
				contadorPalabrasOrdenadas.put(palabra, contadorPalabrasOrdenadas.get(palabra) + 1);
			}
		}
		
		System.out.println("\n\nMAPA CON TREE MAP \n" + contadorPalabrasOrdenadas);

	}

}
