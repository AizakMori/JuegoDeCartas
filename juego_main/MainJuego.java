package juego_main;
import pocimas.*;
import tipoJugador.*;
import atributos.*;
import cartas_mazo.*;

//ASUMI QUE NO SE VAN A AGREGAR NUEVOS ATRIBUTOS A FUTURO POR ENDE DIRECTAMENTE SE CREAN EN LA CLASE JUGADOR PARA QUE ESTE LOS SELECCIONE
public class MainJuego {

	public static void main(String[] args) {
		//------------------------ MAZO Y JUGADORES ----------------------------------------------------------
		
		Mazo m1 = new Mazo();
		//POR DEFECTO COLOQUE UN CONSTRUCTOR QUE INICIE SOLO CON EL NOMBRE Y SIENDO TIMBERO
		Jugador j1 = new Jugador("Luffy");
		Jugador j2 = new Jugador("Nami");
		Jugador j3 = new Jugador("Tony Tony Chopper", new Obstinado());
		
		TipoJugador e1 = new Timbero();
		TipoJugador e2 = new Obstinado();
		TipoJugador e3 = new Ambicioso();
		
		j1.setEstrategia(e2);
		j2.setEstrategia(e3);
		
		//---------------------- CARTAS Y ATRIBUTOS ----------------------------------------------------------
		
		Carta c1 = new Carta("Superman", new Atributo("Altura",183), new Atributo("Peso",100), new Atributo("Velocidad",2000), new Atributo("Poder",10000),new Atributo("Peleas ganadas", 100));		
		Carta c2 = new Carta("Batman", new Atributo("Altura",180), new Atributo("Peso",80), new Atributo("Velocidad", 30), new Atributo("Poder", 100), new Atributo("Peleas ganadas", 85) );
		Carta c3 = new Carta("Acuaman", new Atributo("Altura",183),new Atributo("Peso", 83), new Atributo("Velocidad", 50), new Atributo("Poder" ,300), new Atributo("Peleas ganadas", 70) );
		Carta c4 = new Carta("WorderWoman", new Atributo("Altura",179), new Atributo("Peso",72),new Atributo("Velocidad", 100), new Atributo("Poder",500), new Atributo("Peleas ganadas", 90) );
		Carta c5 = new Carta("Robin Damian Wane", new Atributo("Altura",155), new Atributo("Peso",51), new Atributo("Velocidad", 25), new Atributo("Poder", 50), new Atributo("Peleas ganadas", 10) );
		Carta c7 = new Carta("Robin Dick Grayson", new Atributo("Altura",180), new Atributo("Peso",80), new Atributo("Velocidad", 30), new Atributo("Poder", 90), new Atributo("Peleas ganadas", 70));
		Carta c6 = new Carta("Cyborg", new Atributo("Altura",190), new Atributo("Peso",150), new Atributo("Velocidad", 90), new Atributo("Poder",400),new Atributo("Peleas ganadas", 50) );
		Carta c8 = new Carta("Raven", new Atributo("Altura",160), new Atributo("Peso",55), new Atributo("Velocidad",120),new Atributo("Poder",400), new Atributo("Peleas ganadas", 25) );
		Carta c9 = new Carta("Starfire", new Atributo("Altura",170), new Atributo("Peso",70), new Atributo("Velocidad",150), new Atributo("Poder",300), new Atributo("Peleas ganadas", 75));
		Carta c10 = new Carta("Chico bestia", new Atributo("Altura",160), new Atributo("Peso",65), new Atributo("Velocidad",150), new Atributo("Poder",300), new Atributo("Peleas ganadas", 20));
		Carta c11 = new Carta("Terra", new Atributo("Altura",160), new Atributo("Peso",60), new Atributo("Velocidad", 27), new Atributo("Poder", 150), new Atributo("Peleas ganadas", 10));
		
		Carta c12 = new Carta("Hombre araña");				//DEJE ESTE APARTE PARA PROBAR QUE PASABA SI FALTABA UN ATRIBUTO O ERA DISTINTO
		c12.addAtributo(new Atributo("Altura", 180));
		c12.addAtributo(new Atributo("Poder", 400));
		c12.addAtributo(new Atributo("Peleas ganadas", 120));
		c12.addAtributo(new Atributo("Velocidad", 500));
		//c12.addAtributo(new Atributo("Peso", 70));		//ESTA CARTA SERA RECHAZADA A FALTA DE ESTE ATRIBUTO COMENTADO Y SE IMPRIMIRA AL INICIO DE LA PARTIDA
		
		//-----------------------AÑADIDO DE CARTAS AL MAZO----------------------------------------
		
		m1.addCarta(c1);
		m1.addCarta(c2);
		m1.addCarta(c3);
		m1.addCarta(c4);
		m1.addCarta(c5);
		m1.addCarta(c6);
		m1.addCarta(c7);
		m1.addCarta(c8);
		m1.addCarta(c9);
		m1.addCarta(c10);
		m1.addCarta(c11);
		m1.addCarta(c12);
		
		//---------------------CREACION DE POCIMAS-------------------------------------
		
		Pocima p1 = new PocimaFortalecedora("Fortalecedora", 20);
		Pocima p2 = new PocimaFortalecedora("Fortalecedora Plus", 50);
		Pocima p3 = new PocimaMagica("Quiero vale 4", 4);
		Pocima p4 = new PocimaMagica("Numero Magico", 23);
		Pocima p5 = new PocimaDebilitadora("Kriptonita", 25);
		Pocima p6 = new PocimaDebilitadora("Reductor de Plomo", 55); 
		Pocima p7 = new PocimaSelectiva("Selectiva Fuerza", "Poder", 35);
		Pocima p8 = new PocimaSelectiva("Selectiva Peso", "Peso", 43);
		
		//-------------CREACION DE LAS POCIMAS COCKTAIL-------
		
		PocimaCocktail p9 = new PocimaCocktail("Cocktail++");
		PocimaCocktail p10 = new PocimaCocktail("Cocktail--");
		p10.addPocima(p5);
		p10.addPocima(p3);
		p10.addPocima(p7);
		p9.addPocima(p1);
		p9.addPocima(p8);
		p9.addPocima(p7);
		
		//---------------ADD DE POCIMAS AL MAZO------------
		
		m1.addPocima(p1);
		m1.addPocima(p2);
		m1.addPocima(p3);
		m1.addPocima(p4);
		m1.addPocima(p5);
		m1.addPocima(p6);
		m1.addPocima(p7);
		m1.addPocima(p8);
		m1.addPocima(p9);
		
		//---------------INICIO DE JUEGO-----------------
		
		Juego game = new Juego(m1, j1, j2, 20);  //MAZO / JUGADOR 1 / JUGADOR 2 /RONDAS (DEFAULT 15 SE PUEDE CAMBIAR CON setRondas(INT));
		game.jugar();
	}
}
