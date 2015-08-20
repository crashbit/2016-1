#include <stdio.h>
#include <string.h>

int main(){
	
	struct Alumno{
		char nombre[20];
		int edad;
		char sexo;
	};

	int n = 2;
	struct Alumno *fi;

	fi.edad = 20;
	fi.sexo ='M';
	strcpy(fi.nombre, "Bryan");

	printf("\n %s %c %d", fi.nombre, fi.sexo, fi.edad);

}






