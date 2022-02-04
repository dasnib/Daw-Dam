package modelo;

import java.util.ArrayList;

public class Viajante {
	private String nombre;
	private ArrayList<String> listaCiudades;
	private int nivel;

	public Viajante(String nombre) {
		this.nombre = nombre;
		this.nivel = 0;
		this.listaCiudades = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public ArrayList<String> getListaCiudades() {
		return listaCiudades;
	}

	public void setListaCiudades(ArrayList<String> listaCiudades) {
		this.listaCiudades = listaCiudades;
	}

	public boolean agrCiudad(String ciudad) {
		if (listaCiudades.contains(ciudad) == false) {
			this.listaCiudades.add(ciudad);
			if (listaCiudades.size() % 3 == 0) {
				this.nivel += 1;
			}
			return true;
		}
		System.out.println("La ciudad ya estaba en la lista de ciudades\n\n");
		return false;

	}

	@Override
	public String toString() {
		return "Viajante [nombre=" + nombre + ", listaCiudades=" + listaCiudades + ", nivel=" + nivel + "]";
	}

}
