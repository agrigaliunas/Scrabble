package domain;

public class Ficha {
	
	private String letra;
	private int valor;
	
	
	//constructor
	public Ficha(String letra, int valor) {
		this.letra = letra;
		this.valor = valor;
	}

		
	@Override
	public String toString() {
		return "Soy la ficha de letra"+letra+"y valgo"+valor+"puntos";
	}
	
	
}