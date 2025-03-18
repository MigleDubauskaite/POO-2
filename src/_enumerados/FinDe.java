package _enumerados;

public enum FinDe {

	// es un literal que hace referencia a él
	VI(5, "viernes", "Friday"), SA(6, "sabado", "Saturday"), DO(7, "domingo", "Sunday");
	// literales van en maysucula

	// si seponen solo lietrales no hace pone rpunto y coma (;)
	// si añadimos propiedades (otro) ponemos ;

	private int numeroDia;
	private String nombreES;
	private String nombreEN;

	// en clase Enum los constructores son privados
	private FinDe(int numeroDia, String nombreES, String nombreEN) {
		this.numeroDia = numeroDia;
		this.nombreES = nombreES;
		this.nombreEN = nombreEN;
	}

	// VI (5) , SA(6), DO(7); -> se asigna el numero del dia
	// es decir, se dan lo parametros en cada uno de los literales (pelotita VI 5)
	// pelotita SA 6 pelotita DO 7

	// creamos los getters
	public int getNumeroDia() {
		return numeroDia;
	}

	public String getNombreES() {
		return nombreES;
	}

	public String getNombreEN() {
		return nombreEN;
	}

	public String presentacion() {
		return String.format("El día (%d) del finde es el %s (%s).", numeroDia, nombreES, nombreEN);
	}

}

// como hago referencia a él? con el lietral: FinDe.SA
// puede tener propeidades (para indicar el nomnre compelto)

// cuando se crea? 
