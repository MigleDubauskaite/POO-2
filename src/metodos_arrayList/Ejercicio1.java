package metodos_arrayList;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio1 {

	private static void muestraYSubraya(String texto) {
		System.out.println(texto);
		for (int i = 0; i < texto.length(); i++) {
			System.out.print("- ");
		}
		System.out.println();
	}

	private static void muestraTodosLosDatos(ArrayList<Integer> lista) {

		System.out.println(lista);
		System.out.println();

		// calculamos la suma, la media, el máximo y el mínimo de los valores
		Integer suma = 0;
		Integer maximo = lista.get(0);
		Integer minimo = lista.get(0);

		for (Integer numero : lista) {
			suma += numero;
			maximo = numero > maximo ? numero : maximo;
			minimo = numero < minimo ? numero : minimo;
		}

		muestraYSubraya("Mostramos la suma");
		System.out.println(suma);
		System.out.println();

		muestraYSubraya("Mostramos la media");
		System.out.println(suma / lista.size());
		System.out.println();

		muestraYSubraya("Mostramos el máximo");
		System.out.println(maximo);
		System.out.println();

		muestraYSubraya("Mostramos el mínimo");
		System.out.println(minimo);
		System.out.println();

	}

	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<>();
		Random random = new Random();

		muestraYSubraya("Mostrar lista de números aleatorios");

		for (int i = 0; i < 20; i++) {
			num.add(random.nextInt(1, 101)); // otra manera nextInt(100) + 1
		}
		muestraTodosLosDatos(num);

		muestraTodosLosDatos(num);
		muestraYSubraya("Eliminar los menores de 50");

		/*
		 * for (Integer i = 0; i < num.size(); i++) {}
		 */
		// la manera esta no funciona, ya que al borrar el numero de pos0 el indice no
		// se actualizaria, por tanto lo recorremos al reves

		for (int i = num.size() - 1; i >= 0; i--) {
			if (num.get(i) < 50) {
				num.remove(i);
			}
		}
		System.out.println(num);

		num.removeIf(s -> s < 50); // borramos si el numero = (->) a numero menor que 50

		muestraYSubraya("Mostrar lista de números aleatorios");
		muestraTodosLosDatos(num);

	}

}
