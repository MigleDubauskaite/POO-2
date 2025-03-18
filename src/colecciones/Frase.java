package colecciones;

public class Frase {
	
	private String [] palabras;
	
	//Crear una frase que separe cada palabra por espacios en blanco
	public Frase(String frase) {
		palabras = frase.split(" ");  //split con espacios en blanco
	}
	
	@Override
	public String toString() {
		String resultado = "";
		for (String palabra : palabras) {
			resultado += palabra + " ";
		}
		return resultado;
	}


	public void addPalabra(String palabra) {
		String [] arrayNuevo = new String[palabras.length + 1];
		String [] arrayViejo = palabras;
		
		 for (int i = 0; i < arrayViejo.length; i++) {   
			arrayNuevo[i] = arrayViejo [i];				// copia los elementos del arreglo -palabras- en -arrayNuevo-
			
		}
		 arrayNuevo[arrayNuevo.length-1] = palabra;     // asigna la nueva palabra al último índice del nuevo arreglo.
		 palabras = arrayNuevo;							// Después de agregar la palabra, se actualiza el atributo palabras con el nuevo arreglo
		
	}
	
	
	public static void main(String[] args) {
		Frase f1 = new Frase ("hola soy yo");
		System.out.println(f1);
		f1.addPalabra("lola");
		System.out.println(f1);
	}
	
}
