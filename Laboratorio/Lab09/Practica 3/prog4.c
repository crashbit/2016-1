#include <stdio.h>

int main(){
	FILE *fp;
	char c[5]={'a', 'e', 'i', 'o', 'u'};

	fp = fopen("hola.txt", "w");

	fputs(c, fp);
	fputs(c, fp);

	fclose(fp);
}
