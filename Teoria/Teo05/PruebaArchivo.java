import java.io.*;

public class PruebaArchivo{
	
	public static void main(String args[]) throws IOException{

		//InputStreamReader isr = new InputStreamReader(System.in);
		FileReader fr = new FileReader("Hola.txt");
		BufferedReader br = new BufferedReader(fr);

		System.out.println("Teclea... :)");
		String cadena = br.readLine();
		System.out.println(cadena);

		fr.close();

	}
}