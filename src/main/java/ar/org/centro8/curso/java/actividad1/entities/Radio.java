package ar.org.centro8.curso.java.actividad1.entities;

public class Radio {
	private String nombre;

	public Radio(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Radio [nombre=" + nombre + "]";
	}
}
