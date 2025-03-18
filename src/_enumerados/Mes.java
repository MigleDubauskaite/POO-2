package _enumerados;

public enum Mes {

	EN(1, "Enero", "January"), FEB(2, "Febrero", "February"), 
	MAR(3, "Marzo", "March"), AB(4, "Abril", "April"), 
	MAY(5, "Mayo", "May"), JUN(6, "Junio", "June"),
	JUL(7, "Julio", "July"), AG(8, "Agosto", "August"), 
	SEP(9, "Septiembre", "September"), OCT(10, "Octubre", "Octuber"), 
	NOV(11, "Noviembre", "November"), DIC(12, "Diciembre", "December");

	private int numeroMes;
	private String nombreES;
	private String nombreEN;

	private Mes(int numeroMes, String nombreES, String nombreEN) {
		this.numeroMes = numeroMes;
		this.nombreES = nombreES;
		this.nombreEN = nombreEN;
	}

	public int getNumeroMes() {
		return numeroMes;
	}

	public String getNombreES() {
		return nombreES;
	}
	
	public String getNombreEN() {
		return nombreEN;
	}

	public String definir() {
		return String.format("El mes %d es %s (%s).", numeroMes, nombreES, nombreEN);
	}
	
	public static String darNumero(int numMes) {
		for (Mes m : Mes.values()) {
			if (m.numeroMes == numMes) {
				return m.nombreES + ", " +  m.nombreEN;
			}
		}
		return "Numero no coincide con ningún mes.";
	}
	
	public static int darNumeroPorNombre(Mes mes) {
		System.out.print("El número del mes introducido es: ");
		return mes.numeroMes;
		//return mes.nombreEN + ", " + mes.nombreES;
	}

}
