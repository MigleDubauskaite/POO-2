package juegos_finales;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
	
	private int numeroMaximo;
	private int numeroIntentos;

	ArrayList<String> historico = new ArrayList<>();

	public AdivinaNumero(int numeroMaximo, int numeroIntentos) {
		this.numeroMaximo = numeroMaximo;
		this.numeroIntentos = numeroIntentos;
	}

	public void jugar() {

		int numeroOculto = new Random().nextInt(1, numeroMaximo + 1);

		// definimos las propiedes antes de empezar
		int intento = 0;
		historico.clear();

		System.out.println("EMPEZAMOS UN NUEVO JUEGO");
		System.out.println("============================");

		System.out.println(numeroOculto);

		Scanner scanner = new Scanner(System.in);

		while (++intento <= numeroIntentos) {
			// incrementamos y luego lo utilizamos (porque hemos empezado por intento = 0).

			System.out.printf("[%d de %d]. Introduce un número del 1 al %d: ", intento, numeroIntentos, numeroMaximo);

			System.out.print("Introduce un número: ");
			int numeroPropuesto = scanner.nextInt();

			if (numeroPropuesto == numeroOculto) {
				System.out.printf("Acertaste!!%n");
				historico.add("😍" + numeroPropuesto);
				System.out.println(historico); 
				// hay que ponerlo historico antes de break, que al hacer break ya no incluye nada
				break;
			} else if (numeroPropuesto > numeroOculto) {
				System.out.printf("%d es mayor que el número oculto%n", numeroPropuesto);
				historico.add("🙄" + numeroPropuesto);
			} else {
				System.out.printf("%d es menor que el número oculto%n", numeroPropuesto);
				historico.add("🙄" + numeroPropuesto);
			}
			System.out.println(historico);
		}

		System.out.println("GRACIAS POR PARTICIPAR!!");
		System.out.println();
	}

}
