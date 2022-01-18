package Clase12;

public class EmpleadoComercialPrueba {

	public static void main(String[] args) {
		EmpleadoComercial c1 = new EmpleadoComercial("Juan");
		System.out.println(c1.getCiudad());
		System.out.println(c1 + "\n");

		EmpleadoComercial c2 = new EmpleadoComercial("Pepon Pig", 33635743, 10000, "Villa Cerdo", "IPig,Tableto,TV Olé");
		System.out.println(c2.getCiudad());
		System.out.println(c2);
		
		c2.vendeProductos("Remolque Manual F560 con suspensión hidraúlica y amortigüación prensada");
		c2.sumarVenta(14500.0);
		System.out.println(c2 + "\n");
		
		System.out.println("---- Lista de Productos ----");
		c2.getProductosVendidos();
		for (String listaProductos : c2.getProductosVendidos()) {
			System.out.println(listaProductos);
		}
	}

}
