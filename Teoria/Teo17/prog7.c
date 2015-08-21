#include <stdio.h>
#include <stdlib.h>

int main(){

	int *p;

	p = (int *)malloc(sizeof(int));

	printf("\n%p -> %d", p, *p);

	printf("\n");
}