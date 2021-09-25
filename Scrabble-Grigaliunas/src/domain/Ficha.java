package domain;

public class Ficha {
	
	private String letra; 
	private int valor; 
	
	
	public Ficha() {	}
	
	public Ficha(String letra, int valor) {
		this.setLetra(letra);
		this.setValor(valor);
	}

	
	public void setLetra(String letra) {
		this.letra = letra;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String getLetra() {
		return this.letra;
	}
	
	public int getValor() {
		return this.valor;
	}
	
	@Override
	public String toString() {
		return "Soy la ficha "+letra+" y valgo "+valor+" puntos\n";
	}
}