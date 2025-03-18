package _collection_comunidad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class ComunidadVecinos {
	
	private String nombre;
	private int totalPlazas;
	
	private static Random random = new Random();
	
	private List<Persona> listaDePersonas;
	private Map<Profesion, Integer> mapProfesion;
	private Map<Ciudad, Integer> mapCiudad;
	private Map<Persona, Integer> mapPersonasIguales;
	private Set<Persona> setPersonas;
	
	public ComunidadVecinos(String nombre, int totalPlazas) {
		this.nombre = nombre;
		this.totalPlazas = totalPlazas;
		
		listaDePersonas = new ArrayList<>();
		mapProfesion = new HashMap<>();
		mapCiudad = new HashMap<>();
		mapPersonasIguales = new HashMap<>();
		setPersonas = new HashSet<>();
	}
	
	private boolean edificioVacio() {
		return listaDePersonas.isEmpty();
	}
	
	private boolean edificioCompleto() {
		return listaDePersonas.size() >= totalPlazas;
	}
	
	private boolean mapEntra(Persona p) {
		
		Profesion profesion = p.getProfesion();
		
		if (mapProfesion.get(profesion) == null) {
			mapProfesion.put(profesion, 1);
		} else {
			mapProfesion.put(profesion, mapProfesion.get(profesion) + 1);
		}
		
		Ciudad ciudad = p.getCiudad();
		
		if (mapCiudad.get(ciudad) == null) {
			mapCiudad.put(ciudad, 1);
		} else {
			mapCiudad.put(ciudad, mapCiudad.get(ciudad) + 1);
		}	
		
		if (mapPersonasIguales.get(p) == null) {
			mapPersonasIguales.put(p, 1);
		} else {
			mapPersonasIguales.put(p, mapPersonasIguales.get(p) + 1);
		}
		
		return true;		
	}
	
	
	private boolean mapSale(Persona p) {
		
		Profesion profesion = p.getProfesion();
		
		if (mapProfesion.get(profesion) == 1) {
			mapProfesion.remove(profesion);
		} else {
			mapProfesion.put(profesion, mapProfesion.get(profesion) - 1);
		}
		
		Ciudad ciudad = p.getCiudad();
		
		if (mapCiudad.get(ciudad) == 1) {
			mapCiudad.remove(ciudad);
		} else {
			mapCiudad.put(ciudad, mapCiudad.get(ciudad) - 1);
		}	
		
		if (mapPersonasIguales.get(p) == 1) {
			mapPersonasIguales.remove(p);
		} else {
			mapPersonasIguales.put(p, mapPersonasIguales.get(p) - 1);
		}
		
		return true;		
	}
	
	
	public boolean entraPersona (Persona p) {
		
		boolean cocheDentro = false;
		
		
		for (Persona persona : listaDePersonas) {
			if (p == persona) {
				cocheDentro = true;
				break;
			}
		}
		
		if (edificioCompleto() || cocheDentro) {
			return false;
		}
		
		listaDePersonas.add(p);		
		mapEntra(p);
		setPersonas.add(p);
		return true;
	}
	
	public boolean salePersona(Persona p) {
		
		boolean cocheDentro = false;
			
		for (int i = 0; i < listaDePersonas.size(); i++) {
			if (listaDePersonas.get(i) == p) {
				setPersonas.remove(p);
				cocheDentro = true;
			}
		}
		
		if (!cocheDentro) {
			return false;
		}
		
		listaDePersonas.remove(p);	
		mapSale(p);
		return true;
	}
	
	public boolean salePersonaAleatoria() {
		
		if (edificioVacio()) {
			return false;
		}
		
		int indexPersonaRandom = random.nextInt(listaDePersonas.size());
		Persona personaRandom = listaDePersonas.get(indexPersonaRandom);
		
		return salePersona(personaRandom);
	}
	
	public boolean vaciaComunidad() {
		while (edificioVacio()) {
			salePersonaAleatoria();
		}
		return true;
	}
	
	private void encabezado(String tipoReport) {
		System.out.println("\n\n" + tipoReport);
		System.out.println("-".repeat(tipoReport.length()));
		System.out.println("Comunidad: " + nombre);
		
	}
	
	public void reportComunidad() {
		encabezado("LISTADO PERSONAS");
		
		for (Persona persona : listaDePersonas) {
			System.out.printf("Persona: %s %s %s %n", persona.getNombre(), persona.getProfesion(), persona.getCiudad());
		}
		System.out.println("Total personas: " + listaDePersonas.size() + ", plazas libres: " + (totalPlazas - listaDePersonas.size()));
	}
	
	public void reportProfesiones() {
		encabezado("REPORT PROFESIONES");
		
		for (Profesion profesion : mapProfesion.keySet()) {
			System.out.printf("La profesión %s se repite %s ve%s %n", profesion.getNombreProfesion(), mapProfesion.get(profesion), 
					mapProfesion.get(profesion) == 1 ? "z" : "ces");
		}
		System.out.println("Total personas: " + listaDePersonas.size());
	}
	
	public void reportCiudades() {
		encabezado("REPORT CIUDADES");
		
		for (Ciudad ciudad : mapCiudad.keySet()) {
			System.out.printf("La profesión %s se repite %s ve%s %n", ciudad.getNombreCiudad(), mapCiudad.get(ciudad), mapCiudad.get(ciudad) == 1 ? "z" : "ces");
		}
		System.out.println("Total personas: " + listaDePersonas.size());
	}
	
	public void reportPersonasIguales() {
		encabezado("REPORT PERSONAS IGUALES");
		
		for (Persona persona : mapPersonasIguales.keySet()) {
			System.out.printf("Persona: %s %s %s se repite %s ve%s %n", persona.getNombre(), persona.getProfesion(), persona.getCiudad(), mapPersonasIguales.get(persona),
					mapPersonasIguales.get(persona) == 1 ? "z" : "ces");
		}
		System.out.println("Total personas: " + listaDePersonas.size());
	}
	
	public void reportSet() {
		encabezado("REPORT SET DE PERSONAS");
		
		for (Persona persona : setPersonas) {
			System.out.printf("Persona: %s %s %s %n", persona.getNombre(), persona.getProfesion(), persona.getCiudad());
		}
		System.out.println("Total tipos de personas: " + setPersonas.size());
	}
	

	
	
	
	
	
}
