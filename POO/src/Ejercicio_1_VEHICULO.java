
public class Ejercicio_1_VEHICULO {
	private int num_ruedas;
	private int vel_maxima;
	private int peso;

	public Ejercicio_1_VEHICULO(int numero_ruedas, int velocidad_maxima, int peso_vehiculo) {
		num_ruedas = numero_ruedas;
		vel_maxima = velocidad_maxima;
		peso = peso_vehiculo;
	}

	public void set_num_ruedas(int nuevo) {
		num_ruedas = nuevo;
	}

	public void set_vel_maxima(int nuevo) {
		vel_maxima = nuevo;
	}

	public void set_peso(int nuevo) {
		peso = nuevo;
	}

	public int get_num_ruedas() {
		return num_ruedas;
	}

	public int get_vel_maxima() {
		return vel_maxima;
	}

	public int get_peso() {
		return peso;
	}

	public boolean esIgual(Ejercicio_1_VEHICULO coche) {
		if ((coche.num_ruedas == num_ruedas) && (coche.vel_maxima == vel_maxima) && (coche.peso == peso)) {
			return true;
		}
		return false;

	}

	public void copia(Ejercicio_1_VEHICULO Vehiculo) {
		num_ruedas = Vehiculo.num_ruedas;
		vel_maxima = Vehiculo.vel_maxima;
		peso = Vehiculo.peso;
	}

	public void copia2(Ejercicio_1_VEHICULO vehiculo) {
		vehiculo.num_ruedas = num_ruedas;
		vehiculo.vel_maxima = vel_maxima;
		vehiculo.peso = peso;
	}

	public String informacion() {
		return "Vehículo " + num_ruedas + " " + vel_maxima + " " + peso;
	}
}
