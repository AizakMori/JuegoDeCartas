package pocimas;

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
	public int aplicar(int cc, String ss) {
		int res = (int)(cc * porcentaje) / 100;
		int aux = cc - res;
		return aux;
	}
	public void setPorcentaje(int num) {
		this.porcentaje = num;
	}
}
