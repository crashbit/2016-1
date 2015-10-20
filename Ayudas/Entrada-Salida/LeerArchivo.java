import java.io.*;

public class LeerArchivo{

	public static void main(String args[]) throws IOException{

		FileReader fr = new FileReader("lorem-ipsum.txt");
		BufferedReader br = new BufferedReader(fr);
		String cadena="";

		System.out.println("El archivo contiene");
		while(cadena != null){

			cadena = br.readLine();
			System.out.println(cadena);
		
		}

	}


}