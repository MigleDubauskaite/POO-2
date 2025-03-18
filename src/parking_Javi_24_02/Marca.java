package parking_Javi_24_02;

import java.util.Random;

public enum Marca {
	
	VW, SE, AU;
	
	// si lo creamos aqui una instancia de Random no hace falta ponerlo en el metodo aleatorio() porque siempre se va a utilizar la misma instancia de random *******
	private static Random random = new Random();
	
	// static porque se lo pedimos a Marca
	public static Marca aleatorio() {
		
		// 1 MANERA
		//Random random = new Random();
		//int indiceAleatorioDeMarxas = random.nextInt(Marca.values().length);
		//return Marca.values()[indiceAleatorioDeMarxas];
		
		// 2 MANERA
		//Random random = new Random();		
		//return Marca.values()[random.nextInt(Marca.values().length)];
		
		// 3 MANERA ******
		return Marca.values()[random.nextInt(Marca.values().length)];
		
	}

}
