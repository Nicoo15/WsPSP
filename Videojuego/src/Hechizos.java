
public class Hechizos extends Arma {

	public Hechizos(int danoespecial, String tipoAtaque) {
		super(danoespecial, tipoAtaque);
	}

	public void usar() {
		System.out.println("WEeeeeeee");
		System.out.println("Tipo: " + getTipoAtaque() + " daño: " + getDanoespecial());
	}

}