#include <stdio.h>
#include <string.h>

int main(){
	
	struct Alumno{
		char nombre[20];
		char sexo;
		int edad;
	};

	struct Alumno puma;

	puma.sexo = 'M';
	puma.edad = 21;
	strcpy(puma.nombre, "Caroline");

	printf("\n %s %c %d", puma.nombre, puma.sexo, puma.edad);
}