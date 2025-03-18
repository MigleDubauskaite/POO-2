package juegos_finales;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

	ArrayList<String> palabras = new ArrayList<>();
	
	//int cuantasVecesQuieresJugar;
	
	private <String> void palabrasPredefinidas() {
		palabras.add("flor");
		palabras.add("animal");
		palabras.add("ojos");
		palabras.add("manzana");
		palabras.add("perro");
		palabras.add("cielo");
		palabras.add("casco");
		palabras.add("rio");
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
		palabras.add("paz");
		palabras.add("fruta");
		palabras.add("aroma");
		palabras.add("sombra");
	}

	public void jugar() {

		palabrasPredefinidas();

		Random random = new Random();
		int indexPalabra = random.nextInt(palabras.size());
		String palabraSeleccionada = palabras.get(indexPalabra);

		System.out.println("¡ADIVINA PALABRA!\n==============================\n");

		// recorremos la longitud de palabra random seleccionada
		char[] letras = new char[palabraSeleccionada.length()];

		for (int i = 0; i < letras.length; i++) {
			letras[i] = '-';
		}

		Scanner scanner = new Scanner(System.in);

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

		// añadir historial de palabras ya introducidas incorrectas
		ArrayList<Character> historico = new ArrayList<>();

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

			// si no acierta la letra, contamos el fallo y lo introducimos en el historial
			if (!acierto) {
				++fallos;
				System.out.println("Oops, intenta con otra letra 🔠 ...");
				System.out.println("Fallos: [" + fallos + " de " + fallosPermitidos + "].");
				historico.add(letraScanner);
				System.out.println("Histórico de palabras incorrectas: " + historico);
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
