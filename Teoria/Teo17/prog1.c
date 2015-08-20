/*
Programa que muestra la direcciones de variables primitivas

 */

#include <stdio.h>

int main(){
	int x;
	int y;
	char c;

	x = 30;
	y = 50;

	printf("\n%p", &x);
	printf("\n%p", &y);
	printf("\n%p", &c);
	printf("\n");
}