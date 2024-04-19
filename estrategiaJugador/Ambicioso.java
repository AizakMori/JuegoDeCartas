package estrategiaJugador;

import java.util.ArrayList;

import mazo_cartas.Carta;

public class Ambicioso extends Estrategia {
	public String getAtributoSeleccionado(Carta c){
		ArrayList<String> opciones = c.getListOpciones();
		String selecc = opciones.get(0);
		int aux = c.getValorAtributoSeleccionado(selecc);
		
		for(int i = 0; i < opciones.size(); i++) {
			int valor = c.getValorAtributoSeleccionado(opciones.get(i));
			if(valor > aux) {
				selecc = opciones.get(i);
				aux = valor;
			}
		}
		return selecc;
	}
}
