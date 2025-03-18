package metodos_arrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Juego2_Ahorcado {

	public static void main(String[] args) {

		ArrayList<String> palabras = new ArrayList<>();

		palabras.add("flor");
		palabras.add("animal");
		palabras.add("ojos");
		palabras.add("manzana");
		palabras.add("perro");
		palabras.add("cielo");
		palabras.add("montaña");
		palabras.add("río");
		palabras.add("sol");
		palabras.add("luna");
		palabras.add("estrella");
		palabras.add("mar");
		palabras.add("bosque");
		palabras.add("roca");
		palabras.add("viento");
		palabras.add("nieve");
		palabras.add("fuego");
		palabras.add("tierra");
		palabras.add("nube");
		palabras.add("hoja");
		palabras.add("ave");
		palabras.add("pez");
		palabras.add("fruta");
		palabras.add("aroma");
		palabras.add("sombra");

		// seleccionamos palabra random

		Random random = new Random();
		int indexPalabra = random.nextInt(palabras.size());
		String palabraSeleccionada = palabras.get(indexPalabra);

		System.out.println("¡ADIVINA PALABRA!");
		System.out.println("==========================");
		System.out.println();

		// recorremos la longitud de palabra random seleccionada
		char[] letras = new char[palabraSeleccionada.length()];

		for (int i = 0; i < letras.length; i++) {
			letras[i] = '-';
		}

		Scanner scanner = new Scanner(System.in);

		// introducimos la letra de usuario en la posicion correspondiente
		// si la letraScanner no está en la palabra introducida, sacar mensaje Oops,
		// intenta con otra letra🔠

		/*
		 * El usuario debe adivinar una palabra secreta, letra por letra, con un número
		 * limitado de intentos.
		 */

		/*
		 * dibujamos el dibujo de ahorcado cuando la letra no está acertada
		 */

		// dibujar ahorcado

		String[] ahorcado = {
				"   +---+\n" + "   |   |\n" + "       |\n" + "       |\n" + "       |\n" + "       |\n" + "=========",

				"   +---+\n" + "   |   |\n" + "   O   |\n" + "       |\n" + "       |\n" + "       |\n" + "=========",

				"   +---+\n" + "   |   |\n" + "   O   |\n" + "   |   |\n" + "       |\n" + "       |\n" + "=========",

				"   +---+\n" + "   |   |\n" + "   O   |\n" + "  /|   |\n" + "       |\n" + "       |\n" + "=========",

				"   +---+\n" + "   |   |\n" + "   O   |\n" + "  /|\\  |\n" + "       |\n" + "       |\n" + "=========",

				"   +---+\n" + "   |   |\n" + "   O   |\n" + "  /|\\  |\n" + "   |   |\n" + "       |\n" + "=========",

				"   +---+\n" + "   |   |\n" + "   O   |\n" + "  /|\\  |\n" + "   |   |\n" + "  /    |\n" + "=========",

				"   +---+\n" + "   |   |\n" + "   O   |\n" + "  /|\\  |\n" + "   |   |\n" + "  / \\  |\n" + "=========",

				"   +---+\n" + "   |   |\n" + "   O   |\n" + "  /|\\  |\n" + "  /|   |\n" + "  / \\  |\n" + "=========",

				"   +---+\n" + "   |   |\n" + "   O   |\n" + "  /|\\  |\n" + "  /|\\  |\n" + "  / \\  |\n"
						+ "=========\n" + " ¡Has perdido!" };

		boolean palabraAcertada = false;

		int fallosPermitidos = ahorcado.length - 1;
		int fallos = 0;

		// cambiarlo a do-while

		do {
			System.out.print("Introduce una letra: ");

			char letraScanner = scanner.next().toLowerCase().charAt(0);

			boolean acierto = false;

			// comprobamos si la letra introducida por el usuario está en la palabra random
			for (int i = 0; i < palabraSeleccionada.length(); i++) {
				if (palabraSeleccionada.charAt(i) == letraScanner) {
					letras[i] = letraScanner;
					acierto = true;
				}
			}

			// si no acierta la letra, contamos el fallo
			if (!acierto) {
				fallos++;
				System.out.println("Oops, intenta con otra letra 🔠 ...");
				System.out.println("Fallos: [" + fallos + " de " + fallosPermitidos + "].");
				System.out.println(ahorcado[fallos]);
			}
			System.out.println(letras);

			// parar el bucle cuando se acierta la palabra
			palabraAcertada = true;
			for (char c : letras) {
				if (c == '-') {
					palabraAcertada = false;
					break;
				}
			}

		}

		while (!palabraAcertada && fallos < fallosPermitidos);

		// intentos incorrectos, no en total
		// si el usuario acierta la letra no se cuenta como fallo
		// si el usuario ingresa la letra incorrecta el contador de vidas restantes

		System.out.println();
		// imprimimos mensaje cuando la palabra está acertada
		if (palabraAcertada) {
			System.out.println("Felicidades😍! Has acertado la palabra [" + palabraSeleccionada + "].");
		} else {
			System.out.println("No te queda más intentos 🫤. La palabra era: " + palabraSeleccionada);
		}

	}
}
