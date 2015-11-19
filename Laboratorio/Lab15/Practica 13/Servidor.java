import java.net.*;
import java.io.*;

public class Servidor{
	
	public static void main(String args[])throws UnknownHostException, IOException{

		ServerSocket servidor;
		Socket cliente;
		InputStreamReader isr;
		BufferedReader entrada;
		PrintWriter salida;
		String cadena;

		servidor = new ServerSocket(8080);
		System.out.println("Servidor listo...");
		cliente = servidor.accept();

		System.out.println("Un cliente conectado...");

		isr = new InputStreamReader(cliente.getInputStream());
		entrada = new BufferedReader(isr);
		salida = new PrintWriter(cliente.getOutputStream());

		salida.println("Saludos buen alumno!!");
		salida.flush();

		cadena = entrada.readLine();
		salida.println("Usted escribio: " + cadena);
		System.out.println("El usuario escribio: " + cadena);
		
		salida.close();
		entrada.close();
		cliente.close();

	}
}