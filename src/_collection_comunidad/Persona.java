package _collection_comunidad;

import java.util.Objects;

public class Persona {
	
	private String nombre;
	private Profesion profesion;
	private Ciudad ciudad;
	
	public Persona() {
		profesion = Profesion.profesionRandom();
		ciudad = Ciudad.ciudadRandom();
	}
	
	public Persona(String nombre, Profesion profesion, Ciudad ciudad) {
		this.nombre = nombre;
		this.profesion = profesion;
		this.ciudad = ciudad;
	}

	public Profesion getProfesion() {
		return profesion;
	}
	
	public Ciudad getCiudad() {
		return ciudad;
	}
	
	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return String.format("Persona: %s %s %s", nombre, profesion, ciudad);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ciudad, profesion);
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
		return ciudad == other.ciudad && profesion == other.profesion;
	}
	
	


	

	
	
	
	

}
