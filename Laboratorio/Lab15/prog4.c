#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(){

	struct Alumno{
		char nombre[20];
		int edad;
		char sexo;
		struct Alumno *sig;
	};
	int n = 3, i;
	struct Alumno *fi, *inicio;
	inicio = (struct Alumno *)malloc(sizeof(struct Alumno));
	inicio->sig = NULL;
	n = 3;
	for(i = 0; i< n; i++){
		fi = (struct Alumno *)malloc(sizeof(struct Alumno));
		fi->sig = NULL;
		fi->sig = inicio->sig;
		inicio->sig = fi;
		fi->edad = 20;
		fi->sexo = 'M';
		printf("Metele un nombre:");
		gets(fi->nombre);
		//strcpy(fi->nombre, "Brayan");
	}
	
	struct Alumno *temp = inicio;
	while(temp  != NULL){
		printf("\n%s", temp->nombre);
		temp = temp->sig;
	}

}








