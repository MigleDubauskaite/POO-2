package _collections_Parking_M;

import java.util.Objects;

public class Coche {

	private Marca marca;
	private Color color;

	public Coche() {
		color = Color.colorRandom();
		marca = Marca.marcaRandom();
	}
	
	public Coche(Marca marca, Color color) {
		this.marca = marca;
		this.color = color;
	}
	
	public Marca getMarca() {
		return marca;
	}

	public Color getColor() {
		return color;
	}

	@Override
	public String toString() {
		return marca + " " + color;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, marca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche coche = (Coche) obj;
		return color == coche.color && marca == coche.marca;
	}

}
