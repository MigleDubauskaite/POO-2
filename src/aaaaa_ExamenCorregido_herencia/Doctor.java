package aaaaa_ExamenCorregido_herencia;

public class Doctor extends Profesion {

	public Doctor(String nombre, short anioDeNacimiento, String especialidad) {
		super(nombre, anioDeNacimiento, especialidad);
	}

	@Override
	public void trabajar() {
		System.out.printf("El doctor [%s] está atendiendo pacientes en el área [%s].%n", getNombre(),
				getEspecialidad());
	}

	public void recetarMedicamento(String medicamento) {
		System.out.printf("El doctor [%s] ha recetado el medicamento [%s].%n", getNombre(), medicamento);
	}

}
