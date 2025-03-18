package bbb_vehiculos_POO_examen;

public abstract class Vehiculo_POO {

	// ATRIBUTOS COMUNES
	private String marca;
	private String modelo;
	private int velocidadMaxima;
	private int velocidad;
	private boolean movimiento;

	public boolean isMovimiento() {
		return movimiento;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public abstract String getTipo();

	public Vehiculo_POO(String marca, String modelo, int velocidadMaxima, int velocidad, boolean movimiento) {
		this.marca = marca == null ? "DESCONOCIDA" : marca;
		this.modelo = modelo == null ? "DESCONOCIDA" : modelo;
		this.velocidadMaxima = velocidadMaxima > 0 && velocidadMaxima < 280 ? velocidadMaxima : 260;
		this.velocidad = velocidad >= 0 ? velocidad : 0;
		this.movimiento = movimiento;
	}

	@Override
	public String toString() {
		return "Vehiculo_POO [marca=" + marca + ", modelo=" + modelo + ", velocidadMaxima=" + velocidadMaxima
				+ ", velocidad=" + velocidad + ", movimiento=" + movimiento + "]";
	}

	// METODOS COMUNES
	public boolean arrancar() {
		if (!movimiento) {
			movimiento = true;
			return true;
		} else {
			return false;
		}
	}

	public void acelerar(int incremento) {
		if (velocidad + incremento <= velocidadMaxima && movimiento) {
			System.out.println(
					"El vehículo ha aumentado su velocidad: " + velocidad + " km/h → " + (velocidad + incremento));
			velocidad += incremento;
		} else {
			System.out.println("El vehículo no puede ir más rápido...");
		}
	}

	public void frenar(int decremento) {
		if (velocidad - decremento >= 0 && movimiento) {
			System.out.println(
					"El vehículo ha disminuido su velocidad: " + velocidad + " km/h → " + (velocidad - decremento));
			velocidad -= decremento;
		} else {
			System.out.println("El vehículo no puede ir más lento...");
		}
	}

	public boolean detener(String colorSemaforo) {
		if (colorSemaforo.isEmpty() || colorSemaforo.equalsIgnoreCase("rojo")) {
			System.out.print("El vehículo se ha detenido → ");
			velocidad = 0;
			movimiento = false;
			return true;
		} else {
			System.out.print("¿El vehículo se detengo? → ");
			return false;
		}

	}

}
