import java.io.*;
import java.net.*;


public class ServidorMultiUsuario{
	
	public static void main(String args[])throws UnknownHostException, IOException{
		
		ServerSocket servidor;
		Socket cliente;
		int i = 0;

		servidor = new ServerSocket(9999);
		
		while(i< 3){

			cliente = servidor.accept();
			Hilo hilo = new Hilo(cliente);
			hilo.start();
			
		}

	}

}
