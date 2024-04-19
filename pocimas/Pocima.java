package pocimas;
public abstract class Pocima {
	private String nombre;
	public Pocima(String nom) {
		this.nombre = nom;
	}
	public String getNombre() {
		return nombre;
	}
	public abstract int aplicar(int cc, String ss);
}
