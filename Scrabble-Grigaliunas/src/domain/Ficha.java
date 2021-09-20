package domain;

public class Ficha {
	
	private String letra;
	private int valor;
	
	
	//constructor
	public Ficha(String letra, int valor) {
		this.setLetra(letra);
		this.setValor(valor);
	}

	@Override
	public String toString() {
		return "Soy la ficha de letra"+letra+"y valgo"+valor+"puntos";
	}
	
	public void setLetra(String letra) {
		this.letra = letra;
		
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
}