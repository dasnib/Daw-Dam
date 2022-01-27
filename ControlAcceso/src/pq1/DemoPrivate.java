package pq1;

public class DemoPrivate {
	private void mostrarP() {
		System.out.println("Control de acceso private 1");
	}
	
	public String xxP() {
		mostrarP();
		DemoDefault d = new DemoDefault();
		d.mostrarD();
		String salida = "Control de acceso private 2";
		return salida;
	}
}
