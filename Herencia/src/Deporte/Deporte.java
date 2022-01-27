package Deporte;

public class Deporte {
	private String nombre;
	private int numeroDeEquipos;
	private int numeroDeJugadoresPorEquipo;

	public Deporte(String nombre, int numeroDeEquipos, int numeroDeJugadoresPorEquipo) {
		this.nombre = nombre;
		this.numeroDeEquipos = numeroDeEquipos;
		this.numeroDeJugadoresPorEquipo = numeroDeJugadoresPorEquipo;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public int getNumeroDeEquipos () {
		return this.numeroDeEquipos;
	}
	
	public int getNumeroDeJugadoresPorEquipo () {
		return this.numeroDeJugadoresPorEquipo;
	}
	
	
	
}
