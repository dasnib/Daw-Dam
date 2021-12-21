
public class metodo {
	public static int suma(int n1, int n2) {
		return n1 + n2;
	}
	public static void main(String[] args) {
		int num;
		for (int i=1 ; i<11 ; i++) {
			num = (int) (Math.random() * 100);
			System.out.print(num + "\t");
			System.out.println(suma(i,num));
		}
		
	}

}
