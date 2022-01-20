package Ejemplos;

public class Animal {
	private String categoria;
	private int patas;

	public Animal(String categoria, int patas) {
		this.categoria = categoria;
		this.patas = patas;
	}

	public Animal(String categoria) {
		this.categoria = categoria;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public void comoSueno() {
		System.out.println("Todavía no lo sé");
	}

	@Override
	public String toString() {
		return "Animal [categoria=" + categoria + ", patas=" + patas + "]";
	}

}
