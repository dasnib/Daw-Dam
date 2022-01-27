package Aves;

public class Ave {
	private String nombreVulgar;
	private String nombreCient�fico;
	int numeroIndividuos;

	public Ave(String nombreVulgar, String nombreCient�fico, int numeroIndividuos) {
		this.nombreVulgar = nombreVulgar;
		this.nombreCient�fico = nombreCient�fico;
		this.numeroIndividuos = numeroIndividuos;
	}
	
	public String getNombreVulgar() {
		return nombreVulgar;
	}

	public void setNombreVulgar(String nombreVulgar) {
		this.nombreVulgar = nombreVulgar;
	}

	public String getNombreCient�fico() {
		return nombreCient�fico;
	}

	public void setNombreCient�fico(String nombreCient�fico) {
		this.nombreCient�fico = nombreCient�fico;
	}

	public void incrementarNumeroIndividuos(int n) {
		if (n > 0) {
			this.numeroIndividuos += n;
		}
		else {
			System.out.println("Entrada incorrecta");
		}
	}

	public void decrementarNumeroIndividuos(int n) {
		if (n > 0) {
			if (this.numeroIndividuos < n) {
				this.numeroIndividuos = 0;
			}else {
				this.numeroIndividuos -= n;
			}
		}
		else {
			System.out.println("Entrada incorrecta");
		}
		
	}

	public boolean peligroExtincion() {
		if (this.numeroIndividuos < 100) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Ave [nombreVulgar=" + nombreVulgar + ", nombreCient�fico=" + nombreCient�fico + ", numeroIndividuos="
				+ numeroIndividuos + "]";
	}
	
	
}
