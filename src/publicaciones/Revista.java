package publicaciones;

public class Revista extends Publicacion {

	private static String mensajeCabecera = "\nDATOS REVISTA \n=================\n";

	public Revista(String titulo, int numPags, boolean formatoDigital, double precio) {
		super(titulo, numPags, 1, formatoDigital, precio);
	}

	@Override
	public String getTipo() {
		return "de la revista titulada";
	}

	public void show() {
		super.show();
	}

	@Override
	public String getMensajeCabacera() {
		return mensajeCabecera;
	}

	@Override
	public void leePagina(boolean silenciosamente) {

		super.leePagina(silenciosamente);
		System.out.println(".");

	}

}
