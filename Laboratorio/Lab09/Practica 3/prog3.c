#include <stdio.h>

int main(){
	FILE *fp;
	char c[5]={'a', 'e', 'i','o','u'};
	int i;

	fp = fopen("hola.txt", "a");

	if(fp == NULL){
		printf("El archivo no se encuentra");
		return 0;
	}

	for(i=0;i<5;i++){
		fputs(c, fp);
	}

	fclose(fp);
}




