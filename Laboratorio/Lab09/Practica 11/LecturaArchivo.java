import java.io.*;

public class LecturaArchivo{
	
	public static void main(String args[]) throws IOException{

		FileReader archivo = new FileReader("prueba.txt");
		//InputStreamReader isr = new InputStreamReader(archivo);
		BufferedReader br = new BufferedReader(archivo);
		String cadena;
		cadena = "";
		while(cadena != null){
			System.out.println("Teclea algo: :)");
			cadena = br.readLine();
			System.out.println("usted tecleo: " + cadena);
		}

	}
}



