/*
Progama que permite leer datos y colocarlos en un arreglo dinámico manejado por un apuntador a enteros
Además devuelve el total de ceros capturados por el usuario
 */

#include <stdio.h>
#include <stdlib.h>

int main(){
	/*Declaramos nuestras variables */

	int *p; //manejará los datos que sean capturados por el usuario
	int n; //manejará el total de datos que el usuario desea capturar
	int i; //será la variable por la cual vamos a iterar
	int total_ceros = 0;

	// Solicitados al usuario indique el total de datos a ser capturados
	printf("Indique cuantos datos serán capturados: ");
	scanf("%d", &n);

	// alojamos memoria sufiente que será manejada por el apuntador p  (*p)

	p = (int *)malloc(sizeof(int));

	// empezamos a iterar sobre i para solicitar valores
	for(i=0; i< n; i++){
		printf("introduzca el valor i = %d ", i);
		scanf("%d", (p+i));
	}

	printf("Usted introdujo los siguientes datos: ");
	for(i=0;i<n;i++){	
		printf("%d,  ", *(p+i) );
		if(*(p+i) == 0) total_ceros = total_ceros + 1;
	}

	printf("\n Ademas capturo un total de ceros = %d", total_ceros);

}