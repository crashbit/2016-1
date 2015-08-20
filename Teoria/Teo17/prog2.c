/*
Programa que muestra las direcciones de un arreglo que maneja datos del tipo INT
 */


#include <stdio.h>

int main(){

	int arreglo[10];
	int i;
	for(i=0;i<10;i++){
		printf("\n%p", &arreglo[i]);
	}
	printf("\n");
	printf("\n%p", arreglo);
	printf("\n%p", arreglo++);
	printf("\n");
}