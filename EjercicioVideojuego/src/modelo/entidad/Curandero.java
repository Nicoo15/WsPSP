package modelo.entidad;

public class Curandero extends Personaje {
	private int sabiduria;

	@Override
	public void atacar(Personaje p) {
		// TODO Auto-generated method stub

		int danototal = 0;
		if (this.getArma() instanceof Rezo) {
			danototal = getArma().usar() + sabiduria;
		} else {
			danototal = getArma().usar();
		}
		System.out.println("Curandero hace:" + danototal);
		p.setPuntosVida(p.getPuntosVida() - danototal);
	}

	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}

}
