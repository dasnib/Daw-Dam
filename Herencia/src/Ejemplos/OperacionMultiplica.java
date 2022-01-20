package Ejemplos;

public class OperacionMultiplica extends Operacion{
	
	public OperacionMultiplica(double operador1, double operador2) {
		super(operador1, operador2);
	}

	@Override
	public double operar() {
		return super.getOperando1() * super.getOperando2();
	}

	@Override
	public String toString() {
		return "Multiplica " + getOperando1() + " con " + getOperando2();
	}
}
