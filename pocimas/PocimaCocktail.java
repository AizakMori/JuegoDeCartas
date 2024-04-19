package pocimas;
import java.util.ArrayList;

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
	public int aplicar(int cc, String ss) {
		int res = 0;
		for(Pocima p: pocimas) {
			res+= p.aplicar(cc, ss);
		}
		return res;
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
