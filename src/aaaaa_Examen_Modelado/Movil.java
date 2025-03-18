package aaaaa_Examen_Modelado;

public class Movil {
	
	private boolean encendido;
	private int nivelBateria;
	private String modelo;
	private String marca;
	private boolean modoBajoConsumo;
	
	// CREAR NUEVOS MÖVILES
	public Movil(String marca, String modelo) {
		this.modelo = modelo;
		this.marca = marca;
		encendido = false; // no es necesario
		nivelBateria = 20;
	}
	
	public void encender() {
		encendido = encendido ? encendido : true;
	}
	
	public void apagar() {
		encendido = encendido ? false : encendido;
	}
	
	
	// metodo navegar y llamar puede llamarse de forma recursiva -> llamar().navegar().
	
	private Movil consumir(int consumo) {
		if (!encendido) return this;
		nivelBateria = nivelBateria <= consumo ? 0 : nivelBateria - consumo;   // -2 == 100*0.02 || -1 == 100 * 0.01
		modoBajoConsumo = nivelBateria < 10; // no hay que poner:   ? true : false
		if (nivelBateria <= 2) encendido = false;
		return this;
	}
	
	public Movil llamar() {
		return consumir(2);
	}
	
	public Movil navegar() {
		return consumir(1);
	}
	
	public boolean mostrarBajoCOnsumo() {
		System.out.printf("Modo bajo consumo: %s %n", modoBajoConsumo ? "activado" : "desactivado");
		return modoBajoConsumo;
	}
	
	public void recargarBateria() {
		nivelBateria = nivelBateria + 25 > 100 ? 100 : nivelBateria + 25;
	}
	
	@Override
	public String toString() {
		return "Movil [on = " + encendido + ", bateria = " + nivelBateria + ", modelo = " + modelo + ", marca = "
				+ marca + ", modo bajo consumo = " + modoBajoConsumo + "].";
	}

	public static void main(String[] args) {
		System.out.println("CREAR, APAGAR Y ENCENDER");
		System.out.println("==================================");
		Movil m1 = new Movil("Samsung", "Galaxy");
		Movil m2 = new Movil("Apple", "Iphone 16");

		m1.llamar().llamar().llamar().navegar();
		
		System.out.println();
		System.out.println(m1);
		System.out.println();
		m1.encender(); System.out.println("Móvil encendido:");
		System.out.println(m1);
		m1.apagar(); System.out.println("Móvil apagado:");
		System.out.println(m1);
		
		System.out.println();
		System.out.println("==================================");
		System.out.println(m2);
		System.out.println();
		m2.encender(); System.out.println("Móvil encendido:");
		System.out.println(m2);
		m2.apagar(); System.out.println("Móvil apagado:");
		System.out.println(m2);
		
		m1.encender();
		System.out.println();
		System.out.println("NAVEGAR, LLAMAR, MODO BAJO CONSUMO");
		System.out.println("==================================");
		System.out.println("Antes de llamar\n" + m1 + "\n");
		m1.llamar();
		System.out.println("Después de llamar \n" + m1 + "\n");

		m1.navegar();
		System.out.println("Después de navegar \n" + m1 + "\n");
		
		System.out.println();
		for (int i = 0; i < 5; i++) {
			m1.llamar();
			System.out.println("Después de llamar \n" + m1 + "\n");
		}
		
		m1.mostrarBajoCOnsumo();
		
		System.out.println();
		System.out.println("CARGAR");
		System.out.println("==================================");
		System.out.println("Antes de cargar\n" + m1 + "\n");
		for (int i = 0; i < 5; i++) {
			m1.recargarBateria();
			System.out.println("Después de cargar \n" + m1 + "\n");
		}
		
		
	}
	
	
	
	

}
