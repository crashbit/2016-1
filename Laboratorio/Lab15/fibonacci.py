#coding: UTF-8
n = 10
sem1 = 0
sem2 = 1
nuevo = 0
for i in range(1,n+1):
	nuevo = sem1 + sem2
	print(nuevo)
	sem1 = sem2
	sem2 = nuevo
