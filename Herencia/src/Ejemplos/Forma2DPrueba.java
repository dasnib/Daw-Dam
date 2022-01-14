package Ejemplos;

public class Forma2DPrueba {

	public static void main(String[] args) {
		Forma2D miForma = new Forma2D(2.3);
		miForma.setWidth(12.5);
		miForma.setHeight(1.3);
		miForma.showDim();
		System.out.println();
		
		Forma2DTriangulo t1 = new Forma2DTriangulo("Doble linea", 2.3, 4.5);
		t1.showDim();
		System.out.println("Area " + t1.area());
		t1.showStyle();
	}

}