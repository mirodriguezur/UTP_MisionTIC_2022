'''
Programa que calcula la longitud de la hipotenusa utilizando teorema de Pitágoras.
Esta escrito haciendo uso de soluion sencilla, funciones simples, llamado de una funcion
en otra funcion, funciones anidadas y modulos.
'''

# Solucion sencilla ---------------------------------------------------------------------------------
'''
cateto1 = int(input("Ingrese longitud del primer cateto: "))
cateto2 = int(input("Ingrese longitud del segundo cateto: "))

hipotenusa = (cateto1**2 + cateto2**2)**0.5
print(hipotenusa)
'''
# Funcion simple -------------------------------------------------------------------------------------
'''
def hipotenusa(cateto1: int, cateto2: int) -> float:
    return (cateto1**2 + cateto2**2)**0.5

cateto1 = int(input("Ingrese longitud del primer cateto: "))
cateto2 = int(input("Ingrese longitud del segundo cateto: "))

print(hipotenusa(cateto1, cateto2))
'''

# Llamada de una funcion en otra funcion -------------------------------------------------------------
'''
def raizCuadrada(valor):
    return valor ** 0.5

def hipotenusa(cateto1: int, cateto2: int) -> float:
    sumaCatetosAlCuadrado = (cateto1**2 + cateto2**2)
    return raizCuadrada(sumaCatetosAlCuadrado)

cateto1 = int(input("Ingrese longitud del primer cateto: "))
cateto2 = int(input("Ingrese longitud del segundo cateto: "))

print(hipotenusa(cateto1, cateto2))
'''   
# Funcion Anidada ------------------------------------------------------------------------------------
'''
def hipotenusa(cateto1: int, cateto2: int) -> float:
    sumaCatetosAlCuadrado = (cateto1**2 + cateto2**2)
    def raizCuadrada(valor):
        return valor ** 0.5
    return raizCuadrada(sumaCatetosAlCuadrado)

cateto1 = int(input("Ingrese longitud del primer cateto: "))
cateto2 = int(input("Ingrese longitud del segundo cateto: "))

print(hipotenusa(cateto1, cateto2))
'''

# Modulos --------------------------------------------------------------------------------------------

