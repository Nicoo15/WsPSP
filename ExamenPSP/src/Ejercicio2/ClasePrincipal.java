package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

import Ejercicio2.Directores;
import Ejercicio2.Jefes;
import Ejercicio2.Programadores;
import Ejercicio2.Trabajadores;

public class ClasePrincipal {

	public static void main(String[] args) {
		Trabajadores t1 = new Directores();
		Trabajadores t2 = new Jefes();
		Trabajadores t3 = new Programadores();
		
		t1.setNombre("Conan");
		t1.setPuesto("Director");
		
		t2.setNombre("Pepe");
		t2.setPuesto("Jefe");
		
		t3.setNombre("Juan");
		t3.setPuesto("Programador");
		
		List<Trabajadores> listaTrabajadores = new ArrayList<Trabajadores>();
		listaTrabajadores.add(t1);
		listaTrabajadores.add(t2);
		listaTrabajadores.add(t3);
		
		System.out.println(listaTrabajadores);
		

	}
}