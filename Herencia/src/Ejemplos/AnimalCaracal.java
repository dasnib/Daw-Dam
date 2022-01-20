package Ejemplos;

public class AnimalCaracal extends Animal{
	private String habitat;
	
	public AnimalCaracal (String categoria, int patas, String habitat) {
		super(categoria, patas);
		this.habitat = habitat;
	}
	
	public String getHabitat () {
		return this.habitat;
	}
	
	public void setHabitat (String habitat) {
		this.habitat = habitat;
	}
	@Override
	public void comoSueno() {
		System.out.println("Miaaaau Miaaaau");
	}

	@Override
	public String toString() {
		return "Caracal= " + super.toString() + "[habitat=" + habitat + "]";
	}
}
