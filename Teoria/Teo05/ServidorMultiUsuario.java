import java.net.*;
import java.io.*;

public class ServidorMultiUsuario{
	
	static Hilo arregloHilos[] = new Hilo[3];

	public static void main(String args[])throws IOException, UnknownHostException{

		ServerSocket servidor;
		Socket cliente;
		
		int i = 0;

		servidor = new ServerSocket(9090);
		System.out.println("Server up and running!! :D");
		while(i < 3){

			cliente = servidor.accept();

			arregloHilos[i] = new Hilo(cliente, arregloHilos);
			arregloHilos[i].start();
			

			i++;
		}


	}
}