package pq2;

import pq1.DemoDefault;
import pq1.DemoProtected;

public class test2 {

	public static void main(String[] args) {
		DemoDefault d = new DemoDefault();
		//d.mostrarD();		Al ser DEFAULT el método no es visible fuera del paquete de origen
		
		DemoProtected dpro = new DemoProtected();
		//dpro.mostrar();	Al ser Protegida el metodo no es visible fuera del paquete original
		//					ya que no es una subclase
	}

}
