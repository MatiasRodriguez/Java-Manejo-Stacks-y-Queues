package ej2;

public class Evento {
    private Jugador jugador;
    private double  minuto;
	private Equipo equipo;
    
    
    public Evento(){
    	jugador=null;
    	minuto=0;
    	equipo=null;
    }
    
   public Evento(Jugador jugador, double minuto, Equipo equipo) {
	
		this.jugador = jugador;
		this.minuto = minuto;
		this.equipo=equipo;
	}
	public Jugador getJugador() {
		return jugador;
	}
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	public double getMinuto() {
		return minuto;
	}
	public void setMinuto(double minuto) {
		this.minuto = minuto;
	}




	public Equipo getEquipo() {
		return equipo;
	}




	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "jugador=" + jugador + ", minuto=" + minuto + ", equipo=" + equipo ;
	}
	
	
}
