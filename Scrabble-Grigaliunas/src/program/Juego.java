package program;

import java.util.Scanner;

public class Juego {
	
	public void configurarJugadores() {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de jugadores (de 2 a 4): ");
		int cantidadJugadores = teclado.nextInt();
	
		while(cantidadJugadores < 2 || cantidadJugadores > 4) {
			System.out.println("Error. Ingrese de 2 a 4 jugadores.");
			cantidadJugadores = teclado.nextInt();
		}
		teclado.close();
		
		System.out.println(cantidadJugadores);
		
	}
}
