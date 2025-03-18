package metodos_arrayList;

public class Lunes_10_02 {
	
	// crear un bucle for wue cuente de 1 a 10
	// luego lo convertimos en do-while
	
	public static void main(String[] args) {
		
		System.out.println("Bucle FOR");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n\nbucle DO-WHILE");
		int num = 1;
		/*do {
			System.out.print(num++ + " ");
		} while (num <= 10);*/
		
		System.out.println("\n\nbucle WHILE");
		while(num <= 10) {
			System.out.print(num++ + " ");
		}
		
	}

}
