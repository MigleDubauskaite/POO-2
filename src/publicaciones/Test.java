package publicaciones;

public class Test {

	public static final String RESET = "\u001B[0m";
	public static final String ROJO = "\u001B[31m";
	public static final String VERDE = "\u001B[32m";
	public static final String AMARILLO = "\u001B[33m";
	public static final String AZUL = "\u001B[34m";
	public static final String PURPURA = "\u001B[35m";
	public static final String CYAN = "\u001B[36m";

	public static void main(String[] args) {

		Libro l1 = new Libro("Cien años de la soledad", "Gabriel García Máqrquez", 735, 56, false, 20.99);
		Revista r1 = new Revista("Muy interesante", 120, true, 4);
		System.out.println(l1);
		System.out.println(r1);
		l1.show();
		r1.show();

		System.out.println("\n\nPROBAMOS MÉTODO SHOWSTATIC()");
		Publicacion p1 = new Libro("El Principito", "", 300, 45, false, 30);
		Publicacion p2 = new Revista("Muy interesante", 120, true, 4);

		Publicacion.showStatic(p2);
		Publicacion.showStatic(l1);

		System.out.println("\nPROBAMOS EL MÉTODO LEEPAGINA()\n");
		Libro l2 = new Libro("The Midnight Library", "Haig Matt", 200, 1, false, 20.99);
		Libro l3 = new Libro("The Midnight Library", "Haig Matt", 200, 199, false, 20.99);
		Libro l4 = new Libro("The Midnight Library", "Haig Matt", 200, 200, false, 20.99);
		Libro l5 = new Libro("The Midnight Library", "Haig Matt", 200, 202, false, 20.99);
		Revista r2 = new Revista("Muy interesante", 120, true, 4);

		System.err.println("1. Si no ha llegado al final, incrementa en 1 la página:");
		l2.leePagina(false);
		l2.leePagina(false);
		Publicacion.leePaginaStatic(false, l2);

		System.err.println("\n2. Si no ha llegado al final e incrementando en 1 la página llega al final del libro");
		Publicacion.leePaginaStatic(false, l3);
		// mirar lo de revista, porque tenemos establecido que pagActual = pagInicial o
		// sea 1

		System.err.println("\n3. Si ha llegado al final antes de incrementar, NO incrementa en 1 ");
		l4.leePagina(false);
		l5.leePagina(false);

		l2.show();
		l3.show();
		l4.show();
		l5.show();

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///
		///
		System.err.println("\n\nOPERACIONES A RALIZAR EN LA CLASE TEST \n======================================");

		System.out.println(VERDE
				+ "\nA. Instanciar los siguientes 10 libros, en este orden, y llamarlos lib0, lib1, ib2, ..., lib9, según la signatura:");
		Libro lib1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 735, 3, false, 20.99);
		Libro lib2 = new Libro("El señor de los anillos", " J. R. R. Tolkien", 429, 5, false, 22.99);
		Libro lib3 = new Libro("1984", " George Orwel", 122, 9, false, 40.99);
		Libro lib4 = new Libro("Un mundo feliz", "Aldous Huxley", 270, 1, false, 25.99);
		Libro lib5 = new Libro("Orgullo y prejuicio", "Jane Austen", 340, 2, true, 12.99);
		Libro lib6 = new Libro("Crimen y castigo", " Fiódor Dostoyevski", 259, 3, false, 60.99);
		Libro lib7 = new Libro("Lolita", "Vladimir Nabokov", 300, 5, false, 27.99);
		Libro lib8 = new Libro("Ulises", "James Joyce", 400, 4, false, 42.99);
		Libro lib9 = new Libro("Madame Bovary", "Gustave Flaubert", 723, 9, true, 9.99);
		Libro lib10 = new Libro("En busca del tiempo perdido", "Marcel Proust", 374, 2, true, 9.99);

		System.out.println("\nB. Realiza algo parecido con 5 revistas que tu decidas:");
		Revista rev1 = new Revista("Ciencia y Tecnología", 120, true, 21);
		Revista rev2 = new Revista("National Geographic", 100, false, 20);
		Revista rev3 = new Revista("Science Today", 80, true, 3.5);
		Revista rev4 = new Revista("Tech World", 95, false, 42);
		Revista rev5 = new Revista("Historia y Vida", 110, true, 3);

		System.out.println("\nC. Mételos todos en un array llamado publicaciones:");
		Publicacion publicaciones[] = { lib1, lib2, lib3, lib4, lib5, lib6, lib7, lib8, lib9, lib10, rev1, rev2, rev3,
				rev4, rev5 };

