package modelo.entidad;

public class Rezo extends Arma {

	private int magiacaotica;

	@Override
	public int usar() {
		// TODO Auto-generated method stub
		int danogeneral = super.usar();
		int numAleatorio = Util.generadorAleatorio(1, 100);
		if (numAleatorio <= magiacaotica) {
			System.out.println("MAGIA CAOTICA, CUARANDERO USO REZO");
			danogeneral = danogeneral * 2;

		}
		return danogeneral;

	}

	public int getMagiacaotica() {
		return magiacaotica;
	}

	public void setMagiacaotica(int magiacaotica) {
		this.magiacaotica = magiacaotica;
	}

}
