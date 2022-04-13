package ar.org.centro8.curso.java.actividad1.entities;

/**
 * La clase AutoNuevo es una subclase de la clase Auto
 */
public class AutoNuevo extends Auto {

	// Auto sin precio con radio
	public AutoNuevo(String marca, String modelo, String color, String nombreRadio) {
		super(marca, modelo, color, nombreRadio);
	}

	// Auto con precio y con radio
	public AutoNuevo(String marca, String modelo, String color, String nombreRadio, double precio) {
		super(marca, modelo, color, nombreRadio, precio);
	}
}
