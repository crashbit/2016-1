/*

Codigo que muestra la linealidad en las direcciones de un arreglo bidimensional
 */

#include <stdio.h>

int main(){

	int arreglo[3][3];
	int i, j;
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			printf("\n%p -> [%d][%d]", &arreglo[i][j], i, j);
		}
	}
	printf("\n");
	printf("\n%p", arreglo);
	printf("\n");
}