package pocimas;

import java.util.ArrayList;

import atributos.Atributo;
import mazo_cartas.Carta;

public class PocimaDebilitadora extends Pocima {
	private int porcentaje;
	public PocimaDebilitadora(String nom) {
		this(nom, 20);
	}
	public PocimaDebilitadora(String nom, int num) {
		super(nom);
		this.porcentaje = num;
	}

	@Override
	public void aplicar(Carta c) {
		ArrayList<Atributo> opciones = c.getListAtributos();
		for(int i = 0; i < opciones.size(); i++) {
			Atributo aux = opciones.get(i);
			int res = (int)(aux.getValor() * porcentaje) / 100;
			aux.setValor((aux.getValor() - res));
		}
	}
	public void setPorcentaje(int num) {
		this.porcentaje = num;
	}
}
