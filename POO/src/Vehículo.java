
public class Veh�culo {
	int num_pasajeros;
	int capacidad;
	int consumo; // litros por km

	public Veh�culo(int num, int cap, int con) {
		num_pasajeros = num;
		capacidad = cap;
		consumo = con;
	}

	public Veh�culo() {

	}

	public void Informacion() {
		System.out.println("Tu veh�culo puede llevar hasta " + num_pasajeros + " pasajeros y consume " + consumo
				+ " litros por km.");
	}

	public double coste(double precio, int km_recorridos) {
		double aux = precio * consumo * km_recorridos;
		return aux;
	}

}
