import java.io.*;

public class EscribirArchivo{
	
	public static void main(String args[]) throws IOException {

		FileWriter fw = new FileWriter("archivonuevo.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		

		bw.write("Este es un contenido");
		bw.close();


	}
}