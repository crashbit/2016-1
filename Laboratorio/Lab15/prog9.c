#include <stdio.h>

int main(){
	
	FILE *fp;
	char c;
	int total = 0;
	int numero = 2222;


	fp = fopen("numeros.txt", "a");  // Read 

	fputc('a', fp);
	fputs("\nEsta clase esta coqui", fp);
	fprintf(fp, "\nEl numero magico es: %d", numero);

	fclose(fp);
	
}