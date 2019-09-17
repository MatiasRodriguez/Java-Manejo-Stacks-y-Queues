package ej2;

public class Test {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Partido p=new Partido();
		Equipo local=new Equipo();
		local.setNombre("local");
		local.instanciarJugadores(10);
		Jugador j =new Jugador();
		local.guardarJugador(j);
		
		Equipo Visitante=new Equipo();
		Visitante.setNombre("visitante");
		Visitante.instanciarJugadores(10);
		Jugador j1 =new Jugador();
		Visitante.guardarJugador(j1);
	}

}
