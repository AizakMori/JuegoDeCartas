package tipoJugador;

import java.util.ArrayList;

import cartas_mazo.Carta;

public class Obstinado extends TipoJugador {
	private String select;
	public String getAtributoSeleccionado(Carta c) {
		ArrayList<String> opciones = c.getListOpciones();
		if(select == null) {
			int res = (int) (Math.random()*opciones.size());
			select = opciones.get(res);
		}
		return select;

	}
}
