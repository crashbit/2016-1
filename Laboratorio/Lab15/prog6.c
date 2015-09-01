#include <stdio.h>

int main(){

	FILE *fp;
	char c[5];
	

	fp = fopen("numeros.txt", "r");  // Read 

	if(fp == NULL){
		printf("No se encuentra el archivo");
		return 1;
	}

	while(!feof(fp)){
		fgets(c, 5, fp);
		printf("\n %s", c);
	}
}






