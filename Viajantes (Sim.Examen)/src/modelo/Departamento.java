package modelo;

import java.util.ArrayList;

public class Departamento {
	private ArrayList<Viajante> listaViajantes;

	public Departamento() {
		this.listaViajantes = new ArrayList<Viajante>();
	}

	public ArrayList<Viajante> getListaViajantes() {
		return listaViajantes;
	}

	public void setListaViajantes(ArrayList<Viajante> listaViajantes) {
		this.listaViajantes = listaViajantes;
	}

	public boolean agregarViajante(Viajante v) {
		for (Viajante viajante : listaViajantes) {
			if (v.getNombre().equals(viajante.getNombre())) {
				System.out.println("El nombre introducido ya existe en la lista de viajeros\n\n");
				return false;
			}
		}
		listaViajantes.add(v);
		System.out.println("Se ha introducido al viajante correctamente\n\n");
		return true;

	}

	public boolean agregarViaje(String ciudad, String nombre) {
		for (Viajante viajante : listaViajantes) {
			if (viajante.getNombre().equals(nombre)) {
				viajante.agrCiudad(ciudad);
				return true;
			}
		}
		System.out.println("El nombre introducido no se encuentra en la lista de viajeros\n\n");
		return false;
	}

	public void mostrarNivelAlto() {
		int nivelMax = 0;
		for (Viajante viajante : listaViajantes) {
			if (viajante.getNivel() > nivelMax) {
				nivelMax = viajante.getNivel();
			}
		}
		for (Viajante viajante : listaViajantes) {
			if (viajante.getNivel() == nivelMax) {
				System.out.println(viajante);
			}
		}
	}

	
	@Override
	public String toString() {
		return "Departamento [listaViajantes=" + listaViajantes + "]\n\n";
	}

}
