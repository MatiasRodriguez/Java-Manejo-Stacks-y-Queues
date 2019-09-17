package ej2;

public class Tarjeta extends Evento{
	private String tarjeta;

	
	public Tarjeta(String tarjeta,Jugador jugador, double minuto, Equipo equipo) {
		super(jugador,minuto,equipo);
		this.tarjeta = tarjeta;
	}

	public String getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}

	@Override
	public String toString() {
		return "Tarjeta "+" "+"tarjeta=" + tarjeta + super.toString();
	}
	
	
}
