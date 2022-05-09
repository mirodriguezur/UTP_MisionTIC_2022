'''
Programa que calcula la conversion entre millas y kilometros, y vicebersa.
Esta escrito haciendo uso de soluion sencilla, funciones simples, llamado de una funcion
en otra funcion, funciones anidadas y modulos.
'''

# Solucion sencilla ---------------------------------------------------------------------------------
'''
distancia = int(input("Ingrese la distancia recorrida: "))
tipoDistancia = (input("Ingrese km si es kilometros, o mll si es millas: "))

if tipoDistancia == "km":
    millas = distancia / 1.60934 
    print(millas)
elif tipoDistancia == "mll":
    kilometros = distancia * 1.60934
    print(kilometros)
'''

# Funcion simple -------------------------------------------------------------------------------------
'''
def conversionDistancia(distancia: int, tipoDistancia: str) -> float:
    if tipoDistancia == "km":
        conversion = distancia / 1.60934     
    elif tipoDistancia == "mll":
        conversion = distancia * 1.60934
    return conversion
        

distancia = int(input("Ingrese la distancia recorrida: "))
tipoDistancia = (input("Ingrese km si es kilometros, o mll si es millas: "))

print(conversionDistancia(distancia, tipoDistancia))
'''

# Llamada de una funcion en otra funcion -------------------------------------------------------------
'''
def kmAMilla(distancia: int) -> float:
    return distancia / 1.60934

def millaAKm(distancia) -> float:
    return distancia * 1.60934

def conversionDistancia(distancia: int, tipoDistancia: str) -> float:
    if tipoDistancia == "km":
        return kmAMilla(distancia)     
    elif tipoDistancia == "mll":
        return millaAKm(distancia)
     

distancia = int(input("Ingrese la distancia recorrida: "))
tipoDistancia = (input("Ingrese km si es kilometros, o mll si es millas: "))

print(conversionDistancia(distancia, tipoDistancia))
'''  

# Funcion Anidada ------------------------------------------------------------------------------------
'''
def conversionDistancia(distancia: int, tipoDistancia: str) -> float:
    def kmAMilla(distancia: int) -> float:
        return distancia / 1.60934

    def millaAKm(distancia) -> float:
        return distancia * 1.60934
    
    if tipoDistancia == "km":
        return kmAMilla(distancia)     
    elif tipoDistancia == "mll":
        return millaAKm(distancia)

distancia = int(input("Ingrese la distancia recorrida: "))
tipoDistancia = (input("Ingrese km si es kilometros, o mll si es millas: "))

print(conversionDistancia(distancia, tipoDistancia))
'''

# Modulos --------------------------------------------------------------------------------------------
