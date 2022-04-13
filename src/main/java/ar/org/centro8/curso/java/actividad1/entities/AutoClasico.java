package ar.org.centro8.curso.java.actividad1.entities;

/**
 * La clase AutoClasico es una subclase de la clase Auto
 */
public class AutoClasico extends Auto {

	// Auto sin precio ni radio
	public AutoClasico(String marca, String modelo, String color) {
		super(marca, modelo, color);
	}

	// Auto sin precio con radio
	public AutoClasico(String marca, String modelo, String color, String nombreRadio) {
		super(marca, modelo, color, nombreRadio);
	}

	// Auto con precio sin radio
	public AutoClasico(String marca, String modelo, String color, double precio) {
		super(marca, modelo, color, precio);
	}

	// Auto con precio y con radio
	public AutoClasico(String marca, String modelo, String color, String nombreRadio, double precio) {
		super(marca, modelo, color, nombreRadio, precio);
	}

}
