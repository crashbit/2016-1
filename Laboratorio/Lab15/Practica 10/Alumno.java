public class Alumno{
	
	void evalua(int calificacion)throws AlumnoException{
		if(calificacion <=5){
			throw new AlumnoException();
		}
	}

}