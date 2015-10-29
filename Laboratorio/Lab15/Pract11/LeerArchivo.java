import java.io.*;

public class LeerArchivo{
	
	public static void main(String args[])throws IOException{

		FileReader archivo = new FileReader("hola.txt");
		BufferedReader entrada = new BufferedReader(archivo);
		String cadena="";

		do{
		cadena = entrada.readLine();
		System.out.println(cadena);	
		}while(cadena != null);c

		entrada.close();

	}

}