package pocimas;

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
	public int aplicar(int cc, String nom) {
		int res = (int)(cc * porcentaje) / 100;
		int aux = cc + res;
		return aux;
	}

}
