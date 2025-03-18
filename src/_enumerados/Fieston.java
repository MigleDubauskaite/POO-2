package _enumerados;

public class Fieston {

	private String lugar;
	private FinDe dia; // llamamos a la clase de Enum (con dias de fin de)

	public Fieston(String lugar, FinDe dia) {
		this.lugar = lugar;
		this.dia = dia;
	}

	@Override
	public String toString() {
		return "Fieston [lugar=" + lugar + ", dia=" + dia + "]";
	}

	public static void main(String[] args) {
		Fieston fieston = new Fieston("Core", FinDe.SA);
		System.out.println(fieston);

		// clase Enum tiene metodos estaticos
		// FinDe.values(); // es un array

		for (FinDe f : FinDe.values()) {
			System.out.println(f);
		}

		System.out.println("\nImprimimos propiedades de los LITERALES");
		for (FinDe f : FinDe.values()) {
			// System.out.println(f.getNombreES()); // lo sacamos con getters
			System.out.println(f.presentacion()); // lo sacamos con metodo en clase Enum
		}

	}

}
