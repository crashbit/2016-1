public class Errores{
	
	public static void main(String args[]){
		try{
			int i = 1/0;
			System.out.println(i);
			System.out.println(args[1]);
		}catch(ArithmeticException var){
			System.out.println("Error, eso no se puede :P");
		}catch(ArrayIndexOutOfBoundsException var){
			System.out.println("Te falta un parametro");
		}finally{
			System.out.println("Bloque finally");
		}
	}
}