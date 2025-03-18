package metodos_arrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

	/*
	 * Descripción del ejercicio: 1. Palabra secreta: Una palabra es seleccionada
	 * aleatoriamente desde un conjunto predefinido de palabras. 2. Adivinanzas: El
	 * jugador adivina letras, y si la letra está en la palabra, se revela en el
	 * lugar correspondiente. Si no está, se registra un fallo. 3. ArrayList para
	 * las letras adivinadas: Usamos un ArrayList para almacenar las letras que el
	 * jugador ha adivinado. 4. Revelación de la palabra: Se debe mostrar la palabra
	 * actual con las letras adivinadas correctamente y guiones para las letras no
	 * adivinadas. 5. Límites: El jugador tiene un número limitado de intentos para
	 * adivinar la palabra correctamente.
	 */

	public static void main(String[] args) {

		ArrayList<String> palabras = new ArrayList<>();

		// Palabra secreta: Una palabra es seleccionada aleatoriamente desde un conjunto
		// predefinido de palabras.

		palabras.add("flor");
		palabras.add("animal");
		palabras.add("ojos");
		palabras.add("manzana");
		palabras.add("perro");

		// seleccionamos palabra random

		Random random = new Random();
		int indexPalabra = random.nextInt(palabras.size());
		String palabraSeleccionada = palabras.get(indexPalabra);

		//System.out.println("Palabra seleccionada: " + palabraSeleccionada);
		
		System.out.println("Adivina la palabra!!");
		System.out.println();

		// 2. Adivinanzas: El jugador adivina letras, y si la letra está en la palabra,
		// se revela en el lugar correspondiente. Si no está, se registra un fallo.

		// guardamos en el array la longitud de la palabra random seleccionada

		// String[] palabra = new String[palabraSeleccionada.length()];

		char[] letras = new char[palabraSeleccionada.length()];

		// recorremos la longitud de palabra random
		
		for (int i = 0; i < letras.length; i++) {
			letras[i] = '-';
			// System.out.print("_ ");
		}
		System.out.println(letras);
		

		Scanner scanner = new Scanner(System.in);
		
		// Asignamos las letras ingresadas por el usuario a su posición correcta

		boolean palabraCompleta = false;

		while (!palabraCompleta) {

			System.out.print("Introduce la letra: ");

			char letraScanner = scanner.next().toLowerCase().charAt(0);

			for (int i = 0; i < palabraSeleccionada.length(); i++) {
				if (palabraSeleccionada.charAt(i) == letraScanner) {
					letras[i] = letraScanner;
				}
			}

			palabraCompleta = true;
			for (char c : letras) {
				if (c == '-') {
					palabraCompleta = false;
					break;
				}
			}
			System.out.println(letras);
		}
		
		if (palabraCompleta) {
			System.out.println("FELICIDADES😍! La palabra escondida fue: " + palabraSeleccionada );
		}
		

	}

}
