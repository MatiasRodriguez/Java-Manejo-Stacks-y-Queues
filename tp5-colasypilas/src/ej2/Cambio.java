package ej2;

public class Cambio extends Evento {
	private Jugador JugadorCambio;

	
 

	public Cambio(Jugador jugadorCambio,Jugador jugador, double minuto, Equipo equipo) {
		super(jugador,minuto,equipo);
		if(verificarJugador(equipo,jugadorCambio)==true){
		JugadorCambio = jugadorCambio;
		}
	}

	public boolean verificarJugador(Equipo equipo, Jugador jugador){
	 boolean enc=false;
	 Jugador j=null;
	 equipo.getJugadores().add(null); 
	while(equipo.getJugadores().peek()!=null || enc==false){
		 j=equipo.getJugadores().poll();
		 if(j.equals(jugador)){
			 enc=true;
			 equipo.getJugadores().add(j);
		 }else{
			 equipo.getJugadores().add(j);
		 }
	}	
	if(equipo.getJugadores().peek()==null ){
		equipo.getJugadores().poll();
	}
	if(enc==false){
		System.out.println("el jugador no pertence al equipo");
	}
	 return enc;
	}
	public void ingresarJugadorCambio(Jugador jugador){
		setJugadorCambio(jugador);
	}
	public Jugador getJugadorCambio() {
		return JugadorCambio;
	}

	public void setJugadorCambio(Jugador jugadorCambio) {
		JugadorCambio = jugadorCambio;
	}
	
}
