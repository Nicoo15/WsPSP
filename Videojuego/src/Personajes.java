
public abstract class Personajes {

	private Arma arma;
	private String nombre;
	private int puntosvida;
	private int especial;

	public Personajes(Arma arma, String nombre, int puntosvida, int especial) {
		this.arma = arma;
		this.nombre = nombre;
		this.puntosvida = puntosvida;
		this.especial = especial;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntosvida() {
		return puntosvida;
	}

	public void setPuntosvida(int puntosvida) {
		this.puntosvida = puntosvida;
	}

	public int getEspecial() {
		return especial;
	}

	public void setEspecial(int especial) {
		this.especial = especial;
	}

	public abstract int ataque();

}