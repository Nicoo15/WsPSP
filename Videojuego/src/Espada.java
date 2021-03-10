
public class Espada extends Arma {

	public Espada(int danoespecial, String tipoAtaque) {
		super(danoespecial, tipoAtaque);
	}

	public void usar() {
		System.out.println("Swannnnnnggg");
		System.out.println("Tipo: " + getTipoAtaque() + " daño: " + getDanoespecial());
	}

}
