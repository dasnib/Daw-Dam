package Ejercicio4;

public class MiString {

	public static String alReves(String cadena) {
		String cadena_inv = "";
		for (int x = cadena.length() - 1; x >= 0; x--) {
			cadena_inv = cadena_inv + cadena.charAt(x);
		}
		return cadena_inv;
	}

	public static String limpiaCaracteres(String frase, String caracteres) {
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < caracteres.length(); j++) {
				if (frase.charAt(i) == caracteres.charAt(j)) {
					frase = frase.replace(frase.charAt(i), '\0');
				}
			}
		}
		return frase;

	}

	public static String quitaTildes(String frase) {
		String tildes = "αινσϊ";
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < tildes.length(); j++) {
				if (frase.charAt(i) == tildes.charAt(j)) {
					switch (j) {
					case 0:
						frase = frase.replace(frase.charAt(i), 'a');
						break;
					case 1:
						frase = frase.replace(frase.charAt(i), 'e');
						break;
					case 2:
						frase = frase.replace(frase.charAt(i), 'i');
						break;
					case 3:
						frase = frase.replace(frase.charAt(i), 'o');
						break;
					case 4:
						frase = frase.replace(frase.charAt(i), 'u');
						break;
					default:
						break;
					}
				}
			}
		}
		return frase;
	}

	public static String quitaTildes2(String frase) {
		frase = frase.replace('α', 'a');
		frase = frase.replace('ι', 'e');
		frase = frase.replace('ν', 'i');
		frase = frase.replace('σ', 'o');
		frase = frase.replace('ϊ', 'u');

		return frase;
	}

	public static boolean esPalindromo(String cad) {
		cad = cad.replace(" ", "");
		if (cad.equals(alReves(cad))) {
			return true;
		}
		return false;
	}

	public static boolean esNumero(String cad) {
		char c;
		int contador_punto = 0;
		for (int i = 0; i < cad.length(); i++) {
			c = cad.charAt(i);// +,-,. son los valores 43,45,46
			if (i == 0 && (c != 45 && c != 43 && c != 46) && (c <= 47 && c >= 58)) {
				return false;
			} else if (i != 0) {
				if ((c <= 47 || c >= 58) && c != 46) {
					return false;
				}

			}
			if (c == 46) {
				contador_punto++;

			}
		}
		if (contador_punto > 1) {
			return false;
		}
		return true;
	}
}