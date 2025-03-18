package metodos_arrayList;

import java.util.ArrayList;

/*
 Crear un ArrayList con un 5 títulos de libros y muéstralos todos por pantalla  utilizando para ello un bucle for
 */

public class Libro {

	public static void main(String[] args) {

		ArrayList<String> libros = new ArrayList<>();

		libros.add("\"Cien años de soledad\"");
		libros.add("\"1984\"");
		libros.add("\"El Alquimista\"");
		libros.add("\"El Principito\"");
		libros.add("\"El retrato de Dorian Grey\"");
		System.out.println(libros);

		System.out.println();
		for (int i = 0; i < libros.size(); i++) {
			System.out.println(libros.get(i));
		}

	}

}
