package pq1;

public class DepositoBancario {
	private Persona titular;
	private int dias;
	private double interes;
	private double cantidad;
	
	public DepositoBancario(Persona titular, int dias, double interes, double cantidad) {
		this.titular = titular;
		this.dias = dias;
		this.interes = interes;
		this.cantidad = cantidad;
	}
	
	public DepositoBancario(Persona titular, double cantidad) {
		this.titular = titular;
		this.dias = 365;
		this.interes = 0.025;
		this.cantidad = cantidad;
	}
	
	public String getNombreTitular() {
		return titular.getNombre();
	}
	
	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	
	public Persona getTitular() {
		return titular;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	

	public double recibir() {
		return cantidad + (cantidad * interes / 100);
	}
	
	@Override
	public boolean equals(Object obj) {
		DepositoBancario d = (DepositoBancario)obj;
		if (d.dias == this.dias && d.interes == this.interes) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "DepositoBancario [titular=" + titular + ", dias=" + dias + ", interes=" + interes + ", cantidad="
				+ cantidad + "]";
	}
	
	
	
	
}
