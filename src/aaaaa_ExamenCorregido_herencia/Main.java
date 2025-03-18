package aaaaa_ExamenCorregido_herencia;

public class Main {

	public static void main(String[] args) {

		Profesion[] profesionales = { new Doctor("Pedro", (short) 1999, "ginecólogía"),
				new Doctor("Manuel", (short) 1989, "ginecólogía"), new Doctor("Antonio", (short) 1979, "ginecólogía"),

				new Ingeniero("Juan", (short) 1990, "obras y puentes"),
				new Ingeniero("Jaime", (short) 1980, "puentes y obras"),
				new Ingeniero("José", (short) 1995, "electrónica"),

				new Profesor("Jaime", (short) 1985, "infórmatica"),
				new Profesor("Antonio", (short) 1975, "matemáticas"), new Profesor("Pedro", (short) 1990, "inglés") };

		for (Profesion p : profesionales) {
			p.trabajar();
			System.out.println("La edad: " + "" + p.calcularEdad());

			if (p instanceof Doctor) {
				((Doctor) p).recetarMedicamento("Medicamento de prueba");
			} else if (p instanceof Ingeniero) {
				((Ingeniero) p).calcularCostoProyecto(50, 100.43);
			} else if (p instanceof Profesor) {
				((Profesor) p).calificarExamenes(30);
			} else {
				System.out.println("Esto no es un profesional conocido");
			}
		}
	}
}
