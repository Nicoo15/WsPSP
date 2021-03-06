
public class Curanderos extends Personajes {

	private Arma arma;
	private int dano;
	private int num;
	private int numAleatorio;

	public Curanderos(Arma arma, String nombre, int puntosvida, int especial) {
		super(arma, nombre, puntosvida, especial);
	}

	public int ataque() {
		System.out.println("TE MIRO Y TE CURO!");
		getArma().usar();
		num = (int) Math.floor(Math.random() * 9 + 1);
		numAleatorio = (int) Math.floor(Math.random() * 9 + 1);
		if (num == numAleatorio) {
			System.out.println("HABILIDAD ESPECIAL");
			dano = 10000;
			System.out.println("Da?o: " + dano);
		} else {
			if (getArma() instanceof Espada || getArma().getClass() == Arco.class) {
				dano = getArma().getDanoespecial() + getEspecial();
				System.out.println(getNombre() + " ha utilizado un arma de su Atributo especial");
				System.out.println("Da?o: " + dano);
			} else {
				dano = getArma().getDanoespecial();
				System.out.println(getNombre() + " ataque realizado.");
				System.out.println("Da?o : " + dano);
			}
		}
		return dano;
	}

}