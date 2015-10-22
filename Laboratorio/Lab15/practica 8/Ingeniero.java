public class Ingeniero extends Alumno implements Talachero{
	
	String esGuapo = "Si";

	void crear(){
		System.out.println("Creando al mundo...");
	}

	//override
	void leer(){
		System.out.println("Los inges leen y ya...");
	}

	public void reparar(){
		System.out.println("Reparando...");
	}

}