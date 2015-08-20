#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(){

	int *p;
	int x= 25;

	p = &x;
	*p = 45;
	printf("\n%p -> %p", p, &x);
	printf("\n%d -> %d", *p, x);
	printf("\n");

}
