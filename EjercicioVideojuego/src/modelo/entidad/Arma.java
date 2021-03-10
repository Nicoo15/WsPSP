package modelo.entidad;

public class Arma {
	private int danomin;
	private int danomax;
	private String tipo;

	public int usar() {
		int danocausado = Util.generadorAleatorio(danomin, danomax);
		return danocausado;

	}

	public int getDanomin() {
		return danomin;
	}

	public void setDanomin(int danomin) {
		this.danomin = danomin;
	}

	public int getDanomax() {
		return danomax;
	}

	public void setDanomax(int danomax) {
		this.danomax = danomax;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
