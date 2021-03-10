package modelo.negocio;

import modelo.entidad.Personaje;

import java.util.Scanner;

public class Arena {
	private Personaje p1;
	private Personaje p2;

	public Arena(Personaje p1, Personaje p2) {
		this.p1 = p1;
		this.p2 = p2;

	}

	public Personaje combate() {
		Personaje ganador = null;
		boolean finalcombate = false;
		
		System.out.println("Inicia el combate: ");
		Scanner sc = new Scanner(System.in);

		do {

			p1.atacar(p2);
			p2.atacar(p1);
			
			if (p2.getPuntosVida() <= 0) {
				return p1;
			}
			if (p1.getPuntosVida() <= 0) {
				return p2;
			}
			System.out.println("Puntos de vida de " + p1.getNombre());
			System.out.println("Vida" + p1.getPuntosVida());
			System.out.println("Puntos de vida de " + p2.getNombre());
			System.out.println("Vida " + p2.getPuntosVida());
			
			
			System.out.println("Pulsa enter para seguir con la batalla");
			System.out.println();
			sc.nextLine();

		} while (!finalcombate);

		return ganador;
	}

}
