public class Proceso implements Runnable{

	private static int totalHilos = 0;
	int contador = 10;
	int id;
	int tiempo = 1000;

	public Proceso(int tiempo){
		totalHilos = totalHilos + 1;
		id = totalHilos;
		this.tiempo = tiempo;
	}

	public String toString(){
		return "Hilo " + id + ": " + contador;
	}


	public void run(){
		while(contador > 0){
			System.out.println(this);
			contador--;
			// try{
			// 	sleep(tiempo);
			// }catch(InterruptedException e){

			// }
		}
	}

}