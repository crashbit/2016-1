#include <stdio.h>

int main(){
	FILE *fp;
	char c;

	fp = fopen("hola.txt", "r");

	if(fp == NULL){
		printf("El archivo no se encuentra");
		return 0;
	}

	while(!feof(fp)){
		c = fgetc(fp);
		printf("%c ", c);
	}
}







