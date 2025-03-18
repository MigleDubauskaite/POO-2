package _collection_comunidad;

import java.util.Random;

public enum Ciudad {
	
	AT("Atenas"), BA("Barcelona"), BE("Berlín"), MA("Madrid"), MI("Milán"), RO("Roma");
	
	private String nombreCiudad;
	
	private static Random random = new Random();

	private Ciudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	public String getNombreCiudad() {
		return nombreCiudad;
	}
	
	public static Ciudad ciudadRandom() {
		
		Ciudad[] ciudades = values();
		
		int indexCiudadRandom = random.nextInt(ciudades.length);
		
		Ciudad ciudadRandom = ciudades[indexCiudadRandom];
		
		return ciudadRandom;
	}

	
	
}
