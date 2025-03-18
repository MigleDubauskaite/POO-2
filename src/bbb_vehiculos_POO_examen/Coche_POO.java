package bbb_vehiculos_POO_examen;

public class Coche_POO extends Vehiculo_POO {

	private String matricula;
	private int capacidadDeCombustible;
	
	private boolean turboActivado;

	private boolean matriculaOK(String matricula) {
		if (matricula.length() <= 7 && matricula != null) {
			return true;
		}
		for (int i = 0; i < 3; i++) {
			if (!(matricula.charAt(i) <= 'Z' && matricula.charAt(i) >= 'A')) {
				return false;
			}
		}
		for (int i = 0; i < matricula.length(); i++) {
			if (!(matricula.charAt(i) <= '9' && matricula.charAt(i) >= '0')) {
				return false;
			}
		}
		this.matricula = matricula;
		return true;
	}

	public Coche_POO(String marca, String modelo, int velocidadMaxima, int velocidad, boolean movimiento, String matricula,
			int capacidadDeCombustible, boolean turboActivado) {
		super(marca, modelo, velocidadMaxima, velocidad, movimiento);
		this.matricula = matriculaOK(matricula) ? matricula : "DESCONOCIDA";
		this.capacidadDeCombustible = capacidadDeCombustible;
		this.turboActivado = turboActivado;
	}

	public String getTipo() {
		return "Coche";
	}

	@Override
	public String toString() {
		return String.format("%s %n%s %nMatricula: %s %nCapacidad del tanque de combustible: %d l %n", getTipo(),
				super.toString(), matricula, capacidadDeCombustible);
	}

	// METODO ABRIR PUERTAS
	public void abrirPuertas() {
		if (!isMovimiento()) {
			System.out.println("Las puertas se pueden abrir.");
		} else {
			System.out.println("El vehículo está en el movimiento, las puertas no se pueden abrir.");
		}
	}

	public String probamosPuertas() {
		return !isMovimiento() ? "Las puertas se pueden abrir."
				: "El vehículo está en el movimiento, las puertas no se pueden abrir.";
	}
	
	@Override
	public void acelerar(int incremento) {
		if (turboActivado) {
			incremento *= 2;
			System.out.println("El turbo se ha activado!!!");
		}
	}

}
