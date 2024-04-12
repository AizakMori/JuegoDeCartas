package pocimas;

import mazo_cartas.*;
import atributos.*;

public class PocimaSelectiva extends Pocima {
	private int porcentaje;
	private String atributoSelec;
	public PocimaSelectiva(String nom, String atrib, int i) {
		super(nom);
		this.atributoSelec = atrib;
		this.porcentaje = i;
	}

	@Override
	public void aplicar(Carta c) {
		Atributo aux = c.getAtributo(atributoSelec);
		int res = (int)(aux.getValor() * porcentaje) / 100;
		aux.setValor((aux.getValor() + res));
	}
	
	public void setPorcentaje(int num) {
		this.porcentaje = num;
	}
}
