#include <stdio.h>
#include <stdlib.h>

int main(){

	int *p;

	p = (int *)malloc(4 * sizeof(int));

	p[2] = 3;
	printf("\n%p -> %d", p, p[2]);

	free(p);


	printf("\n");
}