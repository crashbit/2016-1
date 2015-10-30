import java.net.*;
import java.io.*;

public class Proceso extends Thread{

	Socket cliente;
	InputStreamReader entrada;
	BufferedReader br;
	String cadena, nickname;
	PrintWriter salida;
	Proceso arreglo[];


	public Proceso(Socket cliente, Proceso arr[]){
		this.cliente = cliente;
		this.arreglo = arr;
	}

	public void run(){
		int i;
		try{

			salida = new PrintWriter(cliente.getOutputStream());
			entrada = new InputStreamReader(cliente.getInputStream());
			br = new BufferedReader(entrada);

			salida.println("Hola cliente, cual es tu nickname?");
			salida.flush();

			nickname = br.readLine();
			salida.println("Bienvenido " + nickname);
			salida.flush();

			for(i=0; i<3 ;i++){
				if(arreglo[i]!=null && arreglo[i]!= this){
					arreglo[i].salida.println("Acaba de entrar un nuevo usuario...");
					arreglo[i].salida.flush();
				}
			}

			while(true){
				cadena = br.readLine();
				if(cadena.compareTo("quit")==0) break;
				for(i=0; i<3 ;i++){
					if(arreglo[i]!=null && arreglo[i]!= this){
						arreglo[i].salida.println( nickname + " dijo:" + cadena);
						arreglo[i].salida.flush();
					}
				}
			}

			for(i=0; i<3 ;i++){
				if(arreglo[i]!=null && arreglo[i]!= this){
					arreglo[i].salida.println("Acaba de irse " + nickname);
					arreglo[i].salida.flush();
				}
			}

			// salida.close();
			// br.close();
			// cliente.close();
		}catch(IOException var){
			System.out.println("Error de I/O");
		}
	}


}