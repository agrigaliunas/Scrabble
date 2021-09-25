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
			System.out.println("Error. Ingrese de 2 a 4 jugadores.\n");
			cantidadJugadores = teclado.nextInt();
		}
		
		
		Jugador jugadores[] = new Jugador[cantidadJugadores];
		System.out.println("Ahora, ingrese los nombres de cada jugador!\n");
		
		String nombre = teclado.next();
		int i = 0;
		while(i < cantidadJugadores-1) {
			jugadores[i] = new Jugador();
			jugadores[i].setNombre(nombre);
			jugadores[i].setId(i+1);
			System.out.println(jugadores[i].toString()); // test
			i++;
			System.out.println("Siga ingresando: ");
			nombre = teclado.next();
		}
		
		teclado.close();
	
	}
	
	
}
