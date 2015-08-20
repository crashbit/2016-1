#include <stdio.h>

int main(){
	
	void *p;
	int x = 10;
	char c = 'A';

	p = &x;
	p = &c;
	printf("\n%p -> %p", p, &x);
	printf("\n%p -> %p", p, &c);
	printf("\n");

}