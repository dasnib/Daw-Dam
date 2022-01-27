package pq1;

public class DemoDefault {
	void mostrarD() {
		System.out.println("Control de acceso default 1");
	}
	public String xxD() {
		mostrarD();
		String salida = "Control de acceso default 2";
		return salida;
	}
}
