'''Reto3_Autopartes'''

def AutoPartes(ventas: list):
    ventasCliente = {}
    
    for IdProducto, dProducto, pnProducto, cvProducto, sProducto, nComprador, cComprador, fVenta in ventas:
        if ventasCliente.get(IdProducto) == None:
            ventasCliente[IdProducto] = []
        ventasCliente[IdProducto].append((dProducto, pnProducto, cvProducto, sProducto, nComprador, cComprador, fVenta))
    return ventasCliente

def consultaRegistro(ventas: dict, IdProducto: int):
    result: str = ""
    if IdProducto not in ventas:
        return "No hay registro de venta de ese producto"
    else:
        for i in range(len(ventas[IdProducto])):
            result += f'Producto consultado : {IdProducto} Descripción {ventas[IdProducto][i][0]} #Parte {ventas[IdProducto][i][1]} Cantidad vendida {ventas[IdProducto][i][2]} Stock {ventas[IdProducto][i][3]} Comprador {ventas[IdProducto][i][4]} Documento {ventas[IdProducto][i][5]} Fecha Venta {ventas[IdProducto][i][6]}\n'
    return result.rstrip('\n')
'''  
print(consultaRegistro(AutoPartes([(2001, 'rosca', 'PT29872', 2, 45, 'Luis Molero', 3456, '12/06/2020'),
            (2010, 'bujía', 'MS9512', 4, 15, 'Carlos Rondon', 1256, '12/06/2020'),
            (2010, 'bujía', 'ER6523', 9, 36, 'Pedro Montes', 1243, '12/06/2020'),
            (3578, 'tijera', 'QW8523', 1, 128, 'Pedro Faria', 1456, '12/06/2020'),
            (9251, 'piñón', 'EN5698', 2, 8, 'Juan Peña', 565, '12/06/2020')]), 2010))           
''' 
        
'''
Respuesta para el juez:
def AutoPartes(ventas: list):
    ventasCliente = {}
    
    for IdProducto, dProducto, pnProducto, cvProducto, sProducto, nComprador, cComprador, fVenta in ventas:
        if ventasCliente.get(IdProducto) == None:
            ventasCliente[IdProducto] = []
        ventasCliente[IdProducto].append((dProducto, pnProducto, cvProducto, sProducto, nComprador, cComprador, fVenta))
    return ventasCliente

def consultaRegistro(ventas: dict, IdProducto: int):
    result: str = ""
    if IdProducto not in ventas:
        print("No hay registro de venta de ese producto")
    else:
        for i in range(len(ventas[IdProducto])):
            result += f'Producto consultado : {IdProducto}  Descripción  {ventas[IdProducto][i][0]}  #Parte  {ventas[IdProducto][i][1]}  Cantidad vendida  {ventas[IdProducto][i][2]}  Stock  {ventas[IdProducto][i][3]}  Comprador {ventas[IdProducto][i][4]}  Documento  {ventas[IdProducto][i][5]}  Fecha Venta  {ventas[IdProducto][i][6]}\n'
    print(result.rstrip('\n'))

'''        