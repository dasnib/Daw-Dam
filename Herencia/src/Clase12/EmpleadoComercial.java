package Clase12;

public class EmpleadoComercial extends Empleado {
	private float totalVentas;
	private String ciudad;
	private String productosVendidos;
	
	public EmpleadoComercial(String nombre, int telefono, float totalVentas, String ciudad, String productosVendidos) {
		super(nombre, telefono);
		this.totalVentas = totalVentas;
		this.ciudad = ciudad;
		this.productosVendidos = productosVendidos;
	}
	
	public EmpleadoComercial(String nombre) {
		super(nombre);
	}

	public String getCiudad() {
		if (ciudad == null) {
			ciudad = "Ciudad desconocida";
		}
		return ciudad;
	}
	
	public void sumarVenta(double importe) {
		totalVentas += importe;
	}
	
	public float getTotalVentas () {
		return totalVentas;
	}
	
	public void vendeProductos (String producto) {
		if (productosVendidos == null) {
			productosVendidos = producto;
		}else {
			productosVendidos += "," + producto;
		}
	}
	
	public String[] getProductosVendidos() {
		return productosVendidos.split(",");
	}
	
	@Override
	public String toString() {
		return "nombre= " + super.getNombre() + "    EmpleadoComercial [totalVentas=" + totalVentas + ", ciudad=" + ciudad + ", productosVendidos="
				+ productosVendidos + "]";
	}
	
	
}
