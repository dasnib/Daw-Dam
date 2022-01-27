package pq1;

public class DemoProtected {
	protected void mostrarProtec() {
		System.out.println("Control de acceso Protected 1");
	}
	
	public String xxProtec() {
		mostrarProtec();
		DemoDefault d = new DemoDefault();
		d.mostrarD();
		String salida = "Control de acceso private 2";
		return salida;
	}
}
