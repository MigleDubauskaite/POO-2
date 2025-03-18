package bbb_vehiculos_POO_examen;

public class Motocicleta_POO extends Vehiculo_POO {

	private String matricula;
	private int capacidadDeCombustible;

	public String getTipo() {
		return "Motocicleta";
	}

	public Motocicleta_POO(String marca, String modelo, int velocidadMaxima, int velocidad, boolean movimiento,
			String matricula, int capacidadDeCombustible) {
		super(marca, modelo, velocidadMaxima, velocidad, movimiento);
		this.matricula = matriculaOK(matricula) ? matricula : "DESCONOCIDA";
		this.capacidadDeCombustible = capacidadDeCombustible;
	}

	@Override
	public String toString() {
		return String.format("%s %n%s %nMatricula: %s %nCapacidad del tanque de combustible: %d l %n", getTipo(),
				super.toString(), matricula, capacidadDeCombustible);
	}

	// METODO HACER CABALLITO
	public void hacerCaballito() {
		if (getVelocidad() > 30 && getVelocidad() < 60) {
			System.out.println("El caballito se puede realizar");
		} else {
			System.out.println(
					"El caballito no se puede realizar, ya que la velocidad es menor a 30 km/h o superior a 60 km/h ["
							+ getVelocidad() + "].");
		}
	}

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

}
