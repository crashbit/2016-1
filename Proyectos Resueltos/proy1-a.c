// Proyecto no. 1, Solucion A
// Usar un apuntador y tratarlo como matriz de n * m , 
// Indicar cuantos ceros tiene la matriz
// Prohibido usar declaraciones de cualquier tipo de arrelos

#include <stdio.h>
#include <stdlib.h>

int main(){

	int col, ren; //manejaran los tamannos de renglones y columnas de mi matriz
	int *p ; // manejará la matriz
	int i, j; // iteradores que se necesitaran en los "for"

	int offset=0; // variable que me desplazara cada cierto numero de columnas

	int total_ceros =0;  //variable que manejara el total de ceros

	printf("Cuantos renglones?:");
	scanf("%d", &ren);

	printf("\nCuantas columnas?:");
	scanf("%d", &col);

	//Calculamos el tamanno de la matriz
	
	p = (int *)malloc((col * ren) * sizeof(int));

	//Ahora pedimos nuestros datos 
	for(i=0;i<ren;i++){
		for(j=0; j<col; j++){
			printf("\n\nIndique el valor para la posicion [%d][%d]", i, j);
			scanf("%d", p + i + j + offset);
			printf("posicion en el apuntador: %d", i+j+offset);  // podemos ver en que parte del apuntador vamos metiendo los datos
		}
		offset = offset + (col - 1); //Aqui avanzamos según el número de columnas :), este es el truco
	}

	printf("\n\n");
	//presentamos la matriz y resetamos el offset
	offset = 0;
	for(i=0;i<ren;i++){
		for(j=0;j<col;j++){
			// Usamos al apuntador como si fuese un arreglo lineal
			if(p[i+j+offset] == 0) total_ceros = total_ceros +1;
			printf(" %d ", p[i+j+offset]);
		}
		offset = offset + (col - 1); //Aqui avanzamos según el número de columnas :), este es el truco
		printf("\n");
	}

	printf("\nTotal de ceros: %d", total_ceros);

}
