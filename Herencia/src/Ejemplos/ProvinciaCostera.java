package Ejemplos;

public class ProvinciaCostera extends Provincia {
	private long kmCosta;
	
	public ProvinciaCostera (String ub, String c, long p, long km, long kmC) {
		super (ub, c, p ,km);
		kmCosta = kmC;
	}

	public long getKmCosta() {
		return kmCosta;
	}

	public void setKmCosta(long kmCosta) {
		this.kmCosta = kmCosta;
	}

	public void muestra() {
		System.out.println("Soy " + getNombre() +", provincia costera, y tengo de costa " + kmCosta + " km");
	}

	public String toString() {
		return super.toString()	+ "ProvinciaCostera [kmCosta=" + kmCosta + "]";
	}

}
