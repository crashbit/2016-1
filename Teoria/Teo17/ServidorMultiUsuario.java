import java.net.*;
import java.io.*;

public class ServidorMultiUsuario{
	public static final Proceso arreglo[] = new Proceso[3];
	
	public static void main(String args[]) throws IOException, UnknownHostException{

		Socket cliente;
		ServerSocket servidor;

		servidor = new ServerSocket(8080);
		System.out.println("Yo soy el servidor...");
		int i = 0;
		while(i<3){

			cliente = servidor.accept();
			(arreglo[i] = new Proceso(cliente, arreglo)).start();
			i++;
		}
		System.out.println("Fin del servidor...");

	}

}