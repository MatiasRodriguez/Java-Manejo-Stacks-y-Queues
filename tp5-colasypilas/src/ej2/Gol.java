package ej2;

public class Gol  extends Evento{
  private boolean penal;
  
  
  


public Gol(boolean penal,Jugador jugador, double minuto, Equipo equipo) {
	super(jugador,minuto,equipo);
	this.penal = penal;
	
}

public Gol() {
	this.penal = false;
}

public boolean getPenal() {
	return penal;
}

public void setPenal(boolean penal) {
	this.penal = penal;
}

@Override
public String toString() {
	return "Gol"+" "+ "penal=" + penal + super.toString()
	;
}



}
