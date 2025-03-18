package bucles_arrayBidimensional;

public class Array2D {

	private int filas;
	private int cols;
	private int[][] array;

	public Array2D(int filas, int cols) {
		this.filas = filas >= 0 && filas <= 10 ? filas : 1;
		this.cols = cols >= 0 && cols <= 10 ? cols : 1;
		array = new int[this.filas][this.cols];
	}

	public Array2D(int dimension) {
		this(dimension, dimension);
		// filas = dimension;
		// cols = dimension;
	}

	// devuelve un array bidimensional con filas y columnas
	public int[] getDimensiones() {
		return new int[] { filas, cols };
	}

	public void show(boolean hideZeros) {

	}

	public static void main(String[] args) {

	}

}
