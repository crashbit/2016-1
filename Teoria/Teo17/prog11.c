#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(){

	struct Alumno{
		char nombre[20];
		char sexo;
		int edad;
		struct Alumno *sig;
	};

	int i;
	struct Alumno *fi, *inicio, *temp, actual;

	inicio = (struct Alumno *)malloc(sizeof(struct Alumno));
	inicio->sig = NULL;

	for(i=0;i<3;i++){
		fi = (struct Alumno *)malloc(sizeof(struct Alumno));

		fi->sig = inicio->sig;
		inicio->sig = fi;

		actual = fi;

		printf("Teclea un nombre: ");
		gets(fi->nombre);
	}

	temp = inicio->sig;

	while(temp != NULL){
		printf("%s ", temp->nombre);
		temp = temp->sig;
	}

}