package Ejercicio1;

public class HilosSincronizados {
	
	public class HiloSincronizado implements Runnable {
		private int numero1;
		private int numero2;
		private int factorial;
		
		public HiloSincronizado() {
			this.numero1 = numero1;
			this.numero2 = numero2;
			this.factorial=factorial;
		}
		
		@Override
		public void run() {
			factorial.calcular();
			
			
		}

	}

}
