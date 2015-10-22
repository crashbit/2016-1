public class Prueba{

	public static void main(String args[]){
		Ingeniero fer = new Ingeniero();
		Medico simi = new Medico();

		Alumno gil = new Ingeniero();

		simi.leer();
		fer.leer();
		gil.leer();
		((Ingeniero) gil).crear();
	
		System.out.println(fer);
		System.out.println(simi);
		System.out.println(gil);
		fer.reparar();

	}

}