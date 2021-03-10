package modelo.entidad;

public class Mago extends Personaje { // codigo pegamento, dependencia fuerte
	private int inteligencia;

	@Override
	public void atacar(Personaje p) {
		// TODO Auto-generated method stub

		int danototal = 0;
		if (this.getArma() instanceof Hechizo) {
			danototal = getArma().usar() + inteligencia;
		} else {
			danototal = getArma().usar();
		}
		System.out.println("Mago hace:" + danototal);
		p.setPuntosVida(p.getPuntosVida() - danototal);
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

}
