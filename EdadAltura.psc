Algoritmo EdadAltura
	Definir edad1 , edad2 , edad3 , edad4 , edad5 , edadmedia Como Entero
	Definir altura1 , altura2 , altura3 , altura4 , altura5 , alturamedia Como Real
		Escribir "Dime la edad de 5 alumnos"
			Leer edad1 , edad2 , edad3 , edad4 , edad5
		Escribir "Dime la altura de los 5 alumnos"
			Leer altura1 , altura2 , altura3 , altura4 , altura5
				edadmedia=trunc((edad1+edad2+edad3+edad4+edad5)/5)
				alturamedia=(altura1+altura2+altura3+altura4+altura5)/5
		Escribir "La edad media es " edadmedia " y la altura media es " alturamedia
		
		Para 
FinAlgoritmo
