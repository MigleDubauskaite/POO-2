package bucles_arrayBidimensional;

public class Array_2D {

	// campos
	private int filas;
	private int cols;
	int[][] array;

	// constructores
	public Array_2D(int filas, int cols) {
		this.filas = filas >= 0 && filas <= 10 ? filas : 2;
		this.cols = cols >= 0 && cols <= 10 ? cols : 2;
		array = new int[this.filas][this.cols];
	}

	public Array_2D(int dimension) {
		// dimension = filas;
		// dimension = cols;
		this(dimension, dimension);
	}

	// devuelve la dimensión de filas y columnas en un array
	/*public int[] getDimensiones() {
		return new int[] { filas, cols };
	}*/
	
	public int[][] getArray() {
		return array;
	}
	
	// 0
	public void mostrar() {
		for (int i = 0; i < array.length; i++) {
			System.out.print("|");
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("  " + array[i][j] + "");
			}
			System.out.println("|");
		}
		System.out.println("[" + filas + " x " + cols + "]\n");
	}


	// 1
	public void show(boolean hideZeros) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("|");
			for (int j = 0; j < array[i].length; j++) {
				if (hideZeros) {
					System.out.print(" ·");
				} else {
					System.out.print("  " + array[i][j] + "");
				}
			}
			System.out.println("|");
		}
		System.out.println("[" + filas + " x " + cols + "]\n");
	}
	
	// 2
	public void show2() {
		show(false);
	}
	
	// 3
	// skirtingi dalykai ir juos mostramos
	// rodo info kuri yra objeto viduje (filas, columnas)
	// array2d viduje turi lentele (linijos ir stulpeliai)
	// array de array2D yra viene lentele, ir ja reikia rodyti
	
	///////////////
	///
	// tenemos varias instancias de array2D dentro de un array
	public static void show3(Array_2D[] array, boolean hideZeros) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				array[i].show(hideZeros);
			}
			else {
				System.out.println("Es nulo\n");
			}
		}
	}
	
	// 4
	public static void show4(Array_2D[] array) {
		
		show3(array, false);
		
	}
	
	public boolean setFila(int fila, int value) {
		if(fila >=  0 && fila < filas && value >= 0) {
			for (int i = 0; i < cols; i++) {
				array[fila][i] = value;
			}
			show2();
			return true;
		} else {
			return false;
			
		}
	}
	
	public static boolean[] setFila (Array_2D[] array, int fila, int valor) {
		
		boolean[] filas = new boolean[array.length];
		return filas;
	}
	
	
	public boolean setCol (int col, int value) {
		if(col >=  0 && col < cols && value >= 0) {
			for (int i = 0; i < filas; i++) {
				array[i][col] = value;
			}
			show2();
			return true;
		} else {
			return false;
			
		}
	}
	

	public static void main(String[] args) {

		Array_2D a1 = new Array_2D(5, 4);
		Array_2D a2 = new Array_2D(3);
		System.out.println("A1");
		a1.mostrar();
		a1.show(false);
		a1.show(true);
		a1.show2();

		System.out.println("A2");
		a2.show(true);
		a2.show(false);
		a2.show2();
		
		System.out.println("SHOW 3: \nshow(Array_2D[] array, boolean hideZeros)");
		Array_2D a3 = new Array_2D(4, 2);
		Array_2D a4 = new Array_2D(3);
		Array_2D a5 = null;
		Array_2D a6 = new Array_2D(2, 3);
		Array_2D[] a = {a3, a4, a5, a6};
		show3(a, true);
		//show3(a, false);
		
		System.out.println("SHOW 4: \npublic static void show(Array2D [ ] array)");
		show4(a);

		System.out.println("public boolean setFila(int fila, int value)");
		System.out.println(a1.setFila(2, 1));
		System.out.println(a1.setFila(3, 5));
		
		System.out.println("public boolean setCol(int fila, int value)");
		//System.out.println(a1.setCol(1, 2));
		System.out.println(a1.setCol(3, 5));
		System.out.println(a1.setCol(2, 3));
		
		
		
	}

}
