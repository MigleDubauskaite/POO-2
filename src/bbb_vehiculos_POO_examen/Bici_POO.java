package bbb_vehiculos_POO_examen;

public class Bici_POO extends Vehiculo_POO {

	private int marchas;

	public String getTipo() {
		return "Bicicleta";
	}

	// METODO CAMBIAR MARCHAS
	public void cambioDeMarchas() {

		int cambioDeMarcha = getVelocidad() <= 10 ? 1
				: getVelocidad() <= 20 ? 2
						: getVelocidad() <= 40 ? 3
								: getVelocidad() <= 50 ? 4
										: getVelocidad() <= 70 ? 5
												: getVelocidad() <= 90 ? 6 : getVelocidad() <= 110 ? 7 : 1;

		System.out.println("La marcha a cambiado: de " + marchas + " a " + cambioDeMarcha);
	}

	@Override
	public String toString() {
		return String.format("%s %n%s %nMarcha actual: %d%n", getTipo(), super.toString(), marchas);
	}

	public Bici_POO(String marca, String modelo, int velocidadMaxima, int velocidad, boolean movimiento, int marchas) {
		super(marca, modelo, velocidadMaxima, velocidad, movimiento);
		this.marchas = marchas >= 1 && marchas <= 7 ? marchas : 1;
	}

}
