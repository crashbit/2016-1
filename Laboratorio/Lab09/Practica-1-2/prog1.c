#include <stdio.h>

int main(){
	
	int arreglo[10]={2,4,6,1,0,-1,9,2,5,6};
	int i,j;
	int temp;

	for(i=0;i<10;i++){
		for(j= i+1; j< 10; j++){
			if(arreglo[i]< arreglo[j]){
				temp = arreglo[i];
				arreglo[i] = arreglo[j];
				arreglo[j] = temp;
			}
		}
	}

	for(i =0; i<10;i++){
		printf("\n%d", arreglo[i]);

	}

	return 0;
}




