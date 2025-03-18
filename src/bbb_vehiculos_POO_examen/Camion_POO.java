package bbb_vehiculos_POO_examen;

public class Camion_POO extends Vehiculo_POO {

	private String matricula;
	private int capacidadDeCombustible;
	private double capacidadCarga;
	private double capacidadCargaMaxima;

	public String getTipo() {
		return "Camión";
	}

	public Camion_POO(String marca, String modelo, int velocidadMaxima, int velocidad, boolean movimiento, String matricula,
			int capacidadDeCombustible, double capacidadCarga, double capacidadCargaMaxima) {
		super(marca, modelo, velocidadMaxima, velocidad, movimiento);

		this.matricula = matricula == null || matricula.isEmpty() ? "DESCONOCIDA" : matricula.toUpperCase();

		this.capacidadDeCombustible = capacidadDeCombustible > 0 ? capacidadDeCombustible : 10;
		this.capacidadCarga = capacidadCarga > 0 ? capacidadCarga : 1;
		this.capacidadCargaMaxima = capacidadCargaMaxima;
	}

	@Override
	public String toString() {
		return String.format(
				"%s %n%s %nMatricula: %s %nCapacidad del tanque de combustible: %d l %nCapacidad de carga: %.2f %nCapacidad de carga máxima: %.2f %n",
				getTipo(), super.toString(), matricula, capacidadDeCombustible, capacidadCarga, capacidadCargaMaxima);
	}

	// METODO CARGAR
	public void cargar(double peso) {
		if (capacidadCarga + peso <= capacidadCargaMaxima) {
			System.out.println("El peso de la carga ha aumentado: " + capacidadCarga + " toneladas → "
					+ (capacidadCarga + peso) + " toneladas.");
			capacidadCarga += peso;
		} else {
			System.out.println("No se puede añadir más peso a la carga...");
		}
	}

}
