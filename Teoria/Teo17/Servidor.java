import java.net.*;
import java.io.*;

public class Servidor{
	
	public static void main(String args[]) throws IOException, UnknownHostException{

		Socket cliente;
		ServerSocket servidor;
		InputStreamReader entrada;
		BufferedReader br;
		String cadena;
		PrintWriter salida;

		servidor = new ServerSocket(8080);
		System.out.println("Yo soy el servidor...");
		int i = 0;
		while(i<3){


			cliente = servidor.accept();

			i++;
		}
		System.out.println("Fin del servidor...");

	}

}