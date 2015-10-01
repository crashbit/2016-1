public class Prueba{
	
	public static void main(String args[]){

		Alumno pedro = new Alumno();
		Alumno karla = new Alumno("Karla", 22);
		Ingeniero paw = new Ingeniero();

		pedro.leer();
		pedro.escribir();

		pedro.setNombre("Josue");

		System.out.println(pedro);
		System.out.println(karla);
		System.out.println(paw);


	}


}