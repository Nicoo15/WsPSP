package modelo.entidad;

public class Hechizo extends Arma {

	private int magiacaoatica;

	@Override
	public int usar() {
		int danogeneral = super.usar();
		int numAleatorio = Util.generadorAleatorio(1, 100);
		if (numAleatorio <= magiacaoatica) {
			System.out.println("MAGIAA CAOTICA, MAGO USO INTELIGENCIA!!");
			danogeneral = danogeneral * 2;
		}
		return danogeneral;
	}

	public int getMagiacaoatica() {
		return magiacaoatica;
	}

	public void setMagiacaoatica(int magiacaoatica) {
		this.magiacaoatica = magiacaoatica;
	}

}
