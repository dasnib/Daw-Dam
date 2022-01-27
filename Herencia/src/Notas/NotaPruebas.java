package Notas;

public class NotaPruebas {

	public static void main(String[] args) {
				
		BlocNotas bn1 = new BlocNotas(4);
		bn1.rellenarBloc();
		bn1.listarNotas();
		System.out.println();
		
		System.out.println("La lista de notas contiene " + bn1.numNotas() + " notas");
		
		bn1.borrarNota();
		
		bn1.listarNotas();
		
		bn1.rellenarBloc();
		
		bn1.listarNotas();
		

	}

}
