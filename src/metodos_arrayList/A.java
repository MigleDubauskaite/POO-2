package metodos_arrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		/*
		 ** Instrucciones:** 1. El programa generará un número aleatorio entre 1 y 100.
		 * 2. El usuario tendrá que adivinar el número. 3. El programa le dirá si el
		 * número que el usuario ha ingresado es mayor o menor que el número aleatorio,
		 * o ha acertado. 4. El historial de intentos se guardará y se imprimirá después
		 * de cada intento, mostrando todos los números que el usuario ha intentado
		 * adivinar. 5. El juego terminará cuando el usuario adivine correctamente el
		 * número, y se mostrará el número total de intentos y el historial.
		 */

		ArrayList<Integer> numeros = new ArrayList<>();
		Random random = new Random();

		for (int i = 0; i < 1; i++) {
			numeros.add(random.nextInt(1, 101));
		}
		System.out.println(numeros);

		// El usuario tendrá que adivinar el número.

		// introducir número en la consola
		int intento;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce su intento: ");
		intento = scanner.nextInt();
		
		//System.out.printf("Introducido: %d%n", intento);

		// el número que el usuario ha ingresado es mayor o menor que el número
		// aleatorio, o ha acertado
		/*
		for (Integer num : numeros) {
			if (intento > num) {
				System.out.println("El número ingresado es mayor que el número aleatorio");
			}
			if (intento < num) {
				System.out.println("El número ingresado es menor que el número aleatorio");
			}
			if (intento == num) {
				System.out.println("¡El usuario ha acertado el número!");
			}
		}
		*/
		
		
		// El historial de intentos se guardará y se imprimirá después de cada intento, mostrando todos los números que el usuario ha intentado adivinar.
		
		ArrayList<Integer> historialIntentos = new ArrayList<>();
		
		int numRandom = random.nextInt(1, 101);
		
		// historialIntentos.add(intento)
		
		do {
			intento = scanner.nextInt();
			//intento++;
			
			historialIntentos.add(intento);
			
			
			
			if (intento > numRandom) {
				System.out.println("El número ingresado es mayor que el número aleatorio");
			}
			if (intento < numRandom) {
				System.out.println("El número ingresado es menor que el número aleatorio");
			}
			if (intento == numRandom) {
				System.out.println("¡El usuario ha acertado el número!");
			}
			
		} while (intento != numRandom);
		
		System.out.println(intento);
		
		for (Integer h : historialIntentos) {
			System.out.println(h);
		}
		
		

	}

}
