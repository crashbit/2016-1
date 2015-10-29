import java.io.*;
import java.util.Scanner;

public class LeerTecladoScanner{
	
	public static void main(String args[])throws IOException{

		Scanner teclado = new Scanner(System.in);
		String cadena;
		int numero;

		System.out.println("Teclea algo: ");
		cadena = teclado.nextLine();
		System.out.println("Tecleaste: " + cadena);

		System.out.println("Teclea un numero: ");
		numero = teclado.nextInt();
		System.out.println("Tu numero * 2 es: " + (numero * 2));
	}

}