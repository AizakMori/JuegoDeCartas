package Jugadores;

import java.util.ArrayList;

public class JugadorObstinado extends Jugador {
	private String select;
	
	public JugadorObstinado(String nom) {			//POR SI SOLO LO CREAS CON NOMBRE
		this(nom, null);
	}
	
	public JugadorObstinado(String nom, String ss) {	//POR SI QUERES CREARLO TAMBIEN CON EL NUMERO DE ATRIBUTO QUE VA A QUEDAR
		super(nom);
		this.select = ss;
	}
	
	public String atributoSeleccionado() {
		ArrayList<String> opciones = super.getOpciones();
		if(select == null) {
			int res = (int) (Math.random()*opciones.size());
			select = opciones.get(res);
		}
		return select;

	}
}
