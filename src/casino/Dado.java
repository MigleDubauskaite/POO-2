package casino;

import java.util.Random;

public class Dado {
	
	//1. Propiedades
	public int lanzamiento;
	private int [] historico;
	private int caras;
	
	//2. Constructores
	
	
	public Dado (int caras, int elementosHistorico) {
		this.caras = caras;
		 historico = new int [elementosHistorico];
	}
	
	
	
	//3. Métodos 
	
	public int lanzar () {
		Random random = new Random();
		
		lanzamiento = random.nextInt(1, 7); //Para que salga el número 6 se pone hasta el 7
		
		for (int i = 1; i < historico.length; i++) {
			historico[i - 1] = historico [i];
			
			//Se recorre el array y la idea es que los índices se vayan desplazando hacia arriba 
			//para que el último lanzamiento entre en la última posición del array
		}
		
		
		historico [historico.length - 1] = lanzamiento;
		
		
		return lanzamiento;
	}
	
	public int contarNumeroDeCaras (int lanzamientos, int numeroCara) {
		
		int contador = 0;
		boolean caraValida = numeroCara >= 1 && numeroCara <= caras;
		
		
		if(caraValida) {
			for (int i = 0; i < lanzamientos; i++) {
				if (lanzar() == numeroCara){
				contador++;
				}
			} 
		}			
		return contador;
	}
	
	public void mostrarHistorico () {
		for (int tirada : historico) {
			if (tirada != 0) {
				System.out.printf(" %d", tirada);
			}
			
		}
	}
	
	//4. MAIN
	public static void main(String[] args) {
		Dado d1 = new Dado(10, 50);
		
		for (int i = 0; i < 50; i++) {
			d1.lanzar();
		}
		
		d1.mostrarHistorico();
	}
	
	
	
	
}
