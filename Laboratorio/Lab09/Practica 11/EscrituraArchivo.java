import java.io.*;

public class EscrituraArchivo{
	
	public static void main(String args[]) throws IOException{

		FileWriter archivo = new FileWriter("hola.txt");
		//InputStreamReader isr = new InputStreamReader(archivo);
		//BufferedReader br = new BufferedReader(archivo);
		
		archivo.append("Hola mundo");
		archivo.close();
	}
}



