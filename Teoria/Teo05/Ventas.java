public class Ventas{
	
	public static void main(String args[]){
		String producto="";
		String cantidad="";
		try{
			producto = args[0];
			cantidad = args[1];
			System.out.println("Usted quiere " + producto + " " + cantidad +" unidades");
		}catch(ArrayIndexOutOfBoundsException var){
			System.out.println("Te hace falta los parametros producto y cantidad");
		}finally{
			System.out.println("Gracias por usar el sistema :) ");
		}
	}


}