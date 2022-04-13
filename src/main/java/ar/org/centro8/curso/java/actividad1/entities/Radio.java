package ar.org.centro8.curso.java.actividad1.entities;

/**
 * A radio has a name
 */
public class Radio {
	private String nombre;

	public Radio(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * El metodo toString() devuelve la representacion del objeto en forma de string.
	 * <p>
	 * El cual es llamado por Auto.toString() para mostrar la informacion de la radio que se encuentra en el auto actualmente.
	 *
	 * @return El nombre de la radio.
	 */
	@Override
	public String toString() {
		return "Radio [nombre=" + nombre + "]";
	}
}