		System.out.println("\nD. Obtener una serie de listados de publicaciones según se expresa a continuación:");

		System.out.println(CYAN + "\n a. Todas las publicaciones del array publicaciones con título y ID.");
		for (Publicacion publicacion : publicaciones) {
			System.out.println(RESET + "Título: " + publicacion.getTitulo() + " → ID: " + publicacion.getId());
		}

		System.out.println(CYAN
				+ "\n b. Solo libros del array publicaciones con ID y  título (usar instanceof para discriminar).");
		for (Publicacion publicacion : publicaciones) {
			if (publicacion instanceof Libro) {
				System.out.println(RESET + "Título: " + publicacion.getTitulo() + " → ID: " + publicacion.getId());
			}
		}

		System.out.println(CYAN
				+ "\n c. Solo revistas del array publicaciones con ID y  título (usar instanceof para discriminar).");
		for (Publicacion publicacion : publicaciones) {
			if (publicacion instanceof Revista) {
				System.out.println(RESET + "Título: " + publicacion.getTitulo() + " → ID: " + publicacion.getId());
			}
		}

		System.out.println(CYAN
				+ "\n d. Todas las publicaciones del array publicaciones con ID, título y precio pero filtrando aquellas que tienen un precio mayor de 20 euros. ");
		for (Publicacion publicacion : publicaciones) {
			if (publicacion.getPrecio() > 20) {
				System.out.println(RESET + "Título: " + publicacion.getTitulo() + " → ID: " + publicacion.getId()
						+ " → Precio: " + publicacion.getPrecio());
			}
		}

		System.out.println(CYAN
				+ "\n e. Solo libros del array publicaciones con ID y  título y precio pero filtrando aquellas que tienen un precio mayor de 20 euros.  (usar instanceof para discriminar).");
		for (Publicacion publicacion : publicaciones) {
			if (publicacion instanceof Libro) {
				if (publicacion.getPrecio() > 20) {
					System.out.println(RESET + "Título: " + publicacion.getTitulo() + " → ID: " + publicacion.getId()
							+ " → Precio: " + publicacion.getPrecio());
				}
			}
		}

		System.out.println(CYAN
				+ "\n f. Solo revistas del array publicaciones con ID y  título y precio pero filtrando aquellas que tienen un precio mayor de 3 euros  (usar instanceof para discriminar).");
		for (Publicacion publicacion : publicaciones) {
			if (publicacion instanceof Revista) {
				if (publicacion.getPrecio() > 3) {
					System.out.println(RESET + "Título: " + publicacion.getTitulo() + " → ID: " + publicacion.getId()
							+ " → Precio: " + publicacion.getPrecio());
				}
			}
		}

		System.out.println(VERDE + "\nE. Verificación de lectura y métodos de presentación correctos:");
		System.out.println(CYAN + "\n a. Utiliza el libro Ulises, pero dentro del array. No utilices lib7.");
		Publicacion publicaciones2[] = { lib1, lib2, lib3, lib4, lib5, lib6, lib7, 
				new Libro("Ulises", "James Joyce", 400, 4, false, 42.99), lib9, lib10, rev1, rev2, rev3, rev4,
				rev5 };

		System.out.println(CYAN + "\n b. Muestra su estado con show.");
		for (Publicacion publicacion : publicaciones2) {
			// System.out.println(RESET);
			// publicacion.show();
		}

		System.out.println(CYAN
				+ "\n c. Lee 295 páginas de forma silenciosa con el método estático y verifica que estás en la página 299.");
		System.out.println(RESET);
		for (int i = 0; i < 295; i++) {
			Publicacion.leePaginaStatic(true, lib8);
		}

		System.out.println(CYAN
				+ "\n d. Lee 5 páginas de forma NO silenciosa con el método estático y verifica que estás en la página 304.");
		System.out.println(RESET);
		for (int i = 0; i < 5; i++) {
			Publicacion.leePaginaStatic(false, lib8);
		}

		System.out.println(CYAN
				+ "\n e. Lee 10 páginas de forma NO silenciosa con el método NO estático y verifica que estás en la página 314.");
		System.out.println(RESET);
		for (int i = 0; i < 10; i++) {
			lib8.leePagina(false);
		}

		System.out.println(CYAN
				+ "\n f. Lee 1000 páginas con el método NO estático y verifica que figura como leído y está en la página 400.");
		System.out.println(RESET);
		for (int i = 0; i < 1_00; i++) {
			lib8.leePagina(false);
		}

	}

}
