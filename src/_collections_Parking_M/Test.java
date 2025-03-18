package _collections_Parking_M;

public class Test {

	public static void main(String[] args) {

		Coche AMTO1 = new Coche(Marca.TO, Color.AM);
		Coche AMTO2 = new Coche(Marca.TO, Color.AM);
		Coche AMTO3 = new Coche(Marca.TO, Color.AM);

		Coche HOVI1 = new Coche(Marca.HO, Color.VI);

		Coche LENA1 = new Coche(Marca.LE, Color.NA);
		Coche MENA1 = new Coche(Marca.ME, Color.NA);

		Coche MEAZ1 = new Coche(Marca.ME, Color.AZ);
		Coche MEAZ2 = new Coche(Marca.ME, Color.AZ);

		Coche MERO1 = new Coche(Marca.ME, Color.RO);
		Coche MERO2 = new Coche(Marca.ME, Color.RO);
		
		/*
		Coche[] arrayCoches = {
				new Coche(Marca.AU, Color.AM),
				new Coche(Marca.HO, Color.NA),
				new Coche(Marca.ME, Color.RO)
		};
		
		for (Coche c : arrayCoches) {
			parking1.entraCoche(c);
		}
		*/
		
		Parking parking1 = new Parking("Mi primer parking", 7);
		
		Parking parking2 = new Parking("Mi segundo parking", 3);
		
		/*
		System.out.println("1\nENTRA COCHE🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗");
		parking1.entraCoche(AMTO1);
		parking1.entraCoche(AMTO1);
		parking1.entraCoche(AMTO2);
		parking1.entraCoche(AMTO3);
		parking1.entraCoche(HOVI1);
		parking1.entraCoche(LENA1);
		parking1.entraCoche(MENA1);
		parking1.entraCoche(MEAZ1);
		parking1.entraCoche(MEAZ2);
		parking1.entraCoche(MERO1);
		parking1.entraCoche(MERO2);
		
		parking1.reportColores();
		parking1.reportMarcas();
		parking1.reportCochesIguales();
		parking1.reportSetCoches();
		parking1.reportParking();
		
		
		System.out.println("2\nSALE COCHE🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗");
		parking1.saleCoche(AMTO2);
		parking1.saleCoche(AMTO3);
		parking1.saleCoche(MERO1);
		parking1.saleCoche(MEAZ1);
		parking1.saleCoche(MEAZ1);
		parking1.reportColores();
		parking1.reportMarcas();
		parking1.reportCochesIguales();
		parking1.reportSetCoches();
		parking1.reportParking();
		
		System.out.println("3\nVACÍA PARKING🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗");
		parking1.saleCoche(MERO2);
		parking1.saleCocheAleatorio();
		parking1.vaciaParking();
		parking1.reportColores();
		parking1.reportMarcas();
		parking1.reportCochesIguales();
		parking1.reportSetCoches();
		parking1.reportParking();
		
		System.out.println("4\nCOMPROBACIONES ADICIONALES🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗");
		parking2.entraCoche(MERO2);
		parking2.entraCoche(MERO1);
		parking2.entraCoche(MENA1);
		parking2.entraCoche(LENA1);
		parking2.reportParking();
		parking2.saleCoche(MERO2);
		parking2.saleCoche(MERO2);
		parking2.saleCoche(HOVI1);
		parking2.saleCoche(MERO1);
		parking2.saleCocheAleatorio();
		parking2.saleCoche(HOVI1);
		parking2.saleCocheAleatorio();
		parking2.saleCocheAleatorio();
		parking2.reportParking();
		*/
		
		
		///////////////////////////////////////////////////
		Parking p1 = new Parking("Mi primer parking", 3);
		
		Coche c1 = new Coche(Marca.SE, Color.RO);
		Coche c2 = new Coche(Marca.SE, Color.RO);
		Coche c3 = new Coche(Marca.SE, Color.RO);
		
		System.out.println("1º PRUEBA: METER 3 COCHES IGUALES");
		p1.entraCoche(c1);
		p1.entraCoche(c2);
		p1.entraCoche(c3);
		p1.sacarTodosReport();
		
		System.out.println("\n2º PRUEBA: SACAR c2");
		p1.saleCoche(c2);
		p1.sacarTodosReport();
		
		System.out.println("\n3º PRUEBA: SACAR c2");
		p1.saleCoche(c2);
		p1.sacarTodosReport();
		
		System.out.println("\n4º PRUEBA: VACIAR EL PARKING");
		p1.vaciaParking();
		p1.sacarTodosReport();
		
		System.out.println("///////////////////////////////////////////////////////");
		System.out.println("1º PRUEBA: METER 3 COCHES IGUALES");
	
		Parking p2 = new Parking("Mi segundo parking", 3);
		p2.entraCoche(c1);
		p2.entraCoche(c2);
		p2.entraCoche(c3);
		p2.sacarTodosReport();
		
		System.out.println("2º PRUEBA: SACAR 3 COCHES ALEATORIOS");
		for (int i = 0; i < 4; i++) {
			p2.saleCocheAleatorio();
		}
		p2.sacarTodosReport();
		
		System.out.println("///////////////////////////////////////////////////////");
		System.out.println("1º PRUEBA: METER 3 COCHES IGUALES");
		Parking p3 = new Parking("Mi tercer parking", 3);
		p3.entraCoche(c1);
		p3.entraCoche(c2);
		p3.entraCoche(c3);
		p3.sacarTodosReport();
		
		System.out.println("\n2º PRUEBA: SACAR UN COCHE ALEATORIO");
		Coche cocheAl = p3.saleCocheAleatorio();
		p3.sacarTodosReport();
		
		System.out.println("\n3º PRUEBA: VOLVER A METER EL COCHE ALEATORIO");
		p3.entraCoche(cocheAl);
		p3.sacarTodosReport();
		
		System.out.println("///////////////////////////////////////////////////////");
		Parking p4 = new Parking("Mi cuarto parking", 3);
		
		System.out.println("1º PRUEBA: SACAR COCHE ALEATORIO");
		p4.saleCocheAleatorio();
		p4.sacarTodosReport();
		
		System.out.println("\n2º PRUEBA: SACAR c1");
		p4.saleCoche(c1);
		p4.sacarTodosReport();
		
		
		System.out.println("///////////////////////////////////////////////////////");
		Parking p5 = new Parking("Mi quinto parking", 3);
		
		System.out.println("1º PRUEBA: BUCLE PARA LLEVAR EL PARKING EN EXCESO");
		for (int i = 0; i < 5; i++) {
			p5.entraCoche(new Coche());
		}
		p5.sacarTodosReport();
		
		System.out.println("**º PRUEBA: OTRA MANERA");
		Parking p6 = new Parking("Mi quinto parking", 3);
		for (int i = 0; i < 5; i++) {
			p6.entraCoche(new Coche(Marca.SE, Color.RO));
		}
		p6.sacarTodosReport();
		
		
	}

}
