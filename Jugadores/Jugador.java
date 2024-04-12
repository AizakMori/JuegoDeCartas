package Jugadores;
import java.util.ArrayList;

import herramientas.Mensajes;
import mazo_cartas.*;

public class Jugador {
	private String nombre;
	private Mazo mazo;
	private boolean ganador;
	
	public Jugador(String nom) {
		nombre = nom;
		mazo = new Mazo();
		setGanador(false);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String atributoSeleccionado() {
		ArrayList<String> atributos = getOpciones();
		int res = (int)(Math.random() * (atributos.size()));
		String selecc = atributos.get(res);
		return selecc;
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
	
	public void finalDelMazo(Carta c){
		mazo.ultimoLugar(c);
	}

}
