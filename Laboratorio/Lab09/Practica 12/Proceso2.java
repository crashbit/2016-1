public class Proceso2 implements Runnable{
	private int contador = 10;
	private static int hilos = 0;
	private int tiempo = 1000;
	private String id;

	public Proceso2(){
		hilos++;
		id = "Hilo " + hilos;
	}

	public Proceso2(int tiempo){
		hilos++;
		id = "Hilo " + hilos;
		this.tiempo = tiempo;
	}

	// public String toString(){
	// 	return getName() + " : " + contador;
	// }

	public void run(){
		while(contador > 0){
			System.out.println(id + ": " + contador);
			contador--;
			try{
				Thread.sleep(1000);
			}catch(InterruptedException var){

			}
		}
	}

}