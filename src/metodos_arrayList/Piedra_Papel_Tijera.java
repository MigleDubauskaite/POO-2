package metodos_arrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Piedra_Papel_Tijera {

	/*
	 * Descripción: El usuario juega contra la computadora. Cada ronda, el usuario
	 * elige entre piedra, papel o tijera, y el programa genera una elección
	 * aleatoria para la máquina, determinando el ganador según las reglas clásicas.
	 */

	public static void main(String[] args) {

		// ArrayList<String> elecciones = new ArrayList<>();

		// generar aleatoriamente piedra, papel o tijera
		// Random random = new Random();
		// String[] opciones = { "piedra", "papel", "tijera" };

		// int indexOpcion = random.nextInt(3);
		// String eleccionRandomMaquina = opciones[indexOpcion];
		// System.out.println(eleccionRandomMaquina);

		// permitir al usuario elegir entre piedra, papel o tijera
		// Scanner scanner = new Scanner(System.in);
		// int opcion = scanner.nextInt();

		/*
		 * switch (opcion) { case 1: System.out.println("piedra"); break; case 2:
		 * System.out.println("papel"); break; case 3: System.out.println("tijera");
		 * break; default: System.out.println("ERROR ❌"); break; }
		 */

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// generamos el juego: usuario contra la máquina

		// ArrayList<String> elecciones = new ArrayList<>();

		String[] piedraOPapelOTijera = { "piedra", "papel", "tijera" };

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int numeroDeRondas = 3;

		System.out.println("BIENVENIDOS AL NUEVO JUEGO - PIEDRA, PAPEL Y TIJERA!!!!\n🪨🗞️✂️");
		System.out.println("\nElige entre piedra, papel y tijera.\n============================================");
		System.out.println("\n1. Piedra \n2. Papel \n3. Tijera");
		System.out.println("\n=============================================");

		// ADAPTARLO A:
		/*
		 * se juega 3 veces (numero de rondas, puede ser x) se imprime el mensaje
		 * despues de cada ronda quien es ganador sin embargo, solo despues de jugar
		 * toda partida (las x rondas) se asignará el ganador final
		 */
		int contadorVictoriasUsuario = 0;
		int contadorVictoriasMaquina = 0;

		for (int i = 0; i < numeroDeRondas; i++) {
			// el usuario ingresa el numero
			System.out.print("Ingresa su elección: ");
			int opcion = scanner.nextInt();
			System.out.println("🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢\n");

			System.out.printf("Su elección es: %s%n", opcion == 1 ? "piedra".toUpperCase()
					: opcion == 2 ? "papel".toUpperCase() : opcion == 3 ? "tijera".toUpperCase() : "");

			// si el usaurio ingresa el nuemro fuera del rango, el juego no se parara
			if (opcion < 1 || opcion > 3) {
				System.out.println("Opción inválida ❌. Introduce un número entre 1 y 3.");
				i--; // no cuenta como ronda
				continue;
			}

			// comparar elecciones de usaurio y máquina (random)
			int indexOpcion = random.nextInt(3);
			String eleccionMaquina = piedraOPapelOTijera[indexOpcion];
			String eleccionUsuario = piedraOPapelOTijera[opcion - 1];

			System.out.println("Elección de la máquina: " + eleccionMaquina.toUpperCase()
					+ "\n==========================================================\n");
			System.out.println("EL RESULTADO DE LA RONDA \n===============================================");
			if (eleccionUsuario.equals(eleccionMaquina)) {
				// i--;
				System.out.println("EMPATE\n----------------------------------------\n");
			} else {
				switch (eleccionUsuario) {
				case "piedra":
					System.out.println(eleccionMaquina.equals("tijera")
							? "😀Ganaste esta ronda\n----------------------------------------\nVictorias de usuario: "
									+ ++contadorVictoriasUsuario + "\n"
							: "Perdiste esta ronda\n----------------------------------------\nVictorias de máquina: "
									+ ++contadorVictoriasMaquina + "\n");
					break;
				case "papel":
					System.out.println(eleccionMaquina.equals("piedra")
							? "😀Ganaste esta ronda\n----------------------------------------\nVictorias de usuario: "
									+ ++contadorVictoriasUsuario + "\n"
							: "Perdiste esta ronda\n----------------------------------------\nVictorias de máquina: "
									+ ++contadorVictoriasMaquina + "\n");
					break;
				case "tijera":
					System.out.println(eleccionMaquina.equals("papel")
							? "😀Ganaste esta ronda\n----------------------------------------\nVictorias de usuario: "
									+ ++contadorVictoriasUsuario + "\n"
							: "Perdiste esta ronda\n----------------------------------------\nVictoriasde máquina: "
									+ ++contadorVictoriasMaquina + "\n");

					break;
				}
			}

		}

		System.out.println("RESULTADO FINAL");
		if (contadorVictoriasUsuario > contadorVictoriasMaquina) {
			System.out.println("Felicidades!! Has ganado contra la máquina");
		} else if (contadorVictoriasUsuario < contadorVictoriasMaquina) {
			System.out.println("Lo siento, te has perdido...");
		} else {
			System.out.println("Empate");
		}

	}

}
