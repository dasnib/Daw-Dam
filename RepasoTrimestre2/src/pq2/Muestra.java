package pq2;

public class Muestra {
	private Humano[] muestra;
	private int tam;
	private int cont;
	
	public Muestra(int tam) {
		this.muestra = new Humano[tam];
		this.tam = tam;
	}
	
	public boolean agregar (Humano h) {
		if (cont < tam) {
			muestra[cont]=h;
			cont += 1;
			return true;
		}
		return false;
	}
	
	public void ordenarMy() {
		Humano inter;
		for (int i = 0; i < cont-1; i++) {
			for (int j = i+1; j < cont; j++) {
				//Ordeno de mayor a menor
				if (muestra[i].compareTo(muestra[j]) < 0) {
					inter=muestra[i];
					muestra[i] = muestra[j];
					muestra[j]=inter;
				}
			}
			
		}
	}
	
	public void ver() {
		for (int i = 0; i < cont; i++) {
			System.out.println(muestra[i]);
		}
	}
	
}
