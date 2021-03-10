package Ejercicio1;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
			Calculo calcular = new Calculo();
			
			HilosSincronizados hilo1 = new HilosSincronizados("el factorial del numero 1 es: ",factorial);
			HilosSincronizados hilo2 = new HilosSincronizados("el factorial del numero 2 es: ", factorial);
			HilosSincronizados hilo3 = new HilosSincronizados("el factorial del numero 3 es: ", factorial);
			HilosSincronizados hilo4 = new HilosSincronizados("el factorial del numero 4 es: ", factorial);
			HilosSincronizados hilo5 = new HilosSincronizados("el factorial del numero 5 es: ", factorial);
			
			Thread t1 = new Thread(hilo1);
			Thread t2 = new Thread(hilo2);
			Thread t3 = new Thread(hilo3);
			Thread t4 = new Thread(hilo4);
			Thread t5 = new Thread(hilo5);
			
			t1.setPriority(1);
			t2.setPriority(2);
			t3.setPriority(3);
			t4.setPriority(4);
			t5.setPriority(5);
			
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();
		}
}