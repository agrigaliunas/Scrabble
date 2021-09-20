package program;

import domain.Jugador;

public class Juego {

	public static void main(String[] args) {

		Jugador jugador1 = new Jugador("Agustin");
		System.out.println(jugador1.toString());
		Jugador jugador2 = new Jugador("Tomas");
		System.out.println(jugador2.toString());
		
	}

}
