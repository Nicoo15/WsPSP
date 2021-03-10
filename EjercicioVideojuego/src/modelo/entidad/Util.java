package modelo.entidad;

import java.util.concurrent.ThreadLocalRandom;

public class Util {

	public static int generadorAleatorio(int n1, int n2) {
		int num = ThreadLocalRandom.current().nextInt(n1,n2);
		return num;
	}

}
