package ej2;

public class Jugador{

	private String nombre;
	private int edad;
	
	public Jugador(){
		this.nombre="sin nombre";
		this.edad=0;
	}
	public Jugador(String nombre, int edad) {

		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
