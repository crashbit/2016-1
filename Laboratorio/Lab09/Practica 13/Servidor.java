import java.io.*;
import java.net.*;


public class Servidor{

	public static void main(String args[])throws UnknownHostException, IOException{
		
		ServerSocket servidor;
		Socket cliente;
		InputStreamReader isr;
		BufferedReader entrada;
		PrintWriter salida;
		String cadena;
		int i = 0;

		servidor = new ServerSocket(9999);
		
		while(i< 3){

			cliente = servidor.accept();

			isr = new InputStreamReader(cliente.getInputStream());
			entrada = new BufferedReader(isr);

			salida = new PrintWriter(cliente.getOutputStream());

			salida.println("Bienvenido chaca #:)"+ (i+1));
			salida.flush();

			salida.println("Teclea algo: ");
			salida.flush();
			cadena = entrada.readLine();
			System.out.println("El chaca tecleo: " + cadena);
			salida.println("Tu tecleaste: " + cadena);
			salida.flush();

			entrada.close();
			salida.close();
			cliente.close();
			i++;
			
		}

	}

}









