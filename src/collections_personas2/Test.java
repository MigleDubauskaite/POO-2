package collections_personas2;

public class Test {

	public static void main(String[] args) {

		Comunidad p1 = new Comunidad("Mi primer parking", 3);

		Persona c1 = new Persona(Nacionalidad.DE, Ocupacion.AB);
		Persona c2 = new Persona(Nacionalidad.DE, Ocupacion.AB);
		Persona c3 = new Persona(Nacionalidad.DE, Ocupacion.AB);
		Persona c4 = new Persona(Nacionalidad.DE, Ocupacion.AB);

		System.out.println("1º PRUEBA: METER 3 COCHES IGUALES");
		p1.entraPersona(c1);
		p1.entraPersona(c2);
		p1.entraPersona(c3);
		p1.entraPersona(c4);
		p1.reportTodos();

		System.out.println("\n2º PRUEBA: SACAR c2");
		p1.salePersona(c2);
		p1.reportTodos();

		System.out.println("\n3º PRUEBA: SACAR c2");
		p1.salePersona(c2);
		p1.reportTodos();

		System.out.println("\n4º PRUEBA: VACIAR EL PARKING");
		p1.vaciaComunidad();
		p1.reportTodos();

		System.out.println("///////////////////////////////////////////////////////");
		System.out.println("1º PRUEBA: METER 3 COCHES IGUALES");

		Comunidad p2 = new Comunidad("Mi segundo parking", 3);
		p2.entraPersona(c1);
		p2.entraPersona(c2);
		p2.entraPersona(c3);
		p2.reportTodos();

		System.out.println("2º PRUEBA: SACAR 3 COCHES ALEATORIOS");
		for (int i = 0; i < 4; i++) {
			p2.salePersonaAleatoria();
		}
		p2.reportTodos();

		System.out.println("///////////////////////////////////////////////////////");
		System.out.println("1º PRUEBA: METER 3 COCHES IGUALES");
		Comunidad p3 = new Comunidad("Mi tercer parking", 3);
		p3.entraPersona(c1);
		p3.entraPersona(c2);
		p3.entraPersona(c3);
		p3.reportTodos();

		System.out.println("\n2º PRUEBA: SACAR UN COCHE ALEATORIO");
		Persona personaAl = p3.salePersonaAleatoria();
		p3.reportTodos();

		System.out.println("\n3º PRUEBA: VOLVER A METER EL COCHE ALEATORIO");
		p3.entraPersona(personaAl);
		p3.reportTodos();

		System.out.println("///////////////////////////////////////////////////////");
		Comunidad p4 = new Comunidad("Mi cuarto parking", 3);

		System.out.println("1º PRUEBA: SACAR COCHE ALEATORIO");
		p4.salePersonaAleatoria();
		p4.reportTodos();

		System.out.println("\n2º PRUEBA: SACAR c1");
		p4.salePersona(c1);
		p4.reportTodos();

		System.out.println("///////////////////////////////////////////////////////");
		Comunidad p5 = new Comunidad("Mi quinto parking", 3);

		System.out.println("1º PRUEBA: BUCLE PARA LLEVAR EL PARKING EN EXCESO");
		for (int i = 0; i < 5; i++) {
			p5.entraPersona(new Persona());
		}
		p5.reportTodos();

		System.out.println("**º PRUEBA: OTRA MANERA");
		Comunidad p6 = new Comunidad("Mi quinto parking", 3);
		for (int i = 0; i < 5; i++) {
			p6.entraPersona(new Persona(Nacionalidad.DE, Ocupacion.AB));
		}
		p6.reportTodos();

	}

}
