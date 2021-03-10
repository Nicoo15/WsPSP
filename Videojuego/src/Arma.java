
public abstract class Arma {

	private int danoespecial;
	private String tipoAtaque;

	public Arma(int danoespecial, String ataque) {
		this.danoespecial = danoespecial;
		this.tipoAtaque = tipoAtaque;
	}

	public int getDanoespecial() {
		return danoespecial;
	}

	public void setDanoespecial(int danoespecial) {
		this.danoespecial = danoespecial;
	}

	public String getTipoAtaque() {
		return tipoAtaque;
	}

	public void setTipoAtaque(String tipoAtaque) {
		this.tipoAtaque = tipoAtaque;
	}

	public abstract void usar();

}

/*
 * private int daño; private String tipo;
 * 
 * public abstract void usar();
 * 
 * public int getDaño() { return daño; }
 * 
 * public void setDaño(int daño) { this.daño = daño; }
 * 
 * public String getTipo() { return tipo; }
 * 
 * public void setTipo(String tipo) { this.tipo = tipo; }
 * 
 * }
 */