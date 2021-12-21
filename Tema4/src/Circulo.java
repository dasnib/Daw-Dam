/**
 * 
 * Define métodos del círculo
 * @author Daniel
 * @version v1.0
 * @since 26/11/2021
 *
 */


public class Circulo {

	private double rad;

	
	/**
	 * Constructor de la clase
	 * @param radio		radio del circulo
	 */
	public Circulo(double radio) {
		this.rad = radio;
	}
	
	/**
	 * Retorna el radio del circulo
	 * @return rad		retorna el radio del circulo
	 */
	public double getRad() {
		return rad;
	}

	/**
	 * @param rad	radio del circulo
	 * Asigna un radio
	 */
	public void setRad(double rad) {
		this.rad = rad;
	}
	
	/**
	 * Imprime el color, el diametro y el area del circulo
	 */
	public void imprimir() {
		String color = "rojo";
		System.out.println("Diámetro: " + 2 * rad);
		System.out.println("Color: " + color);
		double area = 2 * 3.1416 * rad * rad;
		System.out.println(area);
	}
	
	/**
	 * Si conDecimales es true comprueba si ambos radios son iguales
	 * si es falso
	 * @return boolean		Retorna verdadero o falso
	 * @param  conDecimales  otro		Si el radio tiene o no decimales 
	 */
	public boolean esIgual(Circulo otro, boolean conDecimales) {
		double radio1 = this.rad;
		double radio2 = otro.getRad();
		if (conDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
}
