Matriz = []

NumF = int (raw_input ( "Escribe el numero de Filas: "))
NumC = int (raw_input ("Escribe el Numero de Columnas: "))

for i in range (NumF):
    Matriz.append([0]*NumC)

    

for fi in range (NumF):
    for co in range (NumC):
        Matriz [fi][co] = int (raw_input ("Elemento %d %d:" %(f,c)))


print("Matriz")