package program;

import domain.Ficha;
import domain.Jugador;

public class Main {
	public static void main(String[] args) {
		
		Juego juego = new Juego();
		Jugador jugadores[] = juego.configurarJugadores();
		Ficha fichas[] = juego.generarFichas();
		
		juego.asignarFichas(fichas,jugadores);
	}
	
	

}
