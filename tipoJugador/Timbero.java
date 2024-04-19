package tipoJugador;

import java.util.ArrayList;

import cartas_mazo.Carta;

public class Timbero extends TipoJugador {

	@Override
	public String getAtributoSeleccionado(Carta c) {
		ArrayList<String> atributos = c.getListOpciones();
		int res = (int)(Math.random() * (atributos.size()));
		String selecc = atributos.get(res);
		return selecc;
	}

}
