
public class pruebaVehiculo {

	public static void main(String[] args) {
		Veh�culo v1 = new Veh�culo();
		Veh�culo v2 = new Veh�culo(5 ,50, 5);
		
		v1.Informacion();
		v2.Informacion();
		
		v2 = v1;
		System.out.println(v2.num_pasajeros);
		System.out.println(v1.num_pasajeros);
	}

}
