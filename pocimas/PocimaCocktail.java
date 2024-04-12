package pocimas;
import java.util.ArrayList;

import mazo_cartas.*;

public class PocimaCocktail extends Pocima {
	private ArrayList<Pocima> pocimas;
	public PocimaCocktail() {
		this("Cocktail");
	}
	public PocimaCocktail(String nom) {
		super(nom);
		pocimas = new ArrayList<>();
	}

	@Override
	public void aplicar(Carta c) {
		for(Pocima p: pocimas) {
			p.aplicar(c);
		}
	}
	public void addPocima(Pocima p) {
		if(p != null) {
			pocimas.add(p);
		}
	}
	public void borrarUltima() {
		pocimas.remove(pocimas.size()-1);
	}
}
