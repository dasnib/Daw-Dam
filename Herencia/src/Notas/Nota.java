package Notas;

public class Nota {
	private int identificador;
	private String texto;
	
	public Nota (int identificador, String texto) {
		this.identificador = identificador;
		this.texto = texto;
	}
	
	public int getIdentificador () {
		return this.identificador;
	}
	
	public void setIdentificador (int identificador) {
		this.identificador = identificador;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Nota [identificador=" + identificador + ", texto=" + texto + "]";
	}
	
	
	
}
