package Ejercicio1;
import java.util.Scanner;

public class Calculo {
	
		public synchronized void factorial(){
			Scanner sc = new Scanner(System.in);
			int numero1 = sc.nextInt();
			int factorial =1;
			while ( numero1!=0) {
				  factorial=factorial*numero1;
				  numero1--;
				System.out.println("factorial");
			}
			System.out.println(factorial);

	}
}
