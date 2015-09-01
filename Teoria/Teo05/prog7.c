#include <stdio.h>

int main(){
	
	FILE *fp;
	char c;

	fp = fopen("numeros.txt", "r");

	if(fp == NULL){
		printf("No existe el archivo");
		return 1;
	}

	while(c != EOF){
		c = fgetc(fp);
		printf("\n %c", c);
	}
}