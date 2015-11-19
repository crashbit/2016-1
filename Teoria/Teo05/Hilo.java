import java.net.*;
import java.io.*;

public class Hilo extends Thread{
	Socket cliente;
	InputStreamReader isr;
	BufferedReader entrada;
	PrintWriter salida;
	String cadena;
	static Hilo arreglo[];
	String nickname;

	public Hilo(Socket cliente, Hilo arreglo[]){
		this.cliente = cliente;
		this.arreglo = arreglo;
	}


	public void run(){
		int i=0;
		try{

			System.out.println("1 user connected, :D");

			isr = new InputStreamReader(cliente.getInputStream());
			entrada = new BufferedReader(isr);
			salida = new PrintWriter(cliente.getOutputStream());

			salida.println("Bienvenido vato!!, teclea tu nickname :)");
			salida.flush();

			nickname = entrada.readLine();
			for(i=0; i< 3; i++){
				if(arreglo[i]!=null && arreglo[i]!= this){
					System.out.println("Acaba de entrar " + nickname);
					arreglo[i].salida.println("Acaba de entrar " + nickname);
					arreglo[i].salida.flush();
				}
			}

			while(true){
				cadena= entrada.readLine();
				
				for(i=0; i< 3; i++){
				if(arreglo[i]!=null && arreglo[i]!= this){
					System.out.println(nickname + " dijo>  " + cadena);
					arreglo[i].salida.println(nickname + " dijo> " + cadena);
					arreglo[i].salida.flush();
				}
			}

			}

			// cliente.close();
			// salida.close();
			// entrada.close();
		}catch(IOException e){

		}

	}


}