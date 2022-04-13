package ar.org.centro8.curso.java.actividad1.test;

import ar.org.centro8.curso.java.actividad1.entities.AutoClasico;
import ar.org.centro8.curso.java.actividad1.entities.AutoNuevo;

public class Main {

	public static void main(String[] args) {

		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("Actividad 1");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");

		System.out.println("1 - Auto clasico sin radio, sin precio");
		AutoClasico benz = new AutoClasico("Benz", "Patent-Motorwagen", "Marron");
		System.out.println(benz);

		System.out.println("-----------------------------------------------------------------------------------------------------------------------");

		System.out.println("2 - Auto clasico sin radio, con precio");
		AutoClasico bugatti = new AutoClasico("Bugatti", "Type 57 SC Atlantic", "Negro", 99000000);
		System.out.println(bugatti);

		System.out.println("-----------------------------------------------------------------------------------------------------------------------");

		System.out.println("3 - Auto clasico con radio, sin precio");
		AutoClasico callidac1 = new AutoClasico("Callidac", "Deville", "Crema", "Watts");
		System.out.println(callidac1);

		System.out.println("-----------------------------------------------------------------------------------------------------------------------");

		System.out.println("4 - Auto clasico con radio instalada, con precio");
		AutoClasico callidac2 = new AutoClasico("Callidac", "Fleetwood", "Rojo", "Watts", 1000000);
		System.out.println(callidac2);

		System.out.println("-----------------------------------------------------------------------------------------------------------------------");

		System.out.println("5 - Auto clasico sin radio a instalar, con precio");
		AutoClasico ford = new AutoClasico("Ford", "Mustang", "Negro", 150000);
		System.out.println(ford);

		System.out.println("5.2 - Agregar radio a auto clasico");
		ford.setRadio("Sony");
		System.out.println(ford);

		System.out.println("-----------------------------------------------------------------------------------------------------------------------");

		System.out.println("6 - Auto nuevo, con precio");
		AutoNuevo volkswagen = new AutoNuevo("volkswagen", "UP", "Azul", "Phillips", 25000);
		System.out.println(volkswagen);

		System.out.println("6.2 - Auto nuevo cambia radio");
		volkswagen.setRadio("Pionner");
		System.out.println(volkswagen);

		System.out.println("-----------------------------------------------------------------------------------------------------------------------");

		System.out.println("6 - Auto nuevo, sin precio");
		AutoNuevo toyota = new AutoNuevo("Toyota", "Yaris GR", "Blanco", "Blaukpunkt");
		System.out.println(toyota);

	}

}
