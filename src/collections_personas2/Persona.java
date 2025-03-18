package collections_personas2;

import java.util.Objects;

public class Persona {
	
	private String nombre;
	private int edad;
	private Nacionalidad nacionalidad;
	private Ocupacion ocupacion;
	
	public Persona(Nacionalidad nacionalidad, Ocupacion ocupacion) {
		this.nacionalidad = nacionalidad;
		this.ocupacion = ocupacion;
	}

	public Persona() {
		nacionalidad = Nacionalidad.nacionalidadRandom();
		ocupacion = Ocupacion.ocupacionRandom();
	}
	
	public Ocupacion getOcupacion() {
		return ocupacion;
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	@Override
	public String toString() {
		return String.format("Persona: %s, %d años, %s %s", nombre, edad, nacionalidad, ocupacion);
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(nacionalidad, ocupacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return nacionalidad == other.nacionalidad && ocupacion == other.ocupacion;
	}
	
	

}
