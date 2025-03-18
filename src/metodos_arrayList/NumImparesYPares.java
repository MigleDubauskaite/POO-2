package metodos_arrayList;

import java.util.ArrayList;
import java.util.Random;

public class NumImparesYPares {

	public static void main(String[] args) {

		ArrayList<Integer> numero = new ArrayList<>();

		Random random = new Random();

		// Crea un ArrayList con 30 números aleatorios entre 10 y 99.
		for (int i = 0; i < 30; i++) {
			numero.add(random.nextInt(10, 101));
		}

		System.out.println("30 números aleatorios entre 10 y 99.");
		System.out.println("--------------------------------------");
		for (Integer num : numero) {
			System.out.print(num + " ");
		}

		System.out.println();
		System.out.println();

		// Separa los números pares en un ArrayList y los impares en otro.
		ArrayList<Integer> pares = new ArrayList<>();
		ArrayList<Integer> impares = new ArrayList<>();

		for (int i = 0; i < numero.size(); i++) {
			if (numero.get(i) % 2 == 0) {
				pares.add(numero.get(i));
			} else {
				impares.add(numero.get(i));
			}
		}

		System.out.println("Números pares");
		System.out.println("--------------------------------------");
		for (Integer num : pares) {
			System.out.print(num + " ");
		}

		System.out.println();
		System.out.println();
		System.out.println("Números impares");
		System.out.println("--------------------------------------");
		for (Integer num : impares) {
			System.out.print(num + " ");
		}

		System.out.println();
		System.out.println();

		// Calcula y muestra la cantidad, la suma, la media, el minimo y maximo de cada
		// lista.
		System.out.println("La cantidad de números aleatorios entre 10 y 99: [" + numero.size() + "].");
		System.out.println("La cantidad de números PARES: [" + pares.size() + "].");
		System.out.println("La cantidad de números IMPARES: [" + impares.size() + "].");

		Integer suma = 0;
		Integer valorMinimo = numero.get(0);
		Integer valorMaximo = numero.get(0);

		for (Integer valor : numero) {
			suma += valor;
			valorMinimo = valor < valorMinimo ? valor : valorMinimo;
			valorMaximo = valor > valorMaximo ? valor : valorMaximo;
		}
		Double media = (suma / (double)numero.size());

		System.out.println("La suma [" + suma + "].");
		System.out.println("La media [" + media + "].");
		System.out.println("El valor mínimo [" + valorMinimo + "].");
		System.out.println("El valor máximo [" + valorMaximo + "].");

		// Borra todos los números menores de 50 en ambas listas y vuelve a mostrar los
		// resultados.
		for (int i = pares.size() - 1; i >= 0; i--) {
			if (pares.get(i) < 50) {
				pares.remove(i);
			}
		}

		for (int i = impares.size() - 1; i >= 0; i--) {
			if (impares.get(i) < 50) {
				impares.remove(i);
			}
		}

		System.out.println();
		System.out.println("La lista actualizada de PARES: " + pares);
		System.out.println("La lista actualizada de IMPARES: " + impares);

	}

}
