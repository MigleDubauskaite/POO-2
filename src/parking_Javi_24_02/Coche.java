package parking_Javi_24_02;

import java.util.Objects;

public class Coche {

	private Color color;
	private Marca marca;
	
	public Coche(Color color, Marca marca) {
		this.color = color;
		this.marca = marca;
	}
	
	// el aleatorio
	public Coche() {
		color = Color.aleatorio();
		marca = Marca.aleatorio();
	}
	
	public Color getColor() {
		return color;
	}

	public Marca getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		return "Coche [color=" + color + ", marca=" + marca + "]" + "(" + hashCode() + ")." ;
	}

	// hash genera
	@Override
	public int hashCode() {
		return Objects.hash(color, marca);
	}

	// definir el equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // si el objeto que entra es absolutamente igual que this -> true
			return true; // no sigo
		if (obj == null)
			return false; // no sigo
		if (getClass() != obj.getClass())  // si la clase de this es distinta a la clase de objeto que entra -> false
			return false;
		Coche other = (Coche) obj;   // le hacemos un cast?
		return color == other.color && marca == other.marca;  // si las marcas y colores son iguales retorname true, si no, retorname false
	}
	
	
	
	
	
	
}
