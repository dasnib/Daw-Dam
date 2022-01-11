package pq1;

public class Triangulo extends Forma2D{
	String estilo;
	
	public Triangulo(String estilo, double w, double h) {
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
