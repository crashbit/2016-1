public class PruebaProceso2{
	
	public static void main(String args[]){
		int i;
		Thread hilo;
		Thread hilo9, hilo10;
		for( i = 0; i< 8; i++){
			hilo = new Thread(new Proceso2());
			hilo.start();
		}

		hilo9 = new Thread(new Proceso2(2000));
		hilo10 = new Thread(new Proceso2(500));

		hilo9.start();
		hilo10.start();

	}

}