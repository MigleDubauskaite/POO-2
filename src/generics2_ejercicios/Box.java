package generics2_ejercicios;
import generics.Articulo;

public class Box <T> {
	
	private T contenido;

	private Box(T contenido) {
		this.contenido = contenido;
	}

	public static <T> Box<T> of (T contenido){
		return new Box<>(contenido);
	}
	// es una box de tipo T 
	
	public static <T> Box<T> empty(){
		return new Box<>(null);
	}
	
	public boolean isPresent() {
		return contenido != null;
	}

	@Override
	public String toString() {
		return "Box [contenido=" + contenido + "]";
	}

	public static void main(String[] args) {
		Box<String> b1 = Box.of("Hola");
		Box<Articulo> b2 = Box.of(new Articulo("Artículo 1"));
		Box<String> b3 = Box.empty(); // creame una caja vacía
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
	

	
	

}
