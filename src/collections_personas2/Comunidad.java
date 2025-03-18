package collections_personas2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Comunidad {
	
	private String nombre;
	private int totalPlazas;
	
	private static Random random = new Random();
	
	private List<Persona> listaDePersonas;
	private Map<Nacionalidad, Integer> mapNacionalidad;
	private Map<Ocupacion, Integer> mapOcupacion;
	private Map<Persona, Integer> mapPersonasIguales;
	private Set<Persona> setPersonas;
	
	public Comunidad(String nombre, int totalPlazas) {
		this.nombre = nombre;
		this.totalPlazas = totalPlazas;
		
		listaDePersonas = new ArrayList<>();
		mapNacionalidad = new HashMap<>();
		mapOcupacion = new HashMap<>();
		mapPersonasIguales = new HashMap<>();
		setPersonas = new HashSet<>();
	}
	
	private boolean espacioLleno() {
		return listaDePersonas.size() >= totalPlazas;
	}
	
	private boolean espacioVacio() {
		return listaDePersonas.isEmpty();
	}
	
	private boolean mapEntraNacionalidadOcupacion(Persona persona) {
		
		Nacionalidad nacionalidad = persona.getNacionalidad();
		
		if (mapNacionalidad.get(nacionalidad) == null) {
			mapNacionalidad.put(nacionalidad, 1);
		} else {
			mapNacionalidad.put(nacionalidad, mapNacionalidad.get(nacionalidad) + 1);
		}
		
		Ocupacion ocupacion = persona.getOcupacion();
		
		if (mapOcupacion.get(ocupacion) == null) {
			mapOcupacion.put(ocupacion, 1);
		} else {
			mapOcupacion.put(ocupacion, mapOcupacion.get(ocupacion) + 1);
		}
		
		if (mapPersonasIguales.get(persona) == null) {
			mapPersonasIguales.put(persona, 1);
		} else {
			mapPersonasIguales.put(persona, mapPersonasIguales.get(persona) + 1);
		}
		
		return true;
	}
	
	private boolean mapSaleNacionalidadOcupacion(Persona persona) {
		
		Nacionalidad nacionalidad = persona.getNacionalidad();
		
		if (mapNacionalidad.get(nacionalidad) == 1) {
			mapNacionalidad.remove(nacionalidad);
		} else {
			mapNacionalidad.put(nacionalidad, mapNacionalidad.get(nacionalidad) - 1);
		}
		
		Ocupacion ocupacion = persona.getOcupacion();
		
		if (mapOcupacion.get(ocupacion) == 1) {
			mapOcupacion.remove(ocupacion);
		} else {
			mapOcupacion.put(ocupacion, mapOcupacion.get(ocupacion) - 1);
		}
		
		if (mapPersonasIguales.get(persona) == 1) {
			mapPersonasIguales.remove(persona);
		} else {
			mapPersonasIguales.put(persona, mapPersonasIguales.get(persona) - 1);
		}
		
		return true;
	}
	
	public boolean entraPersona(Persona p) {
		
		boolean personaDentro = false;
		
		for (Persona persona : listaDePersonas) {
			if (persona == p) {
				personaDentro = true;
				break;
			}
		}
		
		if (espacioLleno() || personaDentro) {
			return false;
		}
		
		listaDePersonas.add(p);
		mapEntraNacionalidadOcupacion(p);
		setPersonas.add(p);
		return true;		
	}
	
	public boolean salePersona(Persona p) {
		
		boolean personaDentro = false;
		
		for (int i = 0; i < listaDePersonas.size(); i++) {
			if (listaDePersonas.get(i) == p) {
				listaDePersonas.remove(i);
				personaDentro = true;
			}
		}
		
		if (!personaDentro) {
			return false;
		}
		
		if (mapPersonasIguales.get(p) == 1) {
			setPersonas.remove(p);
		}
		mapSaleNacionalidadOcupacion(p);
		
		return true;
	}
	
	public Persona salePersonaAleatoria() {
		
		if (espacioVacio()) {
			return null;
		}
		
		int indexPersonaRandom = random.nextInt(listaDePersonas.size());
		Persona personaRandom = listaDePersonas.get(indexPersonaRandom);
		
		salePersona(personaRandom);
		
		return personaRandom;
	}
	
	public boolean vaciaComunidad() {
		
		while (!espacioVacio()) {
			salePersonaAleatoria();
		}
		return true;
	}
	
	private void encabezado(String tipoReport) {
		
		System.out.println("\n" + tipoReport);
		System.out.println("-".repeat(tipoReport.length()));
		System.out.println("Comunidad: " + nombre);
	}
	
	public void reportComunidad() {
		encabezado("LISTADO DE PERSONAS");
		
		for (Persona persona : listaDePersonas) {
			System.out.println(persona.toString());
		}
		System.out.println("Total personas: " + listaDePersonas.size());
	}
	
	public void reportNacionalidades() {
		encabezado("REPORT DE NACIONALIDADES");
		
		for (Nacionalidad nacionalidad : mapNacionalidad.keySet()) {
			System.out.printf("Hay %d persona%s de %s. %n", mapNacionalidad.get(nacionalidad), mapNacionalidad.get(nacionalidad) == 1 ? "" : "s", nacionalidad.getNombreCompleto());
		}
		System.out.println("Total personas: " + listaDePersonas.size());
	}
	
	public void reportOcupaciones() {
		encabezado("REPORT DE OCUPACIONES");
		
		for (Ocupacion ocupacion : mapOcupacion.keySet()) {
			System.out.printf("Hay %d persona%s de %s. %n", mapOcupacion.get(ocupacion), mapOcupacion.get(ocupacion) == 1 ? "" : "s", ocupacion.getNombreCompleto());
		}
		System.out.println("Total personas: " + listaDePersonas.size());
	}
	
	public void reportPersonasIguales() {
		encabezado("REPORT DE PERSONAS IGUALES");
		
		for (Persona persona : mapPersonasIguales.keySet()) {
			System.out.printf("%s se repite %s %s.%n", persona.toString(), mapPersonasIguales.get(persona), mapPersonasIguales.get(persona) == 1 ? "vez" : "veces");
		}
		System.out.println("Total personas: " + listaDePersonas.size());
	}
	
	public void reportSetPersonas() {
		encabezado("REPORT SET DE PERSONAS");
		
		for (Persona persona : setPersonas) {
			System.out.printf("%s. %n", persona.toString());
		}
		System.out.println("Total personas: " + setPersonas.size());
	}
	
	public void reportTodos() {
		reportComunidad();
		reportNacionalidades();
		reportOcupaciones();
		reportPersonasIguales();
		reportSetPersonas();
	}
	
	

}
