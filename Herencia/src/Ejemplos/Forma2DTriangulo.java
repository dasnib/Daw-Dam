package Ejemplos;

public class Forma2DTriangulo extends Forma2D{
	String estilo;
	
	public Forma2DTriangulo(String estilo, double w, double h) {
		super(w,h);
		this.estilo = estilo;
		setHeight(h);
		setWidth(w);
	}
	double area() {
		return getWidth() * getHeight() / 2;
	}
	void showStyle() {
		System.out.println("El triangulo es "+ estilo);
	}
}
