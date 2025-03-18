package publicaciones;

public abstract class Publicacion implements CanRead {

	private String titulo;
	protected int numPags;
	private int pagInicial;
	private boolean formatoDigital;
	private double precio;

	/*
	 * se irá incrementando de uno en uno por cada nueva instancia, utilizando para
	 * almacenar el próximo libroID disponible la propiedad estática nextID definida
	 * más abajo.
	 */
	private long id;

	/*
	 * Todos los libros se crean con la página actual en la inicial. Luego a medida
	 * que se leen páginas se avanza en la pagActual, hasta llegar al final del
	 * libro, momento en el que el libro estará marcado como leído.
	 */
	private int pagActual;

	private boolean leido;

	private static long nextId = 0;

	public abstract String getMensajeCabacera();

	public String getTitulo() {
		return titulo;
	}

	public long getId() {
		return id;
	}

	public double getPrecio() {
		return precio;
	}

	public Publicacion(String titulo, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		this.titulo = titulo;
		this.numPags = numPags < 1 ? 1 : numPags;
		this.pagInicial = pagInicial < 1 ? 1 : pagInicial;
		this.pagInicial = pagInicial;
		this.formatoDigital = formatoDigital;
		this.precio = precio < 1 ? 1 : precio;
		id = nextId++;
		pagActual = pagInicial;
		pagActual = pagActual >= numPags ? numPags : pagActual;
	}

	public abstract String getTipo();

	@Override
	public String toString() {
		return String.format("Publicación \"%s\" con %d páginas y precio %.2f €.", titulo, numPags, precio);
	}

	public void show() {
		System.out.printf(
				"%n%sTítulo: %s %nId: %d %nPáginas: %d %nPágina inicial: %d %nPágina actual: %d %nPrecio: %.2f € %nFormato digital: %s %nLéido: %s %n",
				getMensajeCabacera(), titulo, id, numPags, pagInicial, pagActual, precio, formatoDigital ? "Sí" : "No",
				leido ? "Sí" : "No");
	}

	public static void showStatic(Publicacion p) {
		p.show();
	}

	// cuando pasa la pagina no se imprime -> si es true
	public void leePagina(boolean silenciosamente) {

		if (pagActual < numPags) {
			pagActual++;

			if (numPags == pagActual) {
				leido = true;
				System.out.printf("Última página (%d) %s %s %s", pagActual, leido ? "leída" : false, getTipo(),
						titulo);
			} else {
				System.out.printf("Página %d leída %s %s", pagActual, getTipo(), titulo);
			}
		} 
		else {
			leido = true;
			System.out.printf("%s %s %s ya ha sido leído", getClass().getSimpleName(),  this instanceof Libro  ? "titulado" : "titulada", titulo);
		}
	}

	public static void leePaginaStatic(boolean silenciosamente, Publicacion p) {
		p.leePagina(silenciosamente);
	}

}
