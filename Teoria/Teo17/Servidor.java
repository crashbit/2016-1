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
		cliente = servidor.accept();

		salida = new PrintWriter(cliente.getOutputStream());
		entrada = new InputStreamReader(cliente.getInputStream());
		br = new BufferedReader(entrada);

		salida.println("Hola, ¡¡que tal!!");
		salida.flush();

		cadena = br.readLine();
		salida.println("Cadena: " + cadena);

		// while(cadena != null){
		// 	System.out.println(cadena);
		// 	cadena = br.readLine();
		// }

		salida.close();
		br.close();
		cliente.close();
	}

}