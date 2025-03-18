package juegos_finales;
import java.util.Scanner;

public class Menu {

	// sirve para jugar diferentes juegos en la misma consola

	public static void main(String[] args) {

		boolean salir = false;
		System.out.println();
		System.out.println("1: JUGAR.");
		System.out.println("0: SALIR.");
		Scanner scanner = new Scanner(System.in);
		int opcion = scanner.nextInt();

		switch (opcion) {
		case 0:
			salir = true;
			System.out.println("Gracias por jugar!");
			break;

		case 1:
			while (true) {
				System.out.println();
				System.out.println("ELIGE UN JUEGO:");
				System.out.println("1: Adivina un número.");
				System.out.println("2: Ahorcado.");
				//System.out.println("0: Salir.");

				int juego = scanner.nextInt();

				switch (juego) {
				case 1:
					System.out.println();
					System.out.println("Elegiste el juego de ADIVINAR EL NÚMERO");
					System.out.println();
					new AdivinaNumero(10, 3).jugar();
					
					break;
				case 2:
					System.out.println();
					System.out.println("Elegiste el juego AHORCADO");
					System.out.println();
					new juegos_finales.Ahorcado().jugar();
					break;
				default:
					System.out.println("❌ Opción inválida.");
				}

			}
		}

	}

}
