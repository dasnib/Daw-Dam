package pq2;

import pq1.DemoProtected;

public class DemoProtected2 extends DemoProtected{
	public void metodo1() {
		mostrarProtec();            //Al ser subclase de una DEFAULT, el metodo si esta disponible
								//en otro paquete
	}
}
