package herramientas;

public class Mensajes {
	private static String SEPARADOR1 = "-------------------- ronda " ;
	private static String SEPARADOR2 = " -------------------- ";
	private static final String GANADOR = "Gana la ronda: ";
	private static final String EMPATE = "Hubo empate, envian sus cartas al ultimo lugar de su mazo";
	private static final String POSEE = " posee ahora: ";

	public static void imprimirRepartir() {
		System.out.println("Repartiendo cartas del mazo....");
	}
	public static void cartaRechazada(String nombre) {
		System.out.println("La carta: " + nombre +  " no es compatible con el mazo");
	}
	public static void ronda(int rondas) {
		System.out.println(SEPARADOR1 + rondas + SEPARADOR2);
	}
	public static void atributoSelec(String j,String c) {
		System.out.println("El jugador " + j + " selecciona competir por el atributo " + c);
	}
	public static void random(String c) {
		System.out.println("Por empate se selecciono de forma aleatoria competir por " + c);
	}
	//public static void mostrarDatos(String nombreC1, )
	public static void ganadorRonda(String j) {
		System.out.println(GANADOR + j.toUpperCase());
	}
	public static void mostrarCarta(String nombreAt, String jugador, String nombreC, int at) {
		System.out.println("La carta de " + jugador + " es " + nombreC + " con "+ nombreAt + " de: "  + at );
	}
	public static void mostrarPocima(String pocima, int i) {
		System.out.println("Se aplico una " + pocima + " valor resultante: " + i);
	}
	public static void empate() {
		System.out.println(EMPATE);
	}
	public static void finalRonda(String j1, int cartasJ1, String j2, int cartasJ2) {
		System.out.println(j1 + POSEE + cartasJ1 + " y " + j2 + POSEE + cartasJ2); 
	}
	public static void finDePartida(String j) {
		System.out.println("GANADOR/A DE LA PARTIDA " + j.toUpperCase());
	}
}
