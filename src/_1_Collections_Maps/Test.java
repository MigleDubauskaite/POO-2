package _1_Collections_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {

	public static String[] devuelvePalabras(String cuento) {
		String textoModificado = cuento.replaceAll("[.,\n]", "");
		String[] arrayPalabras = textoModificado.split(" ");
		return arrayPalabras;
	}

	public static void arrayPalabras(String cuento) {
		int contadorPalabra = 0;
		for (String palabra : devuelvePalabras(cuento)) {
			System.out.print("[" + palabra + "] ");
			contadorPalabra++;
		}
		System.out.println("\nLista original tiene " + contadorPalabra + " palabras.");
	}

	public static void arrayListPalabras(String cuento) {
		ArrayList<String> palarbasArrayList = new ArrayList<>();
		for (String palabra : devuelvePalabras(cuento)) {
			palarbasArrayList.add(palabra);
			System.out.print("[" + palabra + "] ");
		}
		System.out.println("\nLista en Array List tiene " + palarbasArrayList.size() + " palabras.");
	}

	public static void hashSetPalabras(String cuento) {
		HashSet<String> hashPalabras = new HashSet<>();

		for (String palabra : devuelvePalabras(cuento)) {
			hashPalabras.add(palabra.toLowerCase());
		}
		for (String palabra : hashPalabras) {
			System.out.print("[" + palabra + "] ");
		}
		System.out.println("\nLista en hash Set  tiene " + hashPalabras.size() + " palabras.");
	}
	
	public static void treeSetPalabras(String cuento) {
		TreeSet<String> treeSetPalabras = new TreeSet<>();
		
		for (String palabra : devuelvePalabras(cuento)) {
			treeSetPalabras.add(palabra.toLowerCase());
		}
		for (String palabra : treeSetPalabras) {
			System.out.print("[" + palabra + "]");
		}
		System.out.println("\nLista de TreeSet tiene " + treeSetPalabras.size() + " palabras");
	}
	
	
	public static void mapConteoPalabras(String cuento) {
		HashMap<String, Integer> mapContadorPalabras = new HashMap<>();
		
		for (String palabra : devuelvePalabras(cuento)) {
			palabra = palabra.toLowerCase();
			if (mapContadorPalabras.get(palabra) == null) {
				mapContadorPalabras.put(palabra, 1);
			} else {
				mapContadorPalabras.put(palabra, mapContadorPalabras.get(palabra) + 1);
			}
		}
		
		for (String palabra : mapContadorPalabras.keySet()) {
			System.out.printf("[%s(%d)] %n", palabra, mapContadorPalabras.get(palabra));
		}
		System.out.println("\nNumero de palabras distintas: " + mapContadorPalabras.size());
	} 

	
	public static void mapConteoPalabrasOrdenadas(String cuento) {
		TreeMap<String, Integer> mapContadorPalabrasOrdenadas = new TreeMap<>();
		
		for (String palabra : devuelvePalabras(cuento)) {
			palabra = palabra.toLowerCase();
			if (mapContadorPalabrasOrdenadas.get(palabra) == null) {
				mapContadorPalabrasOrdenadas.put(palabra, 1);
			} else {
				mapContadorPalabrasOrdenadas.put(palabra, mapContadorPalabrasOrdenadas.get(palabra) + 1);
			}
			
		}
		for (String palabra : mapContadorPalabrasOrdenadas.keySet()) {
			System.out.printf("[%s(%d)] %n", palabra, mapContadorPalabrasOrdenadas.get(palabra));
		}
		System.out.println("\nNumero de palabras distintas: " + mapContadorPalabrasOrdenadas.size());
		
		
	}
	
	public static void main(String[] args) {

		// System.out.println("Probamos el método devuelvePalabras()");
		String cuentoZorro = CuentaCuentos.cuentoZorro();
		String cuentoLechera = CuentaCuentos.cuentoLechera();
		//devuelvePalabras(cuentoZorro);
		//devuelvePalabras(cuentoLechera);

		System.out.println("Array de palabras\n======================");
		arrayPalabras(cuentoZorro);
		arrayPalabras(cuentoLechera);

		System.out.println();
		System.out.println("\nArrayList de palabras\n======================");
		arrayListPalabras(cuentoZorro);
		arrayListPalabras(cuentoLechera);

		System.out.println();
		System.out.println("\nHashSet de palabras\n======================");
		hashSetPalabras(cuentoZorro);
		hashSetPalabras(cuentoLechera);
		
		System.out.println();
		System.out.println("\nTreeSet de palabras\n======================");
		treeSetPalabras(cuentoZorro);
		treeSetPalabras(cuentoLechera);
		
		System.out.println();
		System.out.println("\nConteo de repeticiones de palabras\n======================");
		mapConteoPalabras(cuentoZorro);
		//mapConteoPalabras(cuentoLechera);
		
		System.out.println();
		System.out.println("\nConteo de repeticiones de palabras - ORDENADO\n======================");
		mapConteoPalabrasOrdenadas(cuentoZorro);
		//mapConteoPalabrasOrdenadas(cuentoLechera);

	}

}
