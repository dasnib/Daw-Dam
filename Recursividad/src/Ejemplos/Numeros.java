package Ejemplos;

public class Numeros {
	public static int calcularPotenciaR(int base, int exp) {// >=0
		int sol;
		if (exp == 0) {
			return 1;
		}
		sol = base * calcularPotenciaR(base, exp - 1);
		return sol;

	}

	public static String inversorR(String pal) {
		String sol = "";
		if (pal.length() == 0 || pal.length() == 1) {// casos base
			sol = pal;
		} else {// llamada recursiva
			sol +=pal.substring(pal.length()-1,pal.length());
		}
		return sol;
	}

}
