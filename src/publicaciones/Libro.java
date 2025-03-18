package publicaciones;

public class Libro extends Publicacion {

	private String autor;
	private static String mensajeCabecera = "\nDATOS LIBRO \n=================\n";

	public Libro(String titulo, String autor, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		super(titulo, numPags, pagInicial, formatoDigital, precio);
		this.autor = autor;
	}

	@Override
	public String getTipo() {
		return "del libro titulado";

	}

	public void show() {
		super.show();
		System.out.printf("Autor: %s%n", autor);
	}

	@Override
	public String getMensajeCabacera() {
		return mensajeCabecera;
	}

	@Override
	public void leePagina(boolean silenciosamente) {

		super.leePagina(silenciosamente);
		System.out.printf(" del autor %s.%n", autor);

	}

}