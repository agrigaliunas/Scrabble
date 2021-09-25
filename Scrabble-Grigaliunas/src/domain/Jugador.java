package domain;
import domain.Ficha;


public class Jugador {
	private int identificador;
	private String nombre;
	private Ficha[] fichas;
	
	public static int contadorId = 1;
	
	public Jugador() {
		this.nombre = "Invitado " + contadorId++;
	}
		
	public Jugador(String nombre) {
		this.setNombre(nombre);
		this.identificador = contadorId++;
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
	public int getCantFichas() {
		return this.fichas.length;
	}
	
	public void getFichas() {
		for(int i = 0 ; i <= this.getCantFichas() ; i++) {
			System.out.println(this.fichas[i]);
		}
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	@Override
	public String toString() {
		return "Soy el jugador "+nombre+" con id "+identificador+"\n";
	}
}
