package televisiones;

public class MiTele implements Televisor, Canales {
	private int numCanales;
	private int canalActual;
	private boolean encendida;

	public MiTele(int numCanales) {
		this.numCanales = numCanales;
		canalActual = 0;
		encendida = false;
		if (this.numCanales > nombreCanal.length-1) {
			this.numCanales = nombreCanal.length-1;
		}
		
	}

	public int getNumCanales() {
		return numCanales;
	}

	public int getCanalActual() {
		return canalActual;
	}
	
	public String getNombreCanal() {
		return nombreCanal[canalActual];
	}

	public boolean isEncendida() {
		return encendida;
	}

	@Override
	public void encender() {
		if (!encendida) {
			this.encendida = true;
			System.out.println("- ON -\n");
		}
	}

	@Override
	public void apagar() {
		if (encendida) {
			this.encendida = false;
			System.out.println("- OFF -\n");
		}
	}

	@Override
	public void cambiarCanal(int canal) {
		if (encendida) {
			if (canal > 0 && canal <= numCanales && canal != canalActual) {
				this.canalActual = canal;
				System.out.println("Se ha cambiado al canal " + nombreCanal[canal-1] + "\n");
			} else {
				System.out.println("No se puede cambiar de canal, el canal introducido no existe o es el actual\n");
			}

		} else {
			System.out.println("No se puede cambiar de canal, la televisión está apagada\n");
		}

	}

	@Override
	public String toString() {
		return "MiTele [numCanales=" + numCanales + ", canalActual=" + canalActual + ", encendida=" + encendida + "]";
	}

}
