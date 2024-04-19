package juego_main;
import cartas_mazo.*;

public class Juego {
	private Mazo mazoGeneral;
	private Jugador j1;
	private Jugador j2;
	private int maxRondas;
	private int nroRondas;
	
	public Juego(Mazo m1, Jugador j1, Jugador j2) {
		this(m1, j1, j2, 15);
	}
	
	public Juego(Mazo m1, Jugador j1, Jugador j2, int rond) {
		mazoGeneral = m1;
		this.j1 = j1;
		this.j2 = j2;
		maxRondas = rond;
		nroRondas = 1;
	}
	
	/*------------------------------------------JUEGO---------------------------------------------------------*/
	public void jugar() {
		repartir();
		while((nroRondas <= maxRondas) && (j1.cantCartas()>0) && (j2.cantCartas()>0)) {	
			Mensajes.ronda(nroRondas);
			comparar();
			Mensajes.finalRonda(j1.getNombre(),j1.cantCartas(), j2.getNombre(),j2.cantCartas());
		}
		if(j1.cantCartas()>j2.cantCartas())
			Mensajes.finDePartida(j1.getNombre());
		else
			Mensajes.finDePartida(j2.getNombre());
	}

	public void setRondas(int rondas) {	
		maxRondas = rondas;
	}

	/*------------------------------------REPARTIR-----------------------------------------------------*/
	
	public void repartir() {	
		Mensajes.imprimirRepartir();
		while(mazoGeneral.quedanCartas()) {
			j1.addCarta(mazoGeneral.repartirCarta());	
			if(mazoGeneral.quedanCartas()) {
				j2.addCarta(mazoGeneral.repartirCarta());
			}
		}
	}
	
	/*------------------------------------COMPARAR Y ASIGNAR GANADOR-------------------------------*/
	public void comparar() {
		String selecc = obtenerComparador();
		Carta cJ1 = j1.jugarCarta();
		Carta cJ2 = j2.jugarCarta();
		int comp1 = cJ1.getValorAtributoSeleccionado(selecc);
		int comp2 = cJ2.getValorAtributoSeleccionado(selecc);
		imprimirMensajes(cJ1, j1.getNombre(), selecc);
		imprimirMensajes(cJ2, j2.getNombre(), selecc);
		
		if (comp1 > comp2) {
			j1.setGanador(true);
			j2.setGanador(false);
			j1.addCarta(cJ1);
			j1.addCarta(cJ2);
			Mensajes.ganadorRonda(j1.getNombre());
		} else if (comp2 > comp1) {
			j2.setGanador(true);
			j1.setGanador(false);
			j2.addCarta(cJ2);
			j2.addCarta(cJ1);
			Mensajes.ganadorRonda(j2.getNombre());
		} else {
			j1.addCarta(cJ1);
			j2.addCarta(cJ2);
			Mensajes.empate();
		}
		
		nroRondas++;
	}
	
//------------------------------------------OBTENER EL ATRIBUTO A COMPARAR --------------------------------------------------
	private String obtenerComparador() {
		String selecc;
		if(nroRondas == 1 || j1.isGanador() == true) {
			selecc = j1.atributoSeleccionado();
			Mensajes.atributoSelec(j1.getNombre(), selecc);
			return selecc;
		}else{
			selecc = j2.atributoSeleccionado();
			Mensajes.atributoSelec(j2.getNombre(), selecc);
			return selecc;
		}
	}
	
	//----------------------------------IMPRIMIR CARTAS Y VALORES ---------------------------------------------------------
	public void imprimirMensajes(Carta c, String nom, String at) {
		if(c.hayPocima()) {
			Mensajes.mostrarCartaPocima(at, nom, c.getNombre(), c.getNombrePocima(),c.getValorAtributo(at), c.getValorAtributoSeleccionado(at));
		}else {
			Mensajes.mostrarCarta(at, nom, c.getNombre(), c.getValorAtributoSeleccionado(at));
		}
	}
}
