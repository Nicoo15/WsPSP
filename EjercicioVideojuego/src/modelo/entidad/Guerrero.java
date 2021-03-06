package modelo.entidad;

public class Guerrero extends Personaje {
	private int fuerza;

	@Override
	public void atacar(Personaje p) {
		// TODO Auto-generated method stub

		int danototal = 0;
		if (this.getArma() instanceof Espada || this.getArma() instanceof Arco) {
			danototal = getArma().usar() + fuerza;
		} else {
			danototal = getArma().usar();
		}
		System.out.println("Guerrero hace:" + danototal);
		p.setPuntosVida(p.getPuntosVida() - danototal);
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

}
