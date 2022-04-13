package ar.org.centro8.curso.java.actividad1.entities;

public abstract class Auto {
	private String marca;
	private String modelo;
	private String color;
	private String nombreRadio;
	private double precio;
	private Radio radio;

	public Auto(String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	public Auto(String marca, String modelo, String color, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
	}

	public Auto(String marca, String modelo, String color, String nombreRadio) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.nombreRadio = nombreRadio;
		this.radio = new Radio(nombreRadio);
	}

	public Auto(String marca, String modelo, String color, String nombreRadio, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.nombreRadio = nombreRadio;
		this.radio = new Radio(nombreRadio);
		this.precio = precio;
	}

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

	public void setRadio(String nombreRadio) {
		this.radio = new Radio(nombreRadio);
	}
}
