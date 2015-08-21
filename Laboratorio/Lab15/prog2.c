#include <stdio.h>
#include <string.h>

int main(){

	struct Alumno{
		char nombre[20];
		int edad;
		char sexo;
	};
	int n = 2;
	struct Alumno fi[18100];
	fi[n].edad = 20;
	fi[n].sexo = 'M';
	strcpy(fi[n].nombre, "Brayan");

	printf("%s %c %d", fi[n].nombre, fi[n].sexo, fi[n].edad);
}






