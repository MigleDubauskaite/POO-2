
package bbb_vehiculos_POO_examen;

public class prueba_POO {

	public static void main(String[] args) {
		System.out.println("|||||||||||||||||||||||||||||||||| COCHE ||||||||||||||||||||||||||||||||||||||||||||");
		Vehiculo_POO c1 = new Coche_POO("", "", 180, 90, false, "GFTY567", 50, true);
		System.out.println();
		Vehiculo_POO c2 = new Coche_POO("", "", 180, 175, true, "", 50, false);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println();
		System.out.println("Probamos el método ARRANCAR con COCHE");
		System.out.println(c1.arrancar());
		System.out.println(c2.arrancar());
		System.out.println();

		System.out.println("Probamos el método ACELERAR con COCHE");
		c1.acelerar(10);
		c2.acelerar(20);
		System.out.println();
		
		System.out.println("Probamos el método FRENAR con COCHE");
		c1.frenar(10);
		c2.frenar(20);
		c2.frenar(175);
		System.out.println();

		System.out.println("Probamos el método DETENER con COCHE");
		System.out.println(c1.detener("rojo"));
		System.out.println(c2.detener(""));
		System.out.println(c2.detener("verde"));
		System.out.println();

		Coche_POO coche1 = new Coche_POO("", "", 0, 0, false, "", 0, true);
		Coche_POO coche2 = new Coche_POO("", "", 0, 0, true, "", 0, true);

		System.out.println(coche1);
		System.out.println("Probamos el método ABRIR PUERTAS con COCHE");
		coche1.abrirPuertas();
		coche2.abrirPuertas();
		System.out.println(coche1.probamosPuertas());
		System.out.println(coche2.probamosPuertas());

		System.out.println();
		System.out.println();
		System.out
				.println("|||||||||||||||||||||||||||||||||| MOTOCICLETA ||||||||||||||||||||||||||||||||||||||||||||");

		Vehiculo_POO m1 = new Motocicleta_POO("", "", 180, 90, false, "", 50);
		System.out.println();
		Vehiculo_POO m2 = new Motocicleta_POO("", "", 180, 175, true, "", 50);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println();
		System.out.println("Probamos el método ACELERAR con MOTO");
		m1.acelerar(10);
		Motocicleta_POO moto1 = new Motocicleta_POO("", "", 180, 50, true, "", 50);
		Motocicleta_POO moto2 = new Motocicleta_POO("", "", 180, 90, true, "", 50);
		System.out.println("Probamos el método HACER CABALLITO con MOTOCICLETA");
		moto1.hacerCaballito();
		moto2.hacerCaballito();

		System.out.println();
		System.out.println();
		System.out.println("|||||||||||||||||||||||||||||||||| CAMIÓN ||||||||||||||||||||||||||||||||||||||||||||");
		Vehiculo_POO cam1 = new Camion_POO("", "", 180, 90, false, "", 50, 40, 60);
		System.out.println();
		Vehiculo_POO cam2 = new Camion_POO("", "", 180, 175, true, "", 50, 60, 70);
		System.out.println(cam1);
		System.out.println(cam2);
		System.out.println();
		System.out.println("Probamos el método CARGAR con MOTOCICLETA");
		Camion_POO camion1 = new Camion_POO(null, null, 0, 0, false, null, 0, 40, 60);
		Camion_POO camion2 = new Camion_POO(null, null, 0, 0, false, null, 0, 60, 70);
		camion1.cargar(30);
		camion2.cargar(4);

		System.out.println();
		System.out.println();
		System.out.println("|||||||||||||||||||||||||||||||||| BICICLETA ||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println();
		Bici_POO b1 = new Bici_POO(null, null, 50, 40, false, 0);
		Bici_POO b2 = new Bici_POO(null, null, 0, 70, false, 2);
		System.out.println(b1);
		System.out.println(b2);
		b1.cambioDeMarchas();
		b2.cambioDeMarchas();

	}

}
