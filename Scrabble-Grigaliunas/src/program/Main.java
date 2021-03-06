package program;

import domain.Ficha;
import domain.Jugador;

public class Main {
	public static void main(String[] args) {
		
		Juego juego = new Juego();
		Jugador jugadores[] = juego.configurarJugadores();
		Ficha fichas[] = juego.generarFichas();
		
		juego.asignarFichas(fichas,jugadores);

		int i = 0;
		while(i < jugadores.length) {
			System.out.println("Fichas para el jugador "+jugadores[i].getNombre()+": ");
			jugadores[i].mostrarFichas();
			System.out.println("Y tiene un puntaje de: ");
			System.out.println(jugadores[i].getPuntaje());
			System.out.println("\n");
			i++;
		}

	}
	
	

}
