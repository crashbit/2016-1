#include <stdio.h>

int main(){
	FILE *fp;
	int x=5, y=20;

	fp = fopen("hola.doc", "w");

	fprintf(fp, "La suma de x + y es: %d", (x+y));

	fclose(fp);
}
