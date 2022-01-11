package pq1;

public class Forma2D {
	private double width;
	private double height;
	
	public Forma2D(double w, double h) {
		width = w;
		height = h;
	}
	
	public Forma2D(double w) {
		width = w;
		height = 3.0;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	void showDim () {
		System.out.println("Width and height are " + width + " and " + height);
	}
}
