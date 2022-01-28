package Ejemplos;

import java.util.ArrayList;

public class CantanteListaFamosos {
	private ArrayList<Cantante> lista;
	
	public CantanteListaFamosos() {
		lista = new ArrayList<Cantante>();
		lista.add(new Cantante("Trueno", "FEEL ME!"));
		lista.add(new Cantante("David Bustamante","Superman"));
		lista.add(new Cantante("David Bisbal","Bulería"));
	}
	
}
