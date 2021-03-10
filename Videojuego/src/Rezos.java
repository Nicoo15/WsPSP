
public class Rezos extends Arma {
	
	
	public Rezos(int danoespecial, String tipoAtaque) {
		super(danoespecial, tipoAtaque);
	}

	public void usar() {
		System.out.println("Ameeeen");
		System.out.println("Tipo: " + getTipoAtaque() + " daño: " + getDanoespecial());
	}

}
