package Ejercicio_otraHoja_3;

public class Password {
	private int longitud;
	private String clave;
	
	public Password() {
		this.longitud = 8;
		this.clave = GenerarPassword();
	}
	
	public Password (int longitud) {
		this.longitud = longitud;
		this.clave = GenerarPassword();
	}
	
	public String GenerarPassword () {
		String numeros = "0123456789";
		String especiales = "!$·%&?¿";
		String letras = "abcdefghijklmnñopqrstuvwxyz";
		String cadena = "";
		//int num = 0;
		//int esp = 0;
		//int letr = 0;
		
		for (int i = 0; i < 5; i++) {
			int random = (int)(Math.random()*numeros.length());
			cadena += numeros.charAt(random);
		}
		
		for (int i = 0; i < 2; i++) {
			int random = (int)(Math.random()*letras.length());
			cadena += letras.charAt(random);
		}
		cadena = cadena.toUpperCase();
		int random =((int)(Math.random()*letras.length()));
		cadena += letras.substring(random, random+1);
		
		for (int i = 0; i < longitud-cadena.length()+1; i++) {
			int random2 = (int)(Math.random()*especiales.length());
			cadena += especiales.charAt(random2);
		}
		cadena = cadena.substring(0,longitud);
		return cadena;
	}

	public String toString() {
		return "Password [longitud=" + longitud + ", clave=" + clave + "]";
	}
	
	
}
