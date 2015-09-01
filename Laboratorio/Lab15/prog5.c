#include <stdio.h>

int main(){
	
	FILE *fp;
	char c;
	int total = 0;
	int numero;


	fp = fopen("numeros.txt", "r");  // Read 

	if(fp == NULL){
		printf("No se encuentra el archivo");
		return 1;
	}

	while(!feof(fp)){
		fscanf(fp, "%d,", &numero);
		total = total + numero;
		printf("%d ", numero);
	}

	printf("\n\n%d", total);
}



















