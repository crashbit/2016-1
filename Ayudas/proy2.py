archivo = open("CPdescarga.txt", "r")

cp = raw_input("Introduce un codigo postal: ")

#lee linea por linea del archivo
elementos=[]
for linea in archivo:

	#Cada linea que obtenemos la cortamos en "|", nos devolvera una lista con los elementos de la linea
	elementos = linea.split("|")

	#Comparamos el codigo postal del usuario con el primer elemento de la linea que obtuvimos del archivo.
	if cp == elementos[0]:
		print "Codigo postal: %s" % elementos[0]
		print("Asentamiento: %s" % elementos[1])
		print("Tipo asentamiento: %s" % elementos[2])
		print("Municipio: %s" % elementos[3])
		print("Estado: %s" % elementos[4])
		print("Ciudad: %s" % elementos[5])

archivo.close()