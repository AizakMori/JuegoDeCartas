package mazo_cartas;
import java.util.ArrayList;
import atributos.*;
import pocimas.*;

public class Carta{
	private String nombre;
	private ArrayList<Atributo> atributos;
	private Pocima pocima;

	public Carta(String nom) {
		nombre = nom;
		atributos = new ArrayList<>();
	}
	public Carta(String nom, Atributo a1,Atributo a2 ,Atributo a3 ,Atributo a4, Atributo a5) {
		this(nom);
		addAtributo(a1);
		addAtributo(a2);
		addAtributo(a3);
		addAtributo(a4);
		addAtributo(a5);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void addAtributo(Atributo aa) {
		if(!aa.getNombre().isBlank() && aa.getValor() >= 0 && existeAtributo(aa.getNombre())) {
			atributos.add(aa);
		}
	}
	
	public boolean existeAtributo(String nom) {					//VERIFICA QUE EL NUEVO ATRIBUTO NO SE REPITA
		for(int i = 0; i< atributos.size(); i++) {
			String aux = atributos.get(i).getNombre();
			if(aux.equals(nom)) {
				return false;
			}
		}
		return true;
	}

	public void addPocima(Pocima p) {
		pocima = p;
	}
	public boolean hayPocima() {
		if(pocima != null) {
			return true;
		}
		return false;
	}
	public String getNombrePocima() {
		return pocima.getNombre();
	}
	
	private int aplicarPocima(int cc, String nom) {
			return this.pocima.aplicar(cc, nom);
	}

	public boolean verificar(Carta cc) {
		try {
			if(cc.cantAtributos() != this.cantAtributos()) {				//VERIFICAR SI TIENEN LA MISMA CANTIDAD DE ATRIBUTOS
				return false;				
			}
			ArrayList<String> estaCarta = this.getListOpciones();			//LISTADO DE ESTA CARTA
			ArrayList<String> otraCarta = cc.getListOpciones();				//LISTADO DE LA OTRA CARTA
			return estaCarta.containsAll(otraCarta) && otraCarta.containsAll(estaCarta);	//DOBLE COMPARACION DE LISTADOS
		}catch(Exception exc) {
			return false;
		}
	}

	public int cantAtributos() {
		return atributos.size();
	}

	public Atributo getAtributo(String nombre) {
		for(int i = 0;i < atributos.size(); i++) {
			if(atributos.get(i).getNombre().contains(nombre)) {
				return atributos.get(i);
			}
		}
		return null;
	}

	public int getValorAtributoSeleccionado(String nombre) {
		Atributo aux = getAtributo(nombre);
		if(hayPocima()) {
			return this.aplicarPocima(aux.getValor(), nombre);
		}
		return aux.getValor();
	}
	
	public int getValorSinAlterar(String nombre) {
		Atributo aux = getAtributo(nombre);
		return aux.getValor();
	}

	public ArrayList<String> getListOpciones(){
		ArrayList<String> aux = new ArrayList<>();
		for(int i= 0; i< atributos.size(); i++) {
			String name = atributos.get(i).getNombre();
			aux.add(name);
		}
		return aux;
	}

	public ArrayList<Atributo> getListAtributos(){
		return atributos;
	}

	public String toString() {
		return "Nombre: " + this.getNombre();
	}

}
