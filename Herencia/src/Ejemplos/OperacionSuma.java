package Ejemplos;

public class OperacionSuma extends Operacion{

	public OperacionSuma(double operador1, double operador2) {
		super(operador1, operador2);
	}

	@Override
	public double operar() {
		return super.getOperando1() + super.getOperando2();
	}

	public boolean mismoSigno() {
		if ((super.getOperando1() >= 0 && super.getOperando2() >= 0) ||
		(super.getOperando1() <= 0 && super.getOperando2() <= 0)) {
			return true;
		}
		return false;
	}
	
	public boolean mismoSigno2() {
		return super.getOperando1() * super.getOperando2() >= 0;
	}
	
	@Override
	public String toString() {
		return "Suma " + getOperando1() + " con " + getOperando2();
	}
	
	
	
}
