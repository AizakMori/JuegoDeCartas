package juegoDeCartas_v2;

public class Mensajes {
	public static void imprimirRepartir() {
		System.out.println("Repartiendo cartas del mazo....");
	}
	public static void cartaRechazada(String nombre) {
		System.out.println("La carta: " + nombre +  " no es compatible con el mazo");
	}
	public static void ronda(int rondas) {
		System.out.println("---------------------------------------- ronda " + rondas + " ---------------------------------------- ");
	}
	public static void atributoSelec(String j,String c) {
		System.out.println("El jugador " + j + " selecciona competir por el atributo " + c);
	}
	public static void mostrarCarta(String nombreAt, String jugador, String nombreC, int at) {
		System.out.println("La carta de " + jugador + " es " + nombreC + " con "+ nombreAt + " de: "  + at );
	}
	public static void mostrarCartaPocima(String nombreAt, String jugador, String nomCarta, String pocima, int i, int j) {
		System.out.println("La carta de " + jugador + " es " + nomCarta + " con "+ nombreAt + " de: "  + i + "\n"+ " Se le aplico una pocima \"" + pocima + "\" resultante: " + j);
	}
	public static void ganadorRonda(String j) {
		System.out.println( "Ganador de la ronda: -" + j.toUpperCase() + "-");
	}
	public static void empate() {
		System.out.println("Hubo empate, envian sus cartas al ultimo lugar de su mazo");
	}
	public static void finalRonda(String j1, int cartasJ1, String j2, int cartasJ2) {
		System.out.println(j1 + " posee ahora: " + cartasJ1 + " y " + j2 + " posee ahora: " + cartasJ2); 
	}
	public static void finDePartida(String j) {
		System.out.println("-" + j.toUpperCase() + "- GANA LA PARTIDA");
	}
}
