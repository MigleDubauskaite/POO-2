package parking_Javi_24_02;

public class Test {
	
	public static void main(String[] args) {
		
		Parking p1 = new Parking("P - 1", 10);
		
		for (int i = 0; i < 5; i++) {
			p1.entraCoche(new Coche());
		}
		
		System.out.println("LISTA");
		for (Coche coche : p1.getListaCoches()) {
			System.out.println(coche);
		}
		
		System.out.println("\nCONJUNTO (SET)");
		for (Coche coche : p1.getConjuntoCoches()) {
			System.out.println(coche);
		}
		
	}
	
	

}
