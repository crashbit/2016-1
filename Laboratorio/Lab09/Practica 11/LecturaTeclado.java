import java.io.*;

public class LecturaTeclado{
	
	public static void main(String args[]) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String cadena;
		cadena = "";
		while(cadena.compareTo("salir")!=0){
			System.out.println("Teclea algo: :)");
			cadena = br.readLine();
			System.out.println("usted tecleo: " + cadena);
		}

	}
}