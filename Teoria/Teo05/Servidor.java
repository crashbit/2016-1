import java.net.*;
import java.io.*;

public class Servidor{
	
	public static void main(String args[])throws IOException, UnknownHostException{

		ServerSocket servidor;
		Socket cliente;
		InputStreamReader isr;
		BufferedReader entrada;
		PrintWriter salida;
		String cadena;
		int i = 0;

		servidor = new ServerSocket(9090);
		System.out.println("Server up and running!! :D");
		while(i < 3){

			cliente = servidor.accept();
			System.out.println("1 user connected, :D");

			isr = new InputStreamReader(cliente.getInputStream());
			entrada = new BufferedReader(isr);
			salida = new PrintWriter(cliente.getOutputStream());

			salida.println("Bienvenido vato!!, teclea algo :)");
			salida.flush();

			cadena = entrada.readLine();
			System.out.println("El vato tecleo " + cadena);
			salida.println("Ey ese, usted tecleo: " + cadena);
			salida.flush();

			cliente.close();
			salida.close();
			entrada.close();

			i++;
		}


	}
}