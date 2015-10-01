

public class Alumno{
	private String nombre;
	int edad;

	public Alumno(){
		nombre = "nadie";
		edad = 0;
	}

	public Alumno(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return this.nombre;
	}

	public String toString(){
		return "Yo me llamo " + nombre + " y mi edad es: " + edad;
	}

	void leer(){
		System.out.println("...Leyendo...");
	}

	void escribir(){
		System.out.println("...Escribiendo...");
	}

}