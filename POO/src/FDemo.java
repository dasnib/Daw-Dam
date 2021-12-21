
public class FDemo {
	int x;
	
		FDemo(int y) {
			x = y;
			System.out.println("Creado objeto " + x);
		}
		protected void finalize() {
			System.out.println("Finalizing " + x);
		}
}
