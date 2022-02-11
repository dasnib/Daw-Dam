package pq1;

import java.util.ArrayList;

public class ListaObjetos implements Lista {

	private ArrayList<Objeto> l;

	public ListaObjetos() {
		l = new ArrayList<Objeto>();
	}

	@Override
	public void putInicio(Objeto obj) {
		l.add(0, obj);
	}

	@Override
	public void putFinal(Objeto obj) {
		l.add(obj);
	}

	@Override
	public Object popPrincipio() {
		if (l.size() > 0) {
			return l.remove(0);
		}
		return null;
	}

	@Override
	public Object popFinal() {
		if (l.size() > 0) {
			return l.remove(l.size()-1);
		}
		return null;
	}

	@Override
	public Object getAt(int i) {
		if (i < 0 || i >= l.size()) {
			System.out.println("No existe el índice introducido en la lista");
			return null;
		}else {
			return l.remove(i);
		}
	}

	@Override
	public int count() {
		return l.size();
	}
	
	public void verLista() {
		for (Objeto objeto : l) {
			System.out.println(objeto);
		}
	}

	@Override
	public String toString() {
		return "ListaObjetos [l=" + l + "]";
	}
	
	

}
