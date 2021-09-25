package program;

import java.util.ArrayList;
import java.util.Scanner;
import domain.Ficha;
import domain.Jugador;


public class Juego {
	
	public void configurarJugadores() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese cantidad jugadores (de 2 a 4): ");
		int cantidadJugadores = teclado.nextInt();
		
		while(cantidadJugadores < 2 || cantidadJugadores > 4) {
			System.out.println("Error. Ingrese de 2 a 4 jugadores.");
			cantidadJugadores = teclado.nextInt();
		}
		teclado.close();
		
		Jugador jugadores[] = new Jugador[cantidadJugadores];
		
		System.out.println(jugadores.length);
		
//		int i = 1;
//		while(i <= cantidadJugadores) {
//			
//		}
	}
}
