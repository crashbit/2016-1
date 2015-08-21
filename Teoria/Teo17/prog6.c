#include <stdio.h>

int main(){

	int x[5]={3,2,5,1,0};
	int *p;

	p = x;

	p++;
	p++;p++;p++;p++;p++;
	printf("\n%d", *p);
	printf("\n");
}