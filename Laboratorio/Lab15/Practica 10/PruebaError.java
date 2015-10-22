public class PruebaError{
	
	public static void main(String args[]){
		try{	
			String param = args[0];
			System.out.println("El parametro es:" + param);

			Alumno fer = new Alumno();
			fer.evalua(4);

		}catch(ArrayIndexOutOfBoundsException var){
			System.out.println("Falta parámetro");
		}catch(AlumnoException var){
			System.out.println("Alumnito reprobado");
		}finally{
			System.out.println("Gracias por participar :)");
		}

	}
}