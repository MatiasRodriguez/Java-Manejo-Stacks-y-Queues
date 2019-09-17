package ej2;

import java.util.LinkedList;
import java.util.Queue;


public class Equipo {

	private Queue<Jugador> jugadores;
	private String nombre;
	

	public Equipo(){
		nombre="sin nombre";
		jugadores=new LinkedList<Jugador>();
	}

	public Equipo(Queue<Jugador> jugadores, String nombre) {
		this.jugadores = new LinkedList<Jugador>();
		this.nombre = nombre;
	}

	public Queue<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(Queue<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void instanciarJugadores(int cant){
		int i=0;
		while(i<cant){
			Jugador j=new Jugador();
			jugadores.add(j);
		}
	}
	public void guardarJugador(Jugador j){
		jugadores.add(j);
	}
	
}
