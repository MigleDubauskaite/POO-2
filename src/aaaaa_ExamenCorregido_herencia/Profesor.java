package aaaaa_ExamenCorregido_herencia;

public class Profesor extends Profesion {

	public Profesor(String nombre, short anioDeNacimiento, String especialidad) {
		super(nombre, anioDeNacimiento, especialidad);
	}

	@Override
	public void trabajar() {
		System.out.printf("El profesor [%s] está está enseñando [%s] a sus estudiantes.%n", getNombre(),
				getEspecialidad());
	}

	public void calificarExamenes(int cantidadDeEstudiantes) {
		System.out.printf("El profesor [%s] ha calificado [%s] estudiantes.%n", getNombre(), cantidadDeEstudiantes);
	}

}
