package domain;

public class Jugador {
	private int identificador;
	private String nombre;
	private Ficha[] fichas;
	
	private static int contId = 1;
	
	public Jugador() {
		this.nombre = "Invitado";
	}
		
	public Jugador(String nombre) {
		this.setNombre(nombre);
		this.setId(contId);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setId(int contId) {
		this.identificador = contId;
	}
		
	public int getCantFichas() {
		return this.fichas.length;
	}
	
	public int getPuntaje() {
		int puntaje = 0;
		for(int i = 0 ; i<fichas.length ; i++) {
			puntaje += fichas[i].getValor();
		}
		return puntaje;
		
	}
	
	public void getFichas() {
		for(int i = 0 ; i <= this.getCantFichas() ; i++) {
			System.out.println(this.fichas[i].getLetra());
		}
	}
	
	
	public int getId() {
		return this.identificador;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	@Override
	public String toString() {
		return "Soy el jugador "+nombre+" con id "+identificador+"\n";
	}
}
