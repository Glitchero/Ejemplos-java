package taller.java;

public class Carro {

	/** Función principal */
	
	int ruedas;
	private double velocidad=0;
	String nombre;
	
	/** Aumenta la velocidad*/
	public void acelerar(double cantidad) {
	velocidad += cantidad;
	}
	
	/** Disminuye la velocidad*/
	public void frenar(double cantidad) {
	velocidad -= cantidad;
	}
	
	/** Devuelve la velocidad*/
	public double obtenerVelocidad(){
	return velocidad;
	}
}
