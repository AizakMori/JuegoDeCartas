package pocimas;

import java.util.ArrayList;
import atributos.*;
import mazo_cartas.*;

public class PocimaFortalecedora extends Pocima {
	private int porcentaje;
	public PocimaFortalecedora(String nom) {
		this(nom, 20);
	}
	public PocimaFortalecedora(String nom, int num) {
		super(nom);
		this.porcentaje = num;
	}

	@Override
	public void aplicar(Carta c) {
		ArrayList<Atributo> opciones = c.getListAtributos();
		for(int i = 0; i < opciones.size(); i++) {
			Atributo aux = opciones.get(i);
			int res = (int)(aux.getValor() * porcentaje) / 100;
			aux.setValor((aux.getValor() + res));
		}
	}

}
