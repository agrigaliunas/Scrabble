package program;

import java.util.Random;
import java.util.Scanner;
import domain.Ficha;
import domain.Jugador;



public class Juego {
	
	public Jugador[] configurarJugadores() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese cantidad jugadores (de 2 a 4): ");
		int cantidadJugadores = teclado.nextInt();
		
		while(cantidadJugadores < 2 || cantidadJugadores > 4) {
			System.out.println("Error. Ingrese de 2 a 4 jugadores.\n");
			cantidadJugadores = teclado.nextInt();
		}
		
		Jugador jugadores[] = new Jugador[cantidadJugadores];
		String nombre;
		int i = 0;
		
		System.out.println("Ahora, ingrese los nombres de cada jugador!\n");
		while(i < cantidadJugadores) {
			jugadores[i] = new Jugador();
			nombre = teclado.next();
			jugadores[i].setNombre(nombre);
			jugadores[i].setId(i+1);
			i++;
		}
		
		teclado.close();
		return jugadores;
	}
	
	public Ficha[] generarFichas() {
		// 100 piezas 2 comodines
		// K y W se skipean
		String fichasAbecedario[] = {"A","A","A","A","A","A","A","A","A","A","A","A","B","B","C","C","C","C","CH"
				,"D","D","D","D","D","E","E","E","E","E","E","E","E","E","E","E","E","F","G","G","H","H"
				,"I","I","I","I","I","I","J","L","L","L","L","LL","M","M","N","N","N","N","N","Ñ"
				,"O","O","O","O","O","O","O","O","O","P","P","Q","R","R","R","R","R","RR","S","S","S","S","S","S"
				,"T","T","T","T","U","U","U","U","U","V","X","Y","Z","COMODIN","COMODIN"}; 

		Ficha fichas[] = new Ficha[100];
		int i = 0;
		String letra;
		
		for(i = 0 ; i <= 99 ; i++) {
			letra = fichasAbecedario[i];
			fichas[i] = new Ficha();
			
			fichas[i].setLetra(letra);
			
			if("AEILNORSTU".contains(letra)) {
				fichas[i].setValor(1);
			}
			else if("DG".contains(letra)) {
				fichas[i].setValor(2);
			}
			else if("BCMP".contains(letra)) {
				fichas[i].setValor(3);
			}
			else if("FHVY".contains(letra)) {
				fichas[i].setValor(4);
			}
			else if("CHQ".contains(letra)) {
				fichas[i].setValor(5);
			}
			else if("JLLÑRRX".contains(letra)) {
				fichas[i].setValor(8);
			}
			else if("Z".contains(letra)) {
				fichas[i].setValor(10);
			}
		}
		return fichas;
	}
	
	public Jugador[] asignarFichas(Ficha fichas[], Jugador jugadores[]) {
		Random rnd = new Random();
		Ficha ficha;
		int i = 0;
		int j;
			
		while(i < jugadores.length) {
			Ficha fichasAsignadas[] = new Ficha[7];
			
			for(j = 0 ; j < 7 ; j++) {
				fichasAsignadas[j] = new Ficha();
				
				// las fichas que se reparten no se pueden repetir
				
				ficha = fichas[rnd.nextInt(100)];
				fichasAsignadas[j] = ficha;
			}
			
			jugadores[i].setFichas(fichasAsignadas);
			i++;
		}
		return jugadores;
		
	}
	
	
}
