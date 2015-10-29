import java.io.*;
import java.net.*;

public class Hilo extends Thread{

	Socket cliente;
	InputStreamReader isr;
	BufferedReader entrada;
	PrintWriter salida;
	String cadena;

	public Hilo(Socket cliente){
		this.cliente = cliente;
	}

	public void run(){
		try{
			isr = new InputStreamReader(cliente.getInputStream());
			entrada = new BufferedReader(isr);

			salida = new PrintWriter(cliente.getOutputStream());

			salida.println("Chacales...");
			salida.flush();

			cadena = entrada.readLine();
			System.out.println("Un chaca escribio: " + cadena);

			entrada.close();
			salida.close();
			cliente.close();


		}catch(IOException var){

		}
	}

}