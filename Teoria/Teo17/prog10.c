#include <stdio.h>
#include <string.h>

int main(){

	struct Alumno{
		char nombre[20];
		char sexo;
		int edad;
	};

	struct Alumno fi[12300];

	fi[2].sexo = 'M';
	fi[2].edad = 21;
	strcpy(fi[2].nombre, "Caroline");

	printf("\n %s %c %d", fi[2].nombre, fi[2].sexo, fi[2].edad);
}