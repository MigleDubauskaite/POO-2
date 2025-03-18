package _collection_comunidad;

public class Test {
	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = new Persona();
		Persona persona4 = new Persona();
		
		System.out.println(persona1);
		ComunidadVecinos c1 = new ComunidadVecinos("Edificio Sol", 3);
		
		c1.reportComunidad();
		
		c1.entraPersona(persona1);
		c1.entraPersona(persona1);
		c1.entraPersona(persona2);
		c1.entraPersona(persona3);
		c1.entraPersona(persona4);
		c1.reportComunidad();
		c1.reportProfesiones();
		
		///
		///
		System.out.println("\n\n");
		ComunidadVecinos comunidad1 = new ComunidadVecinos("Residencial Atenas", 5);
		Persona p1 = new Persona("Carlos", Profesion.IN, Ciudad.MA);
        Persona p2 = new Persona("Lucía", Profesion.ME, Ciudad.BE);
        Persona p3 = new Persona("Mario", Profesion.ME, Ciudad.RO);
        Persona p4 = new Persona("Sofía", Profesion.IN, Ciudad.MA);
        Persona p5 = new Persona("Elena", Profesion.PO, Ciudad.AT);
        
        comunidad1.entraPersona(p1);
        comunidad1.entraPersona(p2);
        comunidad1.entraPersona(p3);
        comunidad1.entraPersona(p4);
        comunidad1.entraPersona(p4);
        comunidad1.entraPersona(p5);
        comunidad1.entraPersona(persona4);
        comunidad1.reportComunidad();
        comunidad1.reportProfesiones();
        comunidad1.reportCiudades();
        comunidad1.reportPersonasIguales();
        comunidad1.reportSet();
        
        System.out.println("===========");
        comunidad1.salePersona(p1);
        comunidad1.salePersona(p1);
        comunidad1.salePersona(p3);
        comunidad1.salePersona(p5);
        comunidad1.reportComunidad();
        comunidad1.reportProfesiones();
        comunidad1.reportCiudades();
        comunidad1.reportPersonasIguales();
        comunidad1.reportSet();
		
	}

}
