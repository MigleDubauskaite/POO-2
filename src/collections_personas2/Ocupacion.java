package collections_personas2;

import java.util.Random;

public enum Ocupacion {
	
	IN("Ingeniero"), MD("Médico"), PR("Profesor"), AB("Abogado"), AR("Arquitecto");
	
	private String nombreCompleto;
	private static Random random = new Random();

	private Ocupacion(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}
	
	public static Ocupacion ocupacionRandom() {
		
		Ocupacion[] ocupaciones = values();
		
		int indexRandomOcupacion = random.nextInt(ocupaciones.length);
		
		Ocupacion ocupacionRandom = ocupaciones[indexRandomOcupacion];
		
		return ocupacionRandom;
		
	}
	
	
}
