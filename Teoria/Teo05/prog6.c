#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
	struct Alumno{
		char nombre[20];
		int edad;
		char sexo;
		struct Alumno *sig;
	};

	int n=5, i;
	struct Alumno *fi, *inicio;
	inicio = (struct Alumno *)malloc(sizeof(struct Alumno));
	inicio->sig = NULL;
	for(i=0;i<n;i++){
		fi = (struct Alumno *)malloc(sizeof(struct Alumno));
		fi->sig = inicio->sig;
		inicio->sig = fi;
		printf("Teclea un nombre: ");
		gets(fi->nombre);
	}

	struct Alumno *temp;
	temp = inicio->sig;
	while(temp !=  NULL){
		printf("%s ",temp->nombre);
		temp = temp->sig;
	}

}





