package metodos_arrayList;

import java.util.ArrayList;

public class Array_Colores {

	// ArrayEjemplo1

	public static void main(String[] args) {

		ArrayList<String> colores = new ArrayList<>();

		// Poblarlo con los siguientes elementos hasta llegar a 100:
		// rojo, amarillo, verde, rojo, amarillo, azul, naranja, marrón, verde.

		String[] coloresPermitidos = {"rojo", "amarillo", "verde", "rojo", "amarillo", "azul", "naranja", "marrón", "verde"};
		/*
		 while (colores.size() < 100) {
			for (String color : coloresPermitidos) {
				if (colores.size() < 100) {
					colores.add(color);
				} else {
					break;
				}
			}
		} 
		*/
		 
		for (int i = 0; i < 100; i++) {
			colores.add(coloresPermitidos [i % coloresPermitidos.length]);
			// indice (i) 0 % 9 = 0   -> primer color[0] == coloresPermitidos[0] es decir, será rojo
			// indice (i) 1 % 9 = 0   -> segundo color[1] == coloresPermitidos[1] es decir, será amarillo
			// ....
			// indice (i) 8 % 9 = 0   -> noveno color[8] == coloresPermitidos[8] es decir, será verde
			// indice (i) 9 % 9 = 0   -> decimo color[9] == coloresPermitidos[9] es decir, será rojo (empieza asignarse desde principio)
		}
		 
		System.out.println();
		System.out.println("FOR");
		System.out.println("-----");
		for (int i = 0; i < colores.size(); i++) {  
			System.out.print(colores.get(i) + " ");
		}
		
		System.out.println(); System.out.println();
		System.out.println("FOR-EACH");
		System.out.println("-----");
		for (String color : colores) {
			System.out.print(color + " ");
		}
		
		// System.out.println(); System.out.println(); System.out.println("El tamaño del array [" + colores.size() + "].");
		
		
		// Borrar el segundo rojo del ArrayList, para ello:
		int contadorRojo = 0;
		for (int i = 0; i < colores.size(); i++) {
			
			if (colores.get(i).contains("rojo")) {
				contadorRojo++;
				
				if (contadorRojo == 2) {
					colores.remove(i);
				}
			}
		}
		
		System.out.println(); System.out.println();
		System.out.println("ArrayList despues de borrar segundo rojo");
		System.out.println("----------------------------------------------");
		for (String color : colores) {
			System.out.print(color + " ");
		}
		
		
		// Borra todos los amarillos utizando un bucle while
		
		for (int i = 0; i < colores.size(); i++) {
			while (colores.get(i).contains("amarillo")) {
				colores.remove(i);
			}
		}
		
		System.out.println(); System.out.println();
		System.out.println("ArrayList despues de borrar todos los amarillos");
		System.out.println("----------------------------------------------");
		for (String color : colores) {
			System.out.print(color + " ");
		}
		


	}

}
