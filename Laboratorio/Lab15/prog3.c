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

	for(i = 0; i< n; i++){
		fi = (struct Alumno *)malloc(sizeof(struct Alumno));
		fi->edad = 20;
		fi->sexo = 'M';
		strcpy(fi->nombre, "Brayan");

		printf("%s %c %d", fi->nombre, fi->sexo, fi->edad);
	}
	free(fi);
}






