#include <stdio.h>

int main(){
	
	int *p;
	int x;

	x = 27;

	p = &x;

	*p = 3;

	printf("\n %p -> %p", p, &x);
	printf("\n %d -> %d", *p, x);
	printf("\n");

}