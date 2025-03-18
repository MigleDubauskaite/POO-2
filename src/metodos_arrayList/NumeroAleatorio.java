package metodos_arrayList;

import java.util.ArrayList;
import java.util.Random;

public class NumeroAleatorio {
	
	
	/*
	Crear un `ArrayList` que contenga 20 números aleatorios entre 1 y 100.
	
	1. Muestra por pantalla la lista.
	2. Calcula y muestra por pantalla la cantidad, la suma, la media, el máximo y el mínimo de los valores.
	3. Elimina de la lista todos los que son menores que 50
	4. Vuelve a mostrar la lista
	5. Calcula y muestra por pantalla la cantidad, la suma, la media, el máximo y el mínimo de los valores.
	
	A continuación, información de ayuda para la generación de un número aleatorio entre 3 y 10

	 */
	
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>(); 
		
		Random random = new Random();
		
		// 20 números: de 1 a 100
		for (int i = 0; i < 20; i++) {
			int numAleatorio = random.nextInt(1, 100);
			num.add(numAleatorio);
		}

		System.out.println(num);
		
		System.out.println("▢ La cantidad de números: " + num.size());
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
}
