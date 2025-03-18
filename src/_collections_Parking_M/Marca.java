package _collections_Parking_M;

import java.util.Random;

public enum Marca {

	TO("Toyota"), LE("Lexus"), HO("Honda"), ME("Mercedes"), AU("Audi"), SE("Seat");

	private String nombreMarca;
	private static Random random = new Random();

	private Marca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	public String getNombreMarca() {
		return nombreMarca;
	}

	public static Marca marcaRandom() {

		Marca[] marcas = values();
		int indice = random.nextInt(marcas.length);

		Marca marcaRandom = marcas[indice];

		return marcaRandom;
	}

}
