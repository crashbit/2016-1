public class Proceso extends Thread{
	private int contador = 10;
	private static int hilos = 0;
	private int tiempo = 1000;

	public Proceso(int prioridad){
		super("Hilo " + ++hilos);
		setPriority(prioridad);
	}

	public Proceso(int tiempo){
		this.tiempo = tiempo;
	}

	public String toString(){
		return getName() + " : " + contador;
	}

	public void run(){
		while(contador > 0){
			System.out.println(this);
			contador--;
			try{
				sleep(1000);
			}catch(InterruptedException var){

			}
		}
	}

}