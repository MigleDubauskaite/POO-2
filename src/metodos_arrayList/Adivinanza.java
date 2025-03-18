package metodos_arrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Adivinanza {

	/*
	 * 1. El programa generará un número aleatorio entre 1 y 100. 2. El usuario
	 * tendrá que adivinar el número. 3. El programa le dirá si el número que el
	 * usuario ha ingresado es mayor o menor que el número aleatorio, o ha acertado.
	 * 4. El historial de intentos se guardará y se imprimirá después de cada
	 * intento, mostrando todos los números que el usuario ha intentado adivinar. 5.
	 * El juego terminará cuando el usuario adivine correctamente el número, y se
	 * mostrará el número total de intentos y el historial.
	 */

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>();

		// 1. El programa generará un número aleatorio entre 1 y 100.
		Random random = new Random();

		/*
		 * for (int i = 0; i < 1; i++) { numeros.add(random.nextInt(1, 101)); }
		 * System.out.println(numeros);
		 * 
		 */

		// 2. El usuario tendrá que adivinar el número.

		/*
		 * int numUsuario; Scanner scanner = new Scanner(System.in);
		 * System.out.print("Introduce tu intento: "); numUsuario = scanner.nextInt();
		 * System.out.printf("Introducido: %d%n", numUsuario);
		 * 
		 * // 3. El programa le dirá si el número que el usuario ha ingresado es mayor o
		 * menor que el número aleatorio, o ha acertado.
		 * 
		 * for (Integer num : numeros) { if (numUsuario > num) { System.out.
		 * println("El número que el usuario ha ingresado es mayor que el número aleatorio"
		 * ); } if (numUsuario < num) { System.out.
		 * println("El número que el usuario ha ingresado es menor que el número aleatorio"
		 * ); } if (numUsuario == num) {
		 * System.out.println("¡El usuario ha acertado el número!"); } }
		 * 
		 */

		// COMPLETO
		// 4. El historial de intentos se guardará y se imprimirá después de cada
		// intento, mostrando todos los números que el usuario ha intentado adivinar.

		ArrayList<Integer> historial = new ArrayList<>();

		int numAl = random.nextInt(1, 10);
		System.out.println(numAl);

		int numUsuario;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce tu intento: ");

		int contadorIntentos = 1;

		do {
			numUsuario = scanner.nextInt();

			System.out.printf("Número introducido: %d%n", numUsuario);

			historial.add(numUsuario);

			if (numUsuario > numAl) {
				System.out.println("El número que el usuario ha ingresado es mayor que el número aleatorio");
			}
			if (numUsuario < numAl) {
				System.out.println("El número que el usuario ha ingresado es menor que el número aleatorio");
			}
			if (numUsuario == numAl) {
				System.out.println("¡El usuario ha acertado el número!");
			}

			System.out.println("Historial " + historial);
			System.out.println("Veces introducidas: [" + contadorIntentos++ + "].");

		} while (numUsuario != numAl);

		// mostrar historial

		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(historial);
		}

		historial.add(numUsuario);

	}

}



























