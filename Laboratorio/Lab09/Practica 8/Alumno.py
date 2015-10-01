class Alumno():
	nombre=""
	edad = 0

	def __init__(self):
		self.nombre = "nobody"
		self.edad = 0

	def leer(self):
		print("...leyendo...")

	def escribir(self):
		print("...escribiendo...")

dormilon = Alumno()
despierto = Alumno()
dormilon.leer()
despierto.escribir()
print("yo soy " , dormilon.nombre)