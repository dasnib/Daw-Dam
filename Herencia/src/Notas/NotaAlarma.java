package Notas;

public class NotaAlarma extends Nota{

	private int hora;
	
	public NotaAlarma(int identificador, String texto, int hora) {
		super(identificador, texto);
		if (hora<24 && hora > 0) {
			this.hora = hora;
		}
	}
	
	public int getHora () {
		return this.hora;
	}

	public void setHora (int hora) {
		if (hora<24 && hora > 0) {
			this.hora = hora;
		}
	}

	@Override
	public String toString() {
		return super.toString()+"NotaAlarma [hora=" + hora + "]";
	}
	
	
}
