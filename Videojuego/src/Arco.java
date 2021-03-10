import java.util.Random;

public class Arco extends Arma {

	public Arco(int danoespecial, String tipoAtaque) {
		super(danoespecial, tipoAtaque);

	}

	public void usar() {
		System.out.println("chiuuuuuuuuuuuuuu");
		System.out.println("Tipo: " + getTipoAtaque() + " daño: " + getDanoespecial());
	}
}
