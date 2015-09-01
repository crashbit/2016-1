#include <stdio.h>

int main(){
	
	FILE *fp;

	fp = fopen("numeros.txt", "a");
	int total = 200;

	fputc('A',fp);
	fputs("BBBB",fp);
	fprintf(fp, "La salida es de: %d", total);


	fclose(fp);
}