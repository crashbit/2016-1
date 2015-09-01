#include <stdio.h>

int main(){
	
	FILE *fp;
	char c[5];
	int numero;

	fp = fopen("numeros.txt", "r");

	if(fp == NULL){
		printf("No existe el archivo");
		return 1;
	}

	while(!feof(fp)){
		fscanf(fp,"%d,", &numero);
		if(numero%2 == 0) printf("\n %d", numero);
	}
}