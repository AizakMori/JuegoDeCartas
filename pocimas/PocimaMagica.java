package pocimas;

public class PocimaMagica extends Pocima {
	private int numero;
	public PocimaMagica(String nom, int i) {
		super(nom);
		this.numero = i;
	}
	@Override
	public int aplicar(int cc, String nom) {
		return this.numero;
	}
	public void setNumeroMagico(int num) {
		this.numero = num;
	}
}
