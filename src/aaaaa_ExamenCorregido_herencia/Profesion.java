package aaaaa_ExamenCorregido_herencia;

public abstract class Profesion {

	private String nombre;
	private short anioDeNacimiento;
	// set de nombre y de anioDeNacimiento no puede existir: no se debe poder
	// cambiar el nombre ni año de nacimiento
	private String especialidad;

	public String getNombre() {
		return nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public Profesion(String nombre, short anioDeNacimiento, String especialidad) {
		this.nombre = nombre;
		this.anioDeNacimiento = anioDeNacimiento;
		this.especialidad = especialidad;
	}

	public abstract void trabajar();

	public short calcularEdad() {
		return (short) (2025 - anioDeNacimiento);
	}

	@Override
	public String toString() {
		return "Profesion [nombre=" + nombre + ", anioDeNacimiento=" + anioDeNacimiento + ", especialidad="
				+ especialidad + "]";
	}
}
