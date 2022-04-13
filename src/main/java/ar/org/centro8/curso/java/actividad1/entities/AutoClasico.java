package ar.org.centro8.curso.java.actividad1.entities;

public class AutoClasico extends Auto {

	public AutoClasico(String marca, String modelo, String color) {
		super(marca, modelo, color);
	}

	public AutoClasico(String marca, String modelo, String color, String nombreRadio) {
		super(marca, modelo, color, nombreRadio);
	}

	public AutoClasico(String marca, String modelo, String color, double precio) {
		super(marca, modelo, color, precio);
	}

	public AutoClasico(String marca, String modelo, String color, String nombreRadio, double precio) {
		super(marca, modelo, color, nombreRadio, precio);
	}

}
