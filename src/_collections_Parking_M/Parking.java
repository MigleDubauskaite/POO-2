package _collections_Parking_M;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Parking {

	private String nombre;
	private int totalPlazas;
	private List<Coche> listaDeCoches;
	private Map<Color, Integer> mapColor;
	private Map<Marca, Integer> mapMarca;
	private Map<Coche, Integer> mapCochesIguales;
	private Set<Coche> setCoches;

	private static Random random = new Random();

	// esto no utilizo, entonces podría cambiarlo por mi lista de coches
	public List<Coche> getCochesAparcados() {
		return listaDeCoches; 
	}

	public Parking(String nombre, int totalPlazas) {
		this.nombre = nombre;
		this.totalPlazas = totalPlazas;
		listaDeCoches = new ArrayList<>();
		mapColor = new HashMap<>();
		mapMarca = new HashMap<>();
		mapCochesIguales = new HashMap<>();
		setCoches = new HashSet<>();
	}

	private boolean parkingEstaVacio() {
		return listaDeCoches.isEmpty();
	}

	private boolean parkingEstaLleno() {
		return listaDeCoches.size() >= totalPlazas;
	}

	private boolean mapEntraColor(Coche coche) {
		Color colorCoche = coche.getColor();

		if (mapColor.get(colorCoche) == null) {
			mapColor.put(colorCoche, 1);
		} else {
			mapColor.put(colorCoche, mapColor.get(colorCoche) + 1);
		}
		return true;
	}

	private boolean mapSaleColor(Coche coche) {
		Color colorCoche = coche.getColor();
	
		if (mapColor.get(colorCoche) <= 1) {
			mapColor.remove(colorCoche);
		} else {
			mapColor.put(colorCoche, mapColor.get(colorCoche) - 1);
		}

		return true;
	}

	private boolean mapEntraMarca(Coche coche) {
		Marca marcaCoche = coche.getMarca();

		if (mapMarca.get(marcaCoche) == null) {
			mapMarca.put(marcaCoche, 1);
		} else {
			mapMarca.put(marcaCoche, mapMarca.get(marcaCoche) + 1);
		}
		return true;
	}

	private boolean mapSaleMarca(Coche coche) {
		Marca marcaCoche = coche.getMarca();

		if (mapMarca.get(marcaCoche) == 1) {
			mapMarca.remove(marcaCoche);
		} else {
			mapMarca.put(marcaCoche, mapMarca.get(marcaCoche) - 1);
		}
		return true;
	}

	private boolean mapEntraCocheIgual(Coche coche) {

		if (mapCochesIguales.get(coche) == null) {
			mapCochesIguales.put(coche, 1);
		} else {
			mapCochesIguales.put(coche, mapCochesIguales.get(coche) + 1);
		}
		return true;
	}

	private boolean mapSaleCocheIgual(Coche coche) {

		if (mapCochesIguales.get(coche) == 1) {
			mapCochesIguales.remove(coche);
		} else {
			mapCochesIguales.put(coche, mapCochesIguales.get(coche) - 1);
		}
		return true;
	}

	public boolean entraCoche(Coche coche) {

		boolean cocheDentro = false;

		for (Coche c : listaDeCoches) {
			if (c == coche) {
				cocheDentro = true;
				break;
			}
		}

		if (parkingEstaLleno() || cocheDentro) {
			return false;
		}

		listaDeCoches.add(coche);
		setCoches.add(coche);
		mapEntraColor(coche);
		mapEntraMarca(coche);
		mapEntraCocheIgual(coche);
		return true;
	}

	public boolean saleCoche(Coche coche) {

		boolean cocheDentro = false;
		
		for (int i = 0; i < listaDeCoches.size(); i++) {

			if (listaDeCoches.get(i) == coche) {
				listaDeCoches.remove(i);
				cocheDentro = true;
			}
		}
		
		if (!cocheDentro) {
			return false;
		}
		mapSaleColor(coche);
		mapSaleMarca(coche);

		if (mapCochesIguales.get(coche) == 1) {
			setCoches.remove(coche);
		}
		mapSaleCocheIgual(coche);

		return true;
	}

	public Coche saleCocheAleatorio() {

		if (parkingEstaVacio()) {
			return null;
			//return false;
		}
		int indiceRandom = random.nextInt(listaDeCoches.size());
		Coche cocheRandom = listaDeCoches.get(indiceRandom);
		
		saleCoche(cocheRandom);

		//return saleCoche(cocheRandom);
		return cocheRandom;
		
	}

	public boolean vaciaParking() {
		while (!parkingEstaVacio()) {
			saleCocheAleatorio();
		}
		return true;
	}

	private void encabezado(String tipoReport) {
		System.out.println("\n" + tipoReport);
		
		//String[] longitudReport = tipoReport.split("");
		/*for (String c : longitudReport) {
			System.out.print("-");
		}*/
		
		System.out.println("-".repeat(tipoReport.length()));
		System.out.println("Parking: " + nombre);
	}

	public void reportColores() {
		encabezado("REPORT COLORES");

		for (Color c : mapColor.keySet()) {
			System.out.println("El coche de color " + c.getNombreColor() + " se repite " + mapColor.get(c)
					+ (mapColor.get(c) == 1 ? " vez." : " veces."));
		}
		System.out.println("Total coches: " + getCochesAparcados().size());
	}

	public void reportMarcas() {
		encabezado("REPORT MARCAS");
		for (Marca m : mapMarca.keySet()) {
			System.out.println("El coche de marca " + m.getNombreMarca() + " se repite " + mapMarca.get(m)
					+ (mapMarca.get(m) == 1 ? " vez." : " veces."));
		}
		System.out.println("Total coches: " + getCochesAparcados().size());
	}

	public void reportCochesIguales() {
		encabezado("REPORT COCHES IGUALES");

		for (Coche c : mapCochesIguales.keySet()) {
			System.out.println("Coche: " + c.toString() + " se repite " + mapCochesIguales.get(c)
					+ (mapCochesIguales.get(c) == 1 ? " vez." : " veces."));
		}
		System.out.println("Total coches: " + getCochesAparcados().size());
	}

	public void reportSetCoches() {
		encabezado("REPORT SET COCHES");
		for (Coche c : setCoches) {
			System.out.println("Coche: " + c.toString());
		}
		System.out.println("Total items: " + setCoches.size());
	}

	public void reportParking() {

		encabezado("REPORT PARKING");
		int contadorCoche = 0;

		for (Coche coche : listaDeCoches) {
			System.out.println("Coche: " + coche.toString());
			contadorCoche++;
		}
		System.out.println("Total coches: " + contadorCoche + ", plazas libres: "
				+ ((totalPlazas - contadorCoche) <= 0 ? 0 : (totalPlazas - contadorCoche)));
		System.out.println();
	}
	
	public void sacarTodosReport() {
		reportColores();
		reportMarcas();
		reportCochesIguales();
		reportSetCoches();
		reportParking();
	}

}
