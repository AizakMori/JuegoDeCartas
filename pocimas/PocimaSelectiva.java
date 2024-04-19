package pocimas;

public class PocimaSelectiva extends Pocima {
	private int porcentaje;
	private String atributoSelec;
	public PocimaSelectiva(String nom, String atrib, int i) {
		super(nom);
		this.atributoSelec = atrib;
		this.porcentaje = i;
	}

	@Override
	public int aplicar(int cc, String ss) {
		if(ss.equals(atributoSelec)) {
			int res = (int)(cc * porcentaje) / 100;
			int aux = cc + res;
			return aux;
		}
		return cc;
	}
	
	public void setPorcentaje(int num) {
		this.porcentaje = num;
	}
}
