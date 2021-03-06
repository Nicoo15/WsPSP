package main;

import java.util.ArrayList;
import java.util.List;

import modelo.entidad.*;
import modelo.negocio.*;

public class ClasePrincipal {

	public static void main(String[] args) {
		Guerrero p1 = new Guerrero();
		Arco arco = new Arco();

		Curandero p2 = new Curandero();
		Rezo rezo = new Rezo();

		Mago p3 = new Mago();
		Hechizo hechizo = new Hechizo();

		arco.setDanomax(25);
		arco.setDanomin(10);
		arco.setMagiacaoatica(20);

		p1.setNombre("Ragnar");
		p1.setArma(arco);
		p1.setPuntosVida(150);
		
		

		rezo.setDanomax(35);
		rezo.setDanomin(5);
		rezo.setMagiacaotica(20);

		p2.setNombre("Rollo");
		p2.setArma(rezo);
		p2.setPuntosVida(200);
		;

		hechizo.setDanomax(30);
		hechizo.setDanomin(7);
		hechizo.setMagiacaoatica(10);
		
		p3.setNombre("Loki");
		p3.setArma(hechizo);
		p3.setPuntosVida(130);
		

		List<Personaje> listaPersonajes = new ArrayList<Personaje>();
		listaPersonajes.add(p1);
		listaPersonajes.add(p2);
		listaPersonajes.add(p3);

		int contrincante1 = Util.generadorAleatorio(0, 2);
		int contrincante2 = 0;

		do {
			 contrincante2 = Util.generadorAleatorio(0, 2);
		} while (contrincante1 == contrincante2);
		
		Personaje luchador1 = listaPersonajes.get(contrincante1);
		Personaje luchador2 = listaPersonajes.get(contrincante2);
		
		Arena arena = new Arena(luchador1,  luchador2);
		Personaje pg = arena.combate();

		System.out.println("Ha ganado la batalla" + pg.getNombre());
	}

}
