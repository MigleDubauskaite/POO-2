package generics;

public class CajaParaTodo {
	
	private Object contenido;

	public CajaParaTodo(Object contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "CajaParaTodo [contenido=" + contenido + "]";
	}

	
	// necesitamos un metodo GET() para sacar su contenido
	public Object getContenido() {
		return contenido;
	}
	
	
	

}
