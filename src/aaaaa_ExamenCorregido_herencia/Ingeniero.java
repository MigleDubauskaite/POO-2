package aaaaa_ExamenCorregido_herencia;

public class Ingeniero extends Profesion {

	public Ingeniero(String nombre, short anioDeNacimiento, String especialidad) {
		super(nombre, anioDeNacimiento, especialidad);
	}

	@Override
	public void trabajar() {
		System.out.printf("El ingeniero [%s] está diseñando un proyecto de [%s].%n", getNombre(), getEspecialidad());
	}

	public double calcularCostoProyecto(double horas, double tarifaPorHoras) {
		return horas * tarifaPorHoras;
	}

}
