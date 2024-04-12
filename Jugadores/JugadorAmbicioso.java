package Jugadores;

import java.util.ArrayList;
import mazo_cartas.*;

public class JugadorAmbicioso extends Jugador {

	public JugadorAmbicioso(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}
	public String atributoSeleccionado(){
		ArrayList<String> opciones = super.getOpciones();
		String selecc = super.atributoSeleccionado();
		Carta actual = super.verPrimerCarta();
		int aux = actual.getAtributoSeleccionado(selecc);
		
		for(int i = 0; i < opciones.size(); i++) {
			int valor = actual.getAtributoSeleccionado(opciones.get(i));
			if(valor > aux) {
				selecc = opciones.get(i);
				aux = valor;
			}
		}
		return selecc;
	}
}
