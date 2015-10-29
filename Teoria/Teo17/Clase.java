public class Clase extends Thread{
	int total=0;
	int i = 0;
	static int contador = 0;

	public Clase(int total){
		this.total = total;
	}

	public String toString(){
		contador++;
		return "hilo " + contador;
	}
	public void run(){
		while(i< total){
			System.out.println(this + " - " + i);
			i++;
		}
	}

}