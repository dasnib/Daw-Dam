package televisiones;

import java.util.ArrayList;

public class MiTelePrueba {

	public static void main(String[] args) {
		MiTele tv1 = new MiTele(15);
		MiTele tv2 = new MiTele(10);
		
		tv1.apagar();
		tv1.cambiarCanal(2);
		
		tv1.encender();
		tv1.cambiarCanal(-5);
		tv1.cambiarCanal(2);
		
		ArrayList<MiTele> misTeles = new ArrayList<MiTele>();
		misTeles.add(tv1);
		misTeles.add(tv2);
		misTeles.add(new MiTele(7));
		
		
		
		System.out.println("--------------------------------");
	
		for (MiTele miTele : misTeles) {
			miTele.encender();
			miTele.cambiarCanal(2);
		}
		System.out.println("--------------------------------");
		
		for (int i = 0; i < misTeles.size(); i++) {
			misTeles.get(i).encender();
			misTeles.get(i).cambiarCanal(2);
		}
		System.out.println("--------------------------------");
		
		for (int i = 0; i < misTeles.size(); i++) {
			MiTele tv = misTeles.get(i);
			int c = (int)(Math.random()*(tv.getNumCanales()+1));
			tv.encender();
			tv.cambiarCanal(c);
			System.out.println(tv);
			
		}
		
	}

}
