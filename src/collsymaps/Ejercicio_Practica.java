package collsymaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ejercicio_Practica {
	
	public static void main(String[] args) {
		
		
		/*
		 Escribe un programa en Java que analice los caracteres de la siguiente frase: "El conocimiento es poder, pero la sabiduría es humildad."
		
		El programa deberá:
			Guardar todos los caracteres (excepto los espacios y signos de puntuación) en una estructura de tipo ArrayList.
			Eliminar duplicados y mostrar los caracteres únicos utilizando HashSet y TreeSet.
			Contar la frecuencia de cada carácter utilizando un HashMap y un TreeMap.
			Mostrar los resultados de cada estructura de datos en la consola.
		 */
		
		String frase = "El conocimiento es poder, pero la sabiduría es humildad.".replaceAll("[,.]", "");
		
		String palabras[] = frase.split(" ");
		
		ArrayList<String> palabrasArrayList = new ArrayList<>();
		
		char caracteres;
		
		for (String p : palabras) {
			p = p.toLowerCase();
			palabrasArrayList.add(p);
		}
		System.out.println(palabrasArrayList);
		
		HashSet<String> palabrasHashSet = new HashSet<>();
		for (String p : palabras) {
			p = p.toLowerCase();
			palabrasHashSet.add(p);
			palabrasHashSet.remove(',');
		}
		System.out.println(palabrasHashSet);
		
		TreeSet<String> palabrasTreeSet = new TreeSet<>();
		for (String p : palabras) {
			p = p.toLowerCase();
			palabrasTreeSet.add(p);
		}
		System.out.println(palabrasTreeSet);
		
		
		HashMap<String, Integer> contadorHashMap = new HashMap<>();
		for (String p : palabrasArrayList) {
			if (contadorHashMap.get(p) == null) {
				contadorHashMap.put(p, 1);
			} else {
				contadorHashMap.put(p, contadorHashMap.get(p) + 1);
			}
		}
		System.out.println(contadorHashMap);
		
		TreeMap<String, Integer> contadorTreeMap = new TreeMap<>();
		
		for (String p : palabrasArrayList) {
			if (contadorTreeMap.get(p) == null) {
				contadorTreeMap.put(p, 1);
			} else {
				contadorTreeMap.put(p, contadorTreeMap.get(p) + 1);
			}
		}
		System.out.println(contadorTreeMap);
		
		
		TreeMap<String, Integer> contadorTreeMap2 = new TreeMap<>(contadorHashMap);
		System.err.println(contadorTreeMap2);
		
		
	}
}
