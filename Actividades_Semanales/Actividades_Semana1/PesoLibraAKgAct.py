''' 
Programa que lee un peso de una persona en libras, y devuelve su peso en kg
Esta escrito haciendo uso de soluion sencilla, funciones simples, llamado de una funcion
en otra funcion, funciones anidadas y modulos.
'''

# Solucion sencilla ---------------------------------------------------------------------------------
'''
pesoLibra = float(input("Ingrese peso de una persona en libras: "))
pesoEnKg = pesoLibra * 0.453592
print(pesoEnKg)
'''

# Funcion simple -------------------------------------------------------------------------------------
'''
def pesoLibraAKg(pesoLibra: float) -> float :
    pesoAKg = pesoLibra * 0.453592
    return pesoAKg

peso = float(input("Ingrese peso de una persona en libras: "))

print(pesoLibraAKg(peso))
'''

# Llamada de una funcion en otra funcion -------------------------------------------------------------
'''
def lbAkg(pesoLibra:float) -> float:
    return pesoLibra * 0.453592

def conversionPeso(pesoLibra: float) -> float:
    return lbAkg(pesoLibra)

peso = float(input("Ingrese peso de una persona en libras: "))

print(conversionPeso(peso))
'''

# Funcion Anidada ------------------------------------------------------------------------------------
'''
def conversionPeso(pesoLibra: float) -> float:
    def lbAkg(pesoLibra:float) -> float:
        return pesoLibra * 0.453592
    return lbAkg(pesoLibra)
    
peso = float(input("Ingrese peso de una persona en libras: "))

print(conversionPeso(peso))
'''  

# Modulos --------------------------------------------------------------------------------------------

