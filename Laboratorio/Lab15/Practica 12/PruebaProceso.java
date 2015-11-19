public class PruebaProceso{
	
	public static void main(String args[]){

		Proceso hilo = new Proceso(500);
		Thread otroHilo = new Thread(new Proceso(2000));
		//hilo.start();
		otroHilo.start();
	}
}