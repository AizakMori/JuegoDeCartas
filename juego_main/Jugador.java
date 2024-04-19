package juego_main;
import java.util.ArrayList;

import cartas_mazo.*;
import tipoJugador.*;

public class Jugador {
	private String nombre;
	private Mazo mazo;
	private TipoJugador estrategia;
	private boolean ganador;		//UTILIZO ESTA VARIABLE PARA VERIFICAR QUIEN GANO LA RONDA Y SABER QUIEN TIENE EL TURNO
	
	public Jugador(String nom) {
		this(nom, new Timbero());
	}
	public Jugador(String nom, TipoJugador e) {
		nombre = nom;
		setEstrategia(e);
		mazo = new Mazo();
		setGanador(false);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEstrategia(TipoJugador e) {
		this.estrategia = e;
	}
	
	public String atributoSeleccionado() {
		 return this.estrategia.getAtributoSeleccionado(this.verPrimerCarta());
	}
	
	public ArrayList<String> getOpciones(){
		return mazo.getListOpciones();
	}
	
	public boolean isGanador() {
		return ganador;
	}
	
	public void setGanador(boolean ganador) {
		this.ganador = ganador;
	}
	
	public void addCarta(Carta c1) {
		mazo.addCarta(c1);
	}
	
	public Carta verPrimerCarta(){
		Carta aux = this.mazo.verCarta();
		return aux;
	}
	
	public Carta jugarCarta() {
		Carta carta = mazo.entregarCarta();
		return carta;
	}
	
	public int cantCartas() {
		return mazo.cantCartas();
	}

}
