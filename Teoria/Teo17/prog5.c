#include <stdio.h>

int main(){

	int *p;
	void *temp;
	int x = 25;
	char c = 'A';
	p = &x;

	temp = &x;
	temp = &c;

	printf("\n%p -> %p", temp, &c);
	// printf("\n%d -> %d", *p, x);
	printf("\n");
}