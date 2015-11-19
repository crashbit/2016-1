import java.net.*;
import java.io.*;

public class Cliente{
	
	public static void main(String args[])throws UnknownHostException, IOException{

		Socket cliente;
		InputStreamReader isr;
		BufferedReader entrada;
		PrintWriter salida;
		String cadena;

		cliente = new Socket("localhost", 80);

		isr = new InputStreamReader(cliente.getInputStream());
		entrada = new BufferedReader(isr);
		salida = new PrintWriter(cliente.getOutputStream());

		salida.println("get index.html");
		salida.flush();

		cadena = entrada.readLine();

		while(cadena != null){
			System.out.println(cadena);
			cadena = entrada.readLine();
		}

		salida.close();
		entrada.close();
		cliente.close();

	}
}