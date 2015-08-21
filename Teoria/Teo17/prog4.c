#include <stdio.h>

int main(){

	int *p;
	int x = 25;

	p = &x;

	*p = 33;

	printf("\n%p -> %p", p, &x);
	printf("\n%d -> %d", *p, x);
	printf("\n");
}