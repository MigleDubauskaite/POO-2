package _enumerados;

public class Run {

	private int anio;
	private Mes mes;

	public Run(int anio, Mes mes) {
		this.anio = anio;
		this.mes = mes;
	}

	@Override
	public String toString() {
		return "Anio [anio=" + anio + ", mes=" + mes + "]";
	}
	
	/*
	public void darNumero(int numero) {
		
		for(Mes m: Mes.values()) {
			if (numero == m.getNumeroMes()) {
				switch(numero) {
				case 1: 
					System.out.println(m.getNombreEN());
					//System.out.println("Enero, January");
					break;
				case 2: 
					System.out.println("Febrero, February");
					break;
				case 3: 
					System.out.println("Marzo, March");
					break;
				case 4: 
					System.out.println("Abril, April");
					break;
				case 5: 
					System.out.println("Mayo, May");
					break;
				case 6: 
					System.out.println("Junio, June");
					break;
				case 7: 
					System.out.println("Julio, July");
					break;
				case 8: 
					System.out.println("Agosto, August");
					break;
				case 9: 
					System.out.println("Septiembre, September");
					break;
				case 10: 
					System.out.println("Octubre, October");
					break;
				case 11: 
					System.out.println("Noviembre, November");
					break;
				case 12: 
					System.out.println("Diciembre, December");
					break;
				default:
					break;
				}
				System.out.println("no corresponde");
			}
			
		}
	}
*/
	public static void main(String[] args) {

		Run anio = new Run(2024, Mes.AB);
		System.out.println(anio);
		
		System.out.println("\nProbamos el método darNumero()");
		//anio.darNumero(1);
		//anio.darNumero(13);
		System.out.println(Mes.darNumero(2));
		System.out.println(Mes.darNumeroPorNombre(Mes.AB));

		System.out.println("\nImprimimos los LITERALES de clase ENUM");
		for (Mes m : Mes.values()) {
			System.out.print(m + " ");
		}

		System.out.println("\n\nImprimimos propiedades de clase ENUM");
		for (Mes m : Mes.values()) {
			System.out.println(m.definir());
		}
		
		System.out.println("\nProbamos MÉTODOS de clase ENUM");
		System.out.print("ORDINAL():");
		for(Mes m: Mes.values()) {
			System.out.print(m.ordinal() + " ");
			
		}
		
		System.out.println("\nORDINAL() -> " + Mes.AB.ordinal());
		System.out.println("VALUE OF() -> " + Mes.valueOf("AB")); // devuelve el enum del literal
		
		System.out.print("NAME():");
		for(Mes m: Mes.values()) {
			System.out.print(m.name() + " ");
			
		}
		
		
		
		// en caso de switch solo se compila los literales (AB, EN, etc)
		
		

	}

}
