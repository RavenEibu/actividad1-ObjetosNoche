package ar.org.centro8.curso.java.actividad1.entities;

/**
 * 	La clase Auto tiene 4 constructores:
 * 	<p><ul>
 * 	<li>	1 - Auto sin precio ni radio el cual solo se puede dar en AutoClasico con los valores (String marca, String modelo, String color) el cual es el minimo requisito de un auto.
 * 	<li>	2 - Auto con precio sin radio el cual solo se puede dar en AutoClasico con los valores (String marca, String modelo, String color, double precio)
 * 	<li>	2 - Auto sin precio con radio con los valores (String marca, String modelo, String color, String nombreRadio)
 * 	<li>	4 - Auto con precio con radio con los valores (String marca, String modelo, String color, String nombreRadio, double precio)
 * 	</ul><p>
 */
public abstract class Auto {
	private String marca;
	private String modelo;
	private String color;
	private String nombreRadio;
	private double precio;
	private Radio radio;

	// Auto sin precio ni radio el cual solo se puede dar en AutoClasico
	public Auto(String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	// Auto con precio sin radio el cual solo se puede dar en AutoClasico con los valores
	public Auto(String marca, String modelo, String color, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
	}

	// Auto sin precio con radio con los valores
	public Auto(String marca, String modelo, String color, String nombreRadio) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.nombreRadio = nombreRadio;
		this.radio = new Radio(nombreRadio);
	}

	// Auto con precio con radio con los valores
	public Auto(String marca, String modelo, String color, String nombreRadio, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.nombreRadio = nombreRadio;
		this.radio = new Radio(nombreRadio);
		this.precio = precio;
	}

	/**
	 * El metodo toString() devuelve una representacion del auto en forma de string.
	 * <p>
	 * El cual es llamado desde Main.java al imprimir el objeto.
	 * <p>
	 * Ej. System.out.println(objetoAuto);
	 * <p>
	 * La informacion de radio esta en Radio.toString()
	 *
	 * @return El metodo toString esta siendo devuelto
	 */
	@Override
	public String toString() {
		return "Auto [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", nombreRadio=" + nombreRadio
				+ ", precio=" + precio + ", radio=" + radio + "]";
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getColor() {
		return color;
	}

	public Radio getRadio() {
		return radio;
	}

	/**
	 * Esta funcion define la radio del auto a una nueva radio con el nombre de la radio pasado como parametro
	 *
	 * @param nombreRadio Nombre de la radio
	 */
	public void setRadio(String nombreRadio) {
		this.radio = new Radio(nombreRadio);
	}
}
