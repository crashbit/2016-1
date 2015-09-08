#include <stdio.h>
#include <string.h>

int main(){
	char cadena[] = "01000|San Ángel|Colonia|Álvaro Obregón|Distrito Federal|Ciudad de México|01001|09|01001||09|010|0001|Urbano|01";
	char *guarda_apuntador;
	char *elemento;

	// Obtenemos el primer item de nuestra cadena, a su vez, guardamos el avance en guarda_apuntador
	elemento = strtok_r(cadena, "|", &guarda_apuntador);
	printf("%s", elemento);

	// avanzaremos por toda la cadena mientras el elemento que saquemos no sea NULL
	while(elemento != NULL){

		// Avanzamos por la cadena, solo que usaremos a guarda_apuntador, tanto para obtener la cadena como guardar el avance
		elemento = strtok_r(NULL, "|", &guarda_apuntador);

		//Se imprime el elemento que obtenemos de la cadena original
		printf("\n%s", elemento);
	}

}
