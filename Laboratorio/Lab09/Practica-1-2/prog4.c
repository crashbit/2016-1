#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(){

	struct Alumno{
		char nombre[20];
		int edad;
		char sexo;
	};

	struct Alumno *fi;
	fi = (struct Alumno *)malloc(sizeof(struct Alumno));
	fi->edad = 20;
	fi->sexo ='M';
	strcpy(fi->nombre, "Bryan");

	printf("\n %s %c %d", fi->nombre, fi->sexo, fi->edad);

}



