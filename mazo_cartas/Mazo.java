package mazo_cartas;
import java.util.ArrayList;
import pocimas.Pocima;
import herramientas.*;

public class Mazo {
	private ArrayList<Carta> cartas;
	private ArrayList<Pocima> pocimas;

	public Mazo() {
		cartas = new ArrayList<>();
		pocimas = new ArrayList<>();
	}
	public void addCarta(Carta c) {					//REALIZA LA VERIFICACION DE LA CARTA ANTES DE AÑADIRLA
		if(cartas.isEmpty()) {			
			cartas.add(c);
		}else if(cartas.get(0).verificar(c)) {
			cartas.add(c);
		}else {
			Mensajes.cartaRechazada(c.getNombre());
		}
	}
	
	public void addPocima(Pocima p) {
		pocimas.add(p);
	}
	
	public Carta repartirCarta() {					//REPARTE A PARTIR DE LA CARTA "EN LA PARTE SUPERIOR DEL MAZO"
		int cant = cartas.size()-1;
		Carta aux = cartas.get(cant);
		cartas.remove(cant);
		if(pocimas.size()!=0) {						//REPARTIR SI HAY POCIMAS EN EL ARRAY
			int i = randomizador(2);				
			if(i == 0) {							//QUE HAYA 50% DE PROBABILIDADES DE QUE SE AGREGUE UNA POCIMA(" ALEATORIO ")
			int indx = randomizador(pocimas.size());
			Pocima pocimaAux = pocimas.get(indx);
			aux.addPocima(pocimaAux);
			pocimas.remove(indx);
			return aux;
			}
		}
		return aux;
	}
	
	public ArrayList<String> getListOpciones(){
		return cartas.get(0).getListOpciones();
	}
	
	public Carta entregarCarta() {					//ENTREGA PRIMER CARTA, PARA PONERLA EN JUEGO
		Carta aux = cartas.get(0);
		cartas.remove(0);
		return aux;
	}
	
	public Carta verCarta() {						//PARA EL JUGADOR AMBICIOSO, VER LA CARTA SIN ENTREGARLA PARA VERIFICAR EL ATRIBUTO MAS ALTO
		Carta aux = cartas.get(0);
		return aux;
	}
	
	public boolean quedanCartas() {					//VERIFICA SI QUEDAN CARTAS
		return cartas.size()!=0;
	}
	
	public int cantCartas() {						//VERIFICA LA CANTIDAD DE CARTAS RESTANTES 
		int aux = cartas.size();
		return aux;
	}
	
	public void ultimoLugar(Carta c) {				//COLOCA LA CARTA EN EL ULTIMO LUGAR EN CASO DE EMPATE
		cartas.add(cartas.size(), c);
	}
	
	public int randomizador(int i) {				//LO UTILIZO PARA NO REPETIR CODIGO EN EL REPARTIR
		return (int)(Math.random()*i);
	}
}
