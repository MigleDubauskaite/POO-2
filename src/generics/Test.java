package generics;

import generics.*;

public class Test {

	public static void main(String[] args) {

		Articulo a1 = new Articulo("Artículo 1");
		CajaArticulo ca1 = new CajaArticulo(a1);
		CajaArticulo ca2 = new CajaArticulo(new Articulo("Artículo 2"));
		CajaString cs1 = new CajaString("String 1");

		System.out.println(a1);
		System.out.println(ca1);
		System.out.println(ca2);
		System.out.println(cs1);

		System.out.println();
		// la clase CajaParaTodo funciona como generics
		CajaParaTodo c1 = new CajaParaTodo(new Articulo("Otro artículo"));
		CajaParaTodo c2 = new CajaParaTodo("Otro String");
		System.out.println(c1);
		System.out.println(c2);

		String s = ((String) c2.getContenido()).toLowerCase();
		// la CajaParaTodos devuelve un Objeto, por tanto, no tiene métodos de String

		// clase generica CAJA
		System.out.println();
		Caja<String> c10 = new Caja<String>("caja genérica 10");
		System.out.println(c10.getContenido().toUpperCase());
		Caja<Articulo> c11 = new Caja<Articulo>(new Articulo("artículo maravilloso"));
		System.out.println(c11.getContenido());

		// el operador diamond: Caja <String> c10 = new Caja<>("caja genérica 10");

		// clase generica PAREJA
		System.out.println();
		Pareja<String, String> p1 = new Pareja<>("Hola", "Adiós");
		System.out.println(p1);
		System.out.println(p1.getElemento1());
		Pareja<Object, Articulo> p2 = new Pareja<>(p1, a1);
		System.out.println(p2);

		// clase generica ESTANTE
		System.out.println();
		Estante<String> es0 = new Estante<>(new String[] {});
		Estante<String> es1 = new Estante<>(new String[] { "1", "10", "22" });
		System.out.println("El array vacío → \n" + es0);
		System.out.println(es1);
		
		// clase generica TRIO
		System.out.println();
		//Trio<String, String, String> t1 = new Trio<>("", "", "");
		
		
		

	}

}
