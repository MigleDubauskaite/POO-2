package parking_Javi_24_02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Parking {
	
	private static Random random = new Random();
	
	private String nombre;
	private int plazasTotales;
	private int plazasLibres;
	
	//private List<Coche> listaCoches = new ArrayList<>();
	private List<Coche> listaCoches;
	private Set<Coche> conjuntoCoches;
	
	private Map<Coche, Integer> mapDeCoches;
	private Map<Color, Integer> mapDeColores;
	private Map<Marca, Integer> mapDeMarcas;

	public List<Coche> getListaCoches() {
		return listaCoches;
	}

	public Set<Coche> getConjuntoCoches() {
		return conjuntoCoches;
	}

	public Parking(String nombre, int plazasTotales) {
		this.nombre = nombre;
		this.plazasTotales = plazasTotales;
		plazasLibres = plazasTotales;
		
		listaCoches = new ArrayList<>();
		conjuntoCoches = new HashSet<>();
		
		mapDeCoches = new HashMap<>();
		mapDeColores = new HashMap<>();
		mapDeMarcas = new HashMap<>();
	}

	
	public boolean entraCoche(Coche coche) {
		// Coche está dentro
		boolean cocheDentro = false;
		
		for (Coche c : listaCoches) {
			if (c == coche) {
				cocheDentro = true;
				break;
			}
		}
		
		if (plazasLibres > 0 && !cocheDentro) {
			plazasLibres--;
			listaCoches.add(coche);		
			conjuntoCoches.add(coche);
			
			mapDeColores.put(coche.getColor(), mapDeColores.getOrDefault(coche.getColor(), 0) + 1);
			mapDeMarcas.put(coche.getMarca(), mapDeMarcas.getOrDefault(coche.getMarca(), 0) + 1);
			mapDeCoches.put(coche, mapDeCoches.getOrDefault(coche, 0) + 1);
			
			return true;
		}
		return false;
	}
	
	
	public Coche saleCoche(Coche coche) {
		
		boolean cocheDentro = false;
		
		int indiceCoche = 0;
		
		for (int i = 0; i < listaCoches.size(); i++) {
			
			if (listaCoches.get(i) == coche) {
				cocheDentro = true;
				indiceCoche = i;
				break;
			}
		}
		
		
		if (cocheDentro) {
			plazasLibres++;
			listaCoches.remove(indiceCoche);		
			
			mapDeColores.put(coche.getColor(), mapDeColores.get(coche.getColor()) - 1);
			if (mapDeColores.get(coche.getColor()) == 0){
				mapDeColores.remove(coche.getColor());
			}
			
			mapDeMarcas.put(coche.getMarca(), mapDeMarcas.get(coche.getMarca()) - 1);
			if (mapDeMarcas.get(coche.getMarca()) == 0){
				mapDeMarcas.remove(coche.getMarca());
			}
			
			mapDeCoches.put(coche, mapDeCoches.get(coche) - 1);
			if (mapDeCoches.get(coche) == 0){
				mapDeCoches.remove(coche);
				conjuntoCoches.remove(coche);
			}
				
			
			return coche;
		}
		return null;
	}
	
	public Coche saleCocheAleatorio() {
		
		if (listaCoches.isEmpty()) return null;
		
		int indiceAleatorio = random.nextInt(listaCoches.size());
		return saleCoche(listaCoches.get(indiceAleatorio));

	}
	
	public boolean vaciar() {
		/*
		while (!listaCoches.isEmpty()) {
			saleCocheAleatorio();
		} */
		
		if (listaCoches.isEmpty()) return false;
		
		while (saleCocheAleatorio() != null);
		
		return true;
	}
	
	


}
