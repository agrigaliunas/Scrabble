package domain;
import domain.Ficha;
import java.math.*;

public class Jugador {
	private int identificador;
	private String nombre;
	private Ficha[] fichas;
	public static int contadorId = 1;

	public Jugador() {
		this.nombre = "Invitado " + contadorId++;
	}
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.identificador = contadorId++;
		
	}
	
	@Override
	public String toString() {
		return "Soy el jugador "+nombre+" con id "+identificador;
	}
}
