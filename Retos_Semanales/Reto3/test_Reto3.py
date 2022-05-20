import Reto3_Autopartes
import unittest

def makelistAutopartes():
    return [(2001, 'rosca', 'PT29872', 2, 45, 'Luis Molero', 3456, '12/06/2020'),
            (2010, 'bujía', 'MS9512', 4, 15, 'Carlos Rondon', 1256, '12/06/2020'),
            (2010, 'bujía', 'ER6523', 9, 36, 'Pedro Montes', 1243, '12/06/2020'),
            (3578, 'tijera', 'QW8523', 1, 128, 'Pedro Faria', 1456, '12/06/2020'),
            (9251, 'piñón', 'EN5698', 2, 8, 'Juan Peña', 565, '12/06/2020')]

class Test_reto3Autopartes(unittest.TestCase):
    
    def test_AutoPartes_whenGetList_ReturnDictionaryWithListOfTuples(self):
        #given
        listAutopartes = makelistAutopartes()
        diccionarioExpected = {2001: [('rosca', 'PT29872', 2, 45, 'Luis Molero', 3456, '12/06/2020')],
                               2010: [('bujía', 'MS9512', 4, 15, 'Carlos Rondon', 1256, '12/06/2020'),
                                      ('bujía', 'ER6523', 9, 36, 'Pedro Montes', 1243, '12/06/2020')],
                               3578: [('tijera', 'QW8523', 1, 128, 'Pedro Faria', 1456, '12/06/2020')],
                               9251: [('piñón', 'EN5698', 2, 8, 'Juan Peña', 565, '12/06/2020')]}
        #when
        diccionario = Reto3_Autopartes.AutoPartes(listAutopartes)
        #then
        self.assertEqual(diccionario, diccionarioExpected)
    
    def test_consultaRegistro_whenGetDictionaryWithSales_AndIdProductIsNotContainedInDictionary_returnFailureString(self):
        #given
        IdProducto = 1999
        listAutopartes = makelistAutopartes()
        stringExpected = "No hay registro de venta de ese producto"
        #when
        diccionario = Reto3_Autopartes.AutoPartes(listAutopartes)
        result = Reto3_Autopartes.consultaRegistro(diccionario, IdProducto)
        #then
        self.assertEqual(stringExpected, result)

    def test_consultaRegistro_whenGetDictionaryWithSales_returnString(self):
        #given
        IdProducto = 2010
        listAutopartes = makelistAutopartes()
        stringExpected = "Producto consultado : 2010 Descripción bujía #Parte MS9512 Cantidad vendida 4 Stock 15 Comprador Carlos Rondon Documento 1256 Fecha Venta 12/06/2020\nProducto consultado : 2010 Descripción bujía #Parte ER6523 Cantidad vendida 9 Stock 36 Comprador Pedro Montes Documento 1243 Fecha Venta 12/06/2020"
        #when
        diccionario = Reto3_Autopartes.AutoPartes(listAutopartes)
        result = Reto3_Autopartes.consultaRegistro(diccionario, IdProducto)
        #then
        self.assertEqual(stringExpected, result)
     
        
        
if __name__ == '__main__':
    unittest.main()