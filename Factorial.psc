Algoritmo Factorial
	Definir num, factor, contador Como Entero
	Escribir 'Dame un numero'
	Leer num
	contador <- 1
	factor <- 1
	Para contador<-1 Hasta num Hacer
		factor <- contador*factor
	FinPara
	Escribir 'El factorial es ', factor
FinAlgoritmo
