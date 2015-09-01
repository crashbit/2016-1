#include <stdio.h>

int main(){
	FILE *fp;
	int total = 0;
	int numero;

	fp = fopen("numeros.txt", "r");

	while(!feof(fp)){
		fscanf(fp, "%d,", &numero);
		total = total + numero;
	}

	printf("%d", total);

	fclose(fp);
}