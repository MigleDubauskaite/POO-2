package collections_personas2;

import java.util.Random;

public enum Nacionalidad {
	
	ES("España"), FR("Francia"), IT("Italia"), DE("Alemania"), UK("Reino Unido");
	
	private String nombreCompleto;
	private static Random random = new Random();

	private Nacionalidad(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}
	
	public static Nacionalidad nacionalidadRandom() {
		
		Nacionalidad[] nacionalidades = values();
		int indexRandomNacionalidad = random.nextInt(nacionalidades.length);
		
		Nacionalidad nacionalidadRandom = nacionalidades[indexRandomNacionalidad];
		
		return nacionalidadRandom;
	}
	
}
