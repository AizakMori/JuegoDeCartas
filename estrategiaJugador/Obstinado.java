package estrategiaJugador;

import java.util.ArrayList;

import mazo_cartas.Carta;

public class Obstinado extends Estrategia {
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
