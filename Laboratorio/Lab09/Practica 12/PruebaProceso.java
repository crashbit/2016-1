public class PruebaProceso{
	
	public static void main(String args[]){
		int i;
		Thread hilo;
		Thread hilo9, hilo10;
		for( i = 0; i< 8; i++){
			hilo = new Proceso(Thread.MAX_PRIORITY);
			hilo.start();
		}

		hilo9 = new Proceso(2000);
		hilo10 = new Proceso(500);

		hilo9.start();
		hilo10.start();

	}

}