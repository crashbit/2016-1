public abstract class Alumno{
	int id = 0;
	String nombre;
	int edad;
	static int contador = 0;

	public Alumno(){
		edad = 0;
		nombre = "nobody";
		contador = contador +1;
		id = contador;
	}

	public Alumno(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}

	public String toString(){
		return "Yo soy " + nombre + " y mi id es: " + id;
	}

	abstract void leer();

	void escribir(){
		System.out.println("... escribiendo ...");
	}
}



