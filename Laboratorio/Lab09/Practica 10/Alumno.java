public class Alumno{
	
	void reprobar(int calificacion)throws ArithmeticException{
		System.out.println(calificacion/0);
	}

	void evaluar(int calificacion) throws CalificacionException{
		if(calificacion < 6){
			throw new CalificacionException("Alumno reprobado!!!! ");
		}

	}

}