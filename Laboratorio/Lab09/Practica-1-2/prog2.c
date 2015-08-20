#include <stdio.h>

int main(){

	int matriz[3][3]={{3,4,2},{3,4,2},{4,3,2}};
	int i, j;

	for(i = 0 ; i<3; i++){
		for(j = 0; j<3; j++){
			printf("\n%p [%d][%d]", &matriz[i][j], i, j);
		}

	}


}