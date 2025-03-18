package _collections_Parking_M;

import java.util.Random;

public enum Color {

	RO("Rojo"), NA("Naranja"), AM("Amarillo"), VE("Verde"), AZ("Azul"), IN("Indigo"), VI("Violeta");

	private String nombreColor;
	
	private static Random random = new Random();

	private Color(String nombreColor) {
		this.nombreColor = nombreColor;
	}

	public String getNombreColor() {
		return nombreColor;
	}

	public static Color colorRandom() {

		Color[] colores = values();

		int indice = random.nextInt(colores.length);

		Color colorRandom = colores[indice];

		return colorRandom;

	}

}
