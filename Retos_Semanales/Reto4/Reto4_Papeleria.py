from functools import reduce

def ordenes(rutinaContable):
    print('------------------------ Inicio Registro diario ---------------------------------')
    facturas = []
    sumaFactura = []
    textResult:str = ""
    for compraTotal in rutinaContable:
        facturas.append(compraTotal.pop(0))
        compraPorProducto = []
        for compraIndividual in compraTotal:
            listCompraIndividual = list(compraIndividual)
            listCompraIndividual.pop(0)
            compraPorProducto.append(reduce( lambda cantidad, precioUnitario: cantidad*precioUnitario, listCompraIndividual))
        sumaFactura.append(reduce( lambda acm = 0, elemento=0: acm + elemento, compraPorProducto ))
    
    resultado = list(map( lambda elemento : round(elemento,2) if elemento > 600000 else round(elemento + 25000,2),sumaFactura))
    for i in range(len(facturas)):
        textResult += f'La factura {facturas[i]} tiene un total en pesos de {resultado[i]:,.2f}\n'
    
    print(textResult.rstrip('\n'))
    print('-------------------------- Fin Registro diario ----------------------------------')
    
ordenes([[1201, ("5464", 4, 25842.99), ("7854",18,23254.99), ("8521", 9, 48951.95)], 
         [1202, ("8756", 3, 115362.58),("1112",18,2354.99)], 
         [1203, ("2547", 1, 125698.20), ("2635", 2, 135645.20), ("1254", 1, 13645.20),("9965", 5, 1645.20)], 
         [1204, ("9635", 7, 11.99), ("7733",11,18.99), ("88112", 5, 390.95)]])