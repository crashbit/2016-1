import java.io.*;

public class LeerTeclado{
	
	public static void main(String args[]){

		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader entrada = new BufferedReader(teclado);
		String cadena;

		System.out.println("Teclea algo: ");
		cadena = entrada.readLine();
		System.out.println("Tecleaste: " + cadena);


	}

}