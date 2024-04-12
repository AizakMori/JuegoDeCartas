package pocimas;

import java.util.ArrayList;

import atributos.Atributo;
import mazo_cartas.Carta;

public class PocimaMagica extends Pocima {
	private int numero;
	public PocimaMagica(String nom, int i) {
		super(nom);
		this.numero = i;
	}
	@Override
	public void aplicar(Carta c) {
		ArrayList<Atributo> opciones = c.getListAtributos();
		for(int i = 0; i < opciones.size(); i++) {
			Atributo aux = opciones.get(i);
			aux.setValor(numero);
		}
	}
	public void setNumeroMagico(int num) {
		this.numero = num;
	}
}
