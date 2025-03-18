package metodos_arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Metodo {
	
	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<>();
		
		// add(elemento): 
		// Añade un elemento al final de la lista.
		a1.add("texto1");  // se pone en pos 0
		a1.add("texto2"); 
		a1.add("texto3");
		System.out.println("probando metodo ADD");
		System.out.println(a1);
		
		ArrayList<Integer> a2 = new ArrayList<>();
		a2.add(1);  
		a2.add(2); 
		a2.add(3);
		System.out.println(a2);
		
		System.out.println();
		
		// add(indice, elemento): 
		//inserta un elemento en una posición indicada y desplaza el resto hacia la derecha.
		a1.add(0, "3");
		a2.add(3, null);
		System.out.println("probando metodo ADD (index, element)");
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println("Tamaño del array: " + a1.size());
		
		System.out.println();
		
		// clear(): 
		// elimina todos los elementos de la lista.
		
		// size(): 
		// Devuelve el tamaño (número de elementos) de la lista.
		
		a1.clear();
		a2.clear();
		System.out.println("probando metodo CLEAR");
		System.out.println(a1);
		System.out.println("Tamaño del array: " + a1.size());
		System.out.println(a2);
		
		System.out.println();
		
		// contains(elemento): 
		// Devuelve true si la lista contiene el elemento que se especifica y false en caso contrario.
		a1.add("texto1"); a1.add("texto2"); a1.add("texto3");
		a2.add(1);  a2.add(2); a2.add(3);
		a1.contains(a2);
		System.out.println("probando metodo CONTAINS");
		System.out.println(a1.contains("texto1"));
		System.out.println(a2.contains("1"));
		System.out.println(a2.contains(3));
		
		
		// get(indice): 
		// Devuelve el elemento de la posición que se indica entre paréntesis.
		System.out.println();
		System.out.println("probando metodo GET");
		System.out.println(a1.get(0));
		System.out.println(a1.get(1));
		System.out.println(a1.get(2));
		System.out.println(a2.get(0));
		System.out.println(a2.get(1));
		System.out.println(a2.get(2));
		
		
		// indexOf(elemento): 
		// Devuelve la posición de la primera ocurrencia del elemento que se indica entre paréntesis.
		System.out.println();
		System.out.println("probando metodo INDEX OF");
		System.out.println("indexOF(\'texto2\'): " + a1.indexOf(a2));
		System.out.println(a1.indexOf("texto2"));
		System.out.println(a2.indexOf(1));
		System.out.println(a2.indexOf(3));
		// devuelve -1 si el elemento no existe
		
		
		
		// isEmpty(): 
		// Devuelve true si la lista está vacía y false en caso de tener algún elemento.
		System.out.println();
		System.out.println("probando metodo IS EMPTY");
		System.out.println(a1.isEmpty());
		System.out.println(a2.isEmpty());
		a1.clear();
		System.out.println(a1.isEmpty());
		
		
		// remove(indice): 
		// Elimina el elemento que se encuentra en una posición.
		System.out.println();
		System.out.println("probando metodo REMOVE (index)");
		System.out.println(a2);
		System.out.println("Ha borrado: " + a2.remove(1));
		System.out.println(a2);
		System.out.println("Ha borrado: " + a2.remove(1));
		System.out.println(a2);
		
		
		// remove(elemento): 
		// Elimina la primera ocurrencia de un elemento.
		System.out.println();
		System.out.println("probando metodo REMOVE (element)");
		System.out.println(a1.remove("te"));
		
		a1.add("texto1"); a1.add("texto2"); a1.add("texto3");
		a2.add(1);  a2.add(2); a2.add(3);
		
		
		// set(indice, elemento): 
		// Machaca el elemento que se encuentra en una determinada posición con el elemento que se pasa como parámetro.
		System.out.println();
		System.out.println(a1);
		System.out.println("set (1, \'seteado\'):" + a1.set(1, "seteado"));
		System.out.println(a1);
		
		// toArray(): 
		// Devuelve un array con todos y cada uno de los elementos que contiene la lista.
		System.out.println();
		
		
	}

}
