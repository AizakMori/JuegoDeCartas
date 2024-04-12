package pocimas;
import mazo_cartas.*;

public abstract class Pocima {
	private String nombre;
	public Pocima(String nom) {
		this.nombre = nom;
	}
	public String getNombre() {
		return nombre;
	}
	public abstract void aplicar(Carta c);
}
