
public class Animal {
	boolean se_me_cuida;
	boolean sos_tremendo_pudu;
	String tipo_peinado;
	int numero_estomagos;
	boolean Cryptomaniaco;
	
	/**
	 * @return el se_me_cuida
	 */
	public boolean isSe_me_cuida() {
		return se_me_cuida;
	}
	/**
	 * @param se_me_cuida el se_me_cuida a establecer
	 */
	public void setSe_me_cuida(boolean se_me_cuida) {
		this.se_me_cuida = se_me_cuida;
	}
	/**
	 * @return el sos_pudu
	 */
	public boolean isSos_pudu() {
		return sos_tremendo_pudu;
	}
	/**
	 * @param sos_pudu el sos_pudu a establecer
	 */
	public void setSos_pudu(boolean sos_pudu) {
		this.sos_tremendo_pudu = sos_pudu;
	}
	/**
	 * @return el tipo_peinado
	 */
	public String getTipo_peinado() {
		return tipo_peinado;
	}
	/**
	 * @param tipo_peinado el tipo_peinado a establecer
	 */
	public void setTipo_peinado(String tipo_peinado) {
		this.tipo_peinado = tipo_peinado;
	}
	/**
	 * @return el numero_estomagos
	 */
	public int getNumero_estomagos() {
		return numero_estomagos;
	}
	/**
	 * @param numero_estomagos el numero_estomagos a establecer
	 */
	public void setNumero_estomagos(int numero_estomagos) {
		this.numero_estomagos = numero_estomagos;
	}

	/**
	 * @param invierte_en_cryptos el invierte_en_cryptos a establecer
	 */
	public void setInvierte_en_cryptos(boolean invierte_en_cryptos) {
		this.Cryptomaniaco = invierte_en_cryptos;
	}
	public Animal(boolean se_me_cuida, boolean sos_pudu, String tipo_peinado, int numero_estomagos,
			boolean invierte_en_cryptos) {
		super();
		this.se_me_cuida = se_me_cuida;
		this.sos_tremendo_pudu = sos_pudu;
		this.tipo_peinado = tipo_peinado;
		this.numero_estomagos = numero_estomagos;
		this.Cryptomaniaco = invierte_en_cryptos;
	}
	
	public int pudu_empresario (boolean pudu, boolean crypto) {
		if (pudu & crypto) {
			System.out.println("Sos un berdadero Pudu, recapo amigo");
			return 1;
		}
		else {
			return 0;
		}
	}
	
}
