import java.io.*;

public class LeerTeclado{

	public static void main(String args[]) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String cadena;

		System.out.println("Teclea una cadena: ");
		cadena = br.readLine();
		System.out.println("Usted tecleo: " + cadena);

	}


}