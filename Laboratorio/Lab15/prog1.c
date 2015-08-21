#include <stdio.h>

int main(){
	int x[10] = {2,-1,4,8,0,-3,10,7,9,0};
	int i, j;
	int temp;

	for(i = 0; i < 10; i++){
		for(j = i+1; j< 10; j++){
			if(x[i]> x[j]){
				temp = x[i];
				x[i] = x[j];
				x[j] = temp;
			}
		}
	}

	for(i = 0; i< 10; i++){
		printf("\n%d", x[i]);
	}
}


