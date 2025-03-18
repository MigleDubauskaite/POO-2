package metodos_arrayList;

import java.util.ArrayList;
import java.util.Random;

public class Lunes {

	// metodo privado generar palabra

	private static String generarPalabra() {

		Random letrasRandom = new Random();

		int cantidadLetras = 4;
		String palabra = "";
		char letra;

		for (int j = 0; j < cantidadLetras; j++) {
			letra = (char) letrasRandom.nextInt((int) 'a', 'z' + 1);
			palabra += letra;
		}
		return palabra;
	}

	public static void main(String[] args) {

		ArrayList<Integer> numPar = new ArrayList<>();

		// 1
		// Crea un ArrayList que contenga los primeros n números pares.

		int n = 20;
		int numEmpezar = 2;

		for (int i = numEmpezar; i < n; numEmpezar++) {
			if (numEmpezar % 2 == 0) {
				numPar.add(numEmpezar);
				i++;
			}
		}

		System.out.println("Números pares");
		for (Integer num : numPar) {
			System.out.print(num + " ");
		}

		// 2
		// Crea un ArrayList que contenga los primeros n números múltiplos de m a partir
		// de un número dado p.
		ArrayList<Integer> numMultiplos = new ArrayList<>();

		int contador = 0;
		int numInicio = 10; // p --> a partir de este numero
		int numero = numInicio;
		int cantidadN = 3; // n ---> cantidad de numeros
		int multiploDe = 5; // m --> numero multiplo

		while (contador < cantidadN) {
			if (numero % multiploDe == 0) {
				numMultiplos.add(numero);
				contador++;
			}
			numero++;
		}

		System.out.println();
		System.out.println();
		System.out.println("Números multiplos de " + multiploDe);

		System.out.println(numMultiplos);

		for (Integer num : numMultiplos) {
			System.out.print(num + " ");
		}

		// 3
		/*
		 * Crea un ArrayList de Strings de 4 letras aleatorias del alfabeto inglés en
		 * minúsculas, con 1000 palabras. Luego recórrelo y crea otro nuevo ArrayList,
		 * donde estén las palabras que terminan por a o c. Muestra este último e indica
		 * cuántas palabras tiene.
		 */

		ArrayList<String> palabras = new ArrayList<>();

		System.out.println();
		System.out.println();

		int cantidadPalabras = 1000;

		for (int i = 0; i < cantidadPalabras; i++) {
			palabras.add(generarPalabra());
		}

		System.out.println("ArrayList de Strings de 4 letras aleatorias del alfabeto inglés en minúsculas, con 1000 palabras. ");
		for (String palabra : palabras) {
			System.out.print(palabra + " ");
		}
		
		System.out.println();
		System.out.println();
		
		ArrayList<String> palabrasElegidas = new ArrayList<>();
		
		for (int i = 0; i < palabras.size(); i++) {
			if (palabras.get(i).endsWith("a") || palabras.get(i).endsWith("c")) {
				palabrasElegidas.add(palabras.get(i));
			}
		}
		System.out.println("Luego recórrelo y crea otro nuevo ArrayList, donde estén las palabras que terminan por a o c.");
		for (String p : palabrasElegidas) {
			System.out.print(p + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("¿Cuántas palabras tiene? [" + palabrasElegidas.size() + "].");
		
		
		
		
		
		
		
		
		

	}

}
