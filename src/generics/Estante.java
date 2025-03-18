package generics;

import java.util.Arrays;

public class Estante <T> {
	// array de elementos distintos: estantes genericos que puede tener cualquier tipo de cosas
	
	private T[] estantes;

	public Estante(T[] estantes) {
		this.estantes = estantes;
	}

	@Override
	public String toString() {
		return "Estante [estantes=" + Arrays.toString(estantes) + "]";
	}

	public void setEstantes(T[] estantes) {
		this.estantes = estantes;
	}
	
	// trabaaja en conjunto con la clase ofreciendo metodos  -> funciona como clase helper
	
	

}
