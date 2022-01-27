package pq1;

public class test1 {

	public static void main(String[] args) {
		DemoPrivate dp = new DemoPrivate();
		System.out.println(dp.xxP());
		//dp.mostrar();		Al ser privado, este método no se puede usar en otra clase
		
		DemoProtected dpro = new DemoProtected();
		dpro.mostrarProtec();
	}

}
