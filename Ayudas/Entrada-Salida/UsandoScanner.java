import java.util.Scanner;

public class UsandoScanner{

	public static void main(String args[]){

		// Creamos un objeto para lectura desde el teclado
		Scanner teclado = new Scanner(System.in);

		// Creamos variables que usaremos
		int entero;
		double flotante;
		String cadena;

		System.out.print("Introduzca una cadena: ");
		cadena = teclado.nextLine();
		System.out.println("Usted tecleo la siguiente cadena: " + cadena);

		System.out.print("Introduzca un numero entero: ");
		entero = teclado.nextInt();
		System.out.println("Su numero " + entero + " multiplicado por 5 da: " + (entero * 5));

		System.out.print("Introduzca un numero del tipo flotante: ");
		flotante = teclado.nextDouble();
		System.out.println("Su numero " + flotante + " multiplicado por 2 da: " + (flotante * 2));

	}

}