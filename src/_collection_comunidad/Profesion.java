package _collection_comunidad;

import java.util.Random;

public enum Profesion {
	
	PO("Policía"), ME("Médico"), IN("Ingeniero"), PR("Productor"), CA("Camarero"), PI("Pintor");
	
	private String nombreProfesion;
	
	private static Random random = new Random();

	private Profesion(String nombreProfesion) {
		this.nombreProfesion = nombreProfesion;
	}

	public String getNombreProfesion() {
		return nombreProfesion;
	}
	
	public static Profesion profesionRandom() {
		
		Profesion[] profesiones = values();
		
		int indexProfesionRandom = random.nextInt(profesiones.length);
		
		Profesion profesionRandom = profesiones[indexProfesionRandom];
		
		return profesionRandom;
	}

	
	
}
