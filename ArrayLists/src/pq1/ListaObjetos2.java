package pq1;

public class ListaObjetos2 implements Lista2 {

	private Objeto[] misObjetos;
	private int tam;
	private int cuenta;

	public ListaObjetos2(int tam) {
		this.tam = tam;
		this.misObjetos = new Objeto[tam];
		this.cuenta = 0;
	}

	@Override
	public Objeto damePrimero() {
		if (cuenta > 0) {
			return misObjetos[0];
		}
		return null;
	}

	@Override
	public Objeto dame(int i) {
		if (i >= 0 && i < cuenta) {
			return misObjetos[i];
		}
		return null;
	}

	@Override
	public Objeto dameFinal() {
		if (cuenta < 0) {
			return misObjetos[cuenta - 1];
		}
		return null;
	}

	@Override
	public int count() {
		return cuenta;
	}

	@Override
	public String dameMejor() {
		if (cuenta > 0) {
			String nombreMejor = misObjetos[0].getDato2();
			int maximo= misObjetos[0].getDato1();
			for (int i = 0; i < cuenta; i++) {
				if (misObjetos[i].getDato1() > maximo) {
					nombreMejor = misObjetos[i].getDato2();
					maximo = misObjetos[i].getDato1();
				}
			}
			return nombreMejor;
		}
		return null;
	}

	@Override
	public boolean agregar(Objeto o) {
		if (cuenta < tam) {
			misObjetos[cuenta] = o;
			cuenta += 1;
			return true;
		}
		return false;
	}

	public void recorrido() {
		for (int i = 0; i < cuenta; i++) {
			System.out.println(misObjetos[i]);
		}
	}
}
