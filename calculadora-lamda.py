# -*- coding: utf-8 -*-
"""
Created on Sun Dec  5 00:45:55 2021

@author: SERGIO
2do Examen INF - 319
Pregunta 2
"""
#Suma
suma = lambda x,y: x + y

resta = lambda x,y: x - y

multipli = lambda x,y: x * y

div = lambda x,y: x/y
    




# División


#calculadora
def calculadora(entrada,num1,num2):
    if entrada == '1':
        print("--La suma es: ",suma(num1,num2))
    elif entrada == '2':
        print("--La Resta es: ",resta(num1,num2))
    elif entrada == '3':
        print("--La Multiplicacion es: ", multipli(num1, num2))
    elif entrada == '4':
        print("--La division es: ", int(div(num1, num2)))
    else:
        print("ERROR numero incorrecto, intente de nuevo")

#Menu
while(True):
    print("******CALCULADORA EN PYTHON FUNCIONES LAMBDA******")
    print("1.Suma")
    print("2.Resta")
    print("3.Multiplicar")
    print("4.Dividir")
    # Operación a realizar
    entrada = input("Que operacion desea realizar...digite (1/2/3/4): ")
    n1 = int(input("Primer número: "))
    n2 = int(input("segundo número: "))
    #Llamada a la funcion calculadora
    calculadora(entrada,n1,n2)
