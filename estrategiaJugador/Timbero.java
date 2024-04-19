package estrategiaJugador;

import java.util.ArrayList;

import mazo_cartas.Carta;

public class Timbero extends Estrategia {

	@Override
	public String getAtributoSeleccionado(Carta c) {
		ArrayList<String> atributos = c.getListOpciones();
		int res = (int)(Math.random() * (atributos.size()));
		String selecc = atributos.get(res);
		return selecc;
	}

}
