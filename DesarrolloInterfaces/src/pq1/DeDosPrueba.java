package pq1;

public class DeDosPrueba {

	public static void main(String[] args) {
		DeDos d = new DeDos();
		d.reset();
		System.out.println(d.getNext());
		d.setStart(12);
		System.out.println(d.getNext());
		
		Alumno a1 = new Alumno("65782312Z", 6, 8);
		System.out.println(a1);
		a1.setStart(4);
		System.out.println(a1.getNext());
	}

}
