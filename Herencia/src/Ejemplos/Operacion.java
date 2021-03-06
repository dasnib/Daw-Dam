package Ejemplos;

import java.util.Objects;

public abstract class Operacion {
	private double operando1;
	private double operando2;
	private double resultado;
	// Puede tener m?todos concretos y abstractos

	public Operacion(double operador1, double operador2) {
		this.operando1 = operador1;
		this.operando2 = operador2;
	}

	public double getOperando1() {
		return operando1;
	}

	public void setOperando1(double operando1) {
		this.operando1 = operando1;
	}

	public double getOperando2() {
		return operando2;
	}

	public void setOperando2(double operando2) {
		this.operando2 = operando2;
	}

	public abstract double operar();
	
	public double getResultado() {
		return resultado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(operando1, operando2);
	}
	
	/*@Override
	public boolean equals (Object o) {
		Operacion op = (Operacion) o;
		if (op.operando1 == operando1 && op.operando2 == operando2) {
			return true;
		}
		return false;
	}*/
	
	
}
