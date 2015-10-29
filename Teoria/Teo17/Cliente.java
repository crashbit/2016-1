import java.net.*;
import java.io.*;

public class Cliente{
	
	public static void main(String args[]) throws IOException, UnknownHostException{

		Socket socket;
		InputStreamReader entrada;
		BufferedReader br;
		String cadena;
		PrintWriter salida;

		
			socket = new Socket("localhost", 80);

		salida = new PrintWriter(socket.getOutputStream());
		entrada = new InputStreamReader(socket.getInputStream());
		br = new BufferedReader(entrada);

		salida.println("get index.html");
		salida.flush();

		cadena = br.readLine();

		while(cadena != null){
			System.out.println(cadena);
			cadena = br.readLine();
		}

		salida.close();
		br.close();
		socket.close();
	}

}