package ej2;

import java.util.LinkedList;
import java.util.Queue;

public class Partido {
	private Equipo eLocal;
	private Equipo eVisitante;
	private Queue<Evento> eventos;
	private int equipoLocalG;
	private int equipoVisitG;
	
	public Partido(){
		this.eLocal = null;
		this.eVisitante = null;
		eventos = new LinkedList<Evento>();
	}
	
	
	public Partido(Equipo eLocal, Equipo eVisitante, Queue<Evento> eventos) {
		this.eLocal = eLocal;
		this.eVisitante = eVisitante;
		eventos = new LinkedList<Evento>();
	}
	public void AñadirEventos(Evento e){
		eventos.add(e);
	}
	
	public void mostrarEventos(){
		Evento e=new Evento();
		e.setMinuto(-1);
		Evento e1=null;
		eventos.add(e);
		while(eventos.peek().getMinuto()!=e.getMinuto()){
			e1=eventos.poll();
			System.out.println(e1.toString());
			eventos.add(e1);
		}
		eventos.poll();
	}
	public void obtenerResultado(){
		Evento e=new Evento();
		e.setMinuto(-1);
		Evento e2=null;
		while(eventos.peek()!=e){
		e2=eventos.poll();
		if(e2 instanceof Gol ){
	    if((e2.getEquipo()).equals(eLocal)){
	    	equipoLocalG+=1;
	    }else{
	    	equipoVisitG+=1;
	    }
		}
		System.out.println("Partido finalizado");
		System.out.println(eLocal + " "+ equipoLocalG + ":"+ equipoVisitG + eVisitante  );
		}
	}
	
}
