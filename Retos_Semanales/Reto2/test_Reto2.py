import Reto2_Cliente
import unittest

def makeDicCliente(nombre, edad: int, primer_ingreso: bool, id_cliente = 1):
        cliente = {"id_cliente": id_cliente, "nombre": nombre, "edad": edad, "primer_ingreso": primer_ingreso}
        return cliente 

class Test_reto2Cliente(unittest.TestCase):
    def test_cliente_ifAgeIsNotInValidRange_returnDictWithAptoInFalse_atraccionInNA_toTalBoletaInNA(self):
        #given
        cliente = makeDicCliente("Gloria Suarez",3,True)
        expected = {"nombre": "Gloria Suarez", "edad": 3, "atraccion": "N/A", "apto": False, "primer_ingreso": True, "total_boleta": "N/A"}   
        #when
        result = Reto2_Cliente.cliente(cliente)
        #then
        self.assertEqual(expected, result)
    
    def test_cliente_ifAgeIsBetween7and15_andFirstAdmissionIsTrue_returnDicAptoInTrue_atraccionSillasVoladoras_toTalBoletawithDiscount(self):
        #given
        cliente = makeDicCliente("Tatiana Ruiz",8,True)
        expected = {"nombre": "Tatiana Ruiz", "edad": 8, "atraccion": "Sillas voladoras", "apto": True, "primer_ingreso": True, "total_boleta": 9500.0}   
        #when
        result = Reto2_Cliente.cliente(cliente)
        #then
        self.assertEqual(expected, result)
    
    def test_cliente_ifAgeIsBetween7and15_andFirstAdmissionIsFalse_returnDicAptoInTrue_atraccionSillasVoladoras_toTalBoletawithoutDiscount(self):
        #given
        cliente = makeDicCliente("Tatiana Ruiz",8,False)
        expected = {"nombre": "Tatiana Ruiz", "edad": 8, "atraccion": "Sillas voladoras", "apto": True, "primer_ingreso": False, "total_boleta": 10000}   
        #when
        result = Reto2_Cliente.cliente(cliente)
        #then
        self.assertEqual(expected, result)
    
    def test_cliente_ifAgeIsBetween15and18_andFirstAdmissionIsTrue_returnDicAptoInTrue_atraccionCarrosChocones_toTalBoletawithDiscount(self):
        #given
        cliente = makeDicCliente("Tatiana Suarez",17,True)
        expected = {"nombre": "Tatiana Suarez", "edad": 17, "atraccion": "Carroschocones", "apto": True, "primer_ingreso": True, "total_boleta": 4650.0}   
        #when
        result = Reto2_Cliente.cliente(cliente)
        #then
        self.assertEqual(expected, result)
        
    def test_cliente_ifAgeIsBetween15and18_andFirstAdmissionIsFalse_returnDicAptoInTrue_atraccionCarrosChocones_toTalBoletawithoutDiscount(self):
        #given
        cliente = makeDicCliente("Tatiana Suarez",17,False)
        expected = {"nombre": "Tatiana Suarez", "edad": 17, "atraccion": "Carroschocones", "apto": True, "primer_ingreso": False, "total_boleta": 5000}   
        #when
        result = Reto2_Cliente.cliente(cliente)
        #then
        self.assertEqual(expected, result)
    
    def test_cliente_ifAgeIsGreaterThan18_andFirstAdmissionIsTrue_returnDicAptoInTrue_atraccionXTreme_toTalBoletawithDiscount(self):
        #given
        cliente = makeDicCliente("Johana Fernandez",20,True)
        expected = {"nombre": "Johana Fernandez", "edad": 20, "atraccion": "X-Treme", "apto": True, "primer_ingreso": True, "total_boleta": 19000.0}   
        #when
        result = Reto2_Cliente.cliente(cliente)
        #then
        self.assertEqual(expected, result)
        
    def test_cliente_ifAgeIsGreaterThan18_andFirstAdmissionIsFalse_returnDicAptoInTrue_atraccionXTreme_toTalBoletawithoutDiscount(self):
        #given
        cliente = makeDicCliente("Johana Fernandez",20,False)
        expected = {"nombre": "Johana Fernandez", "edad": 20, "atraccion": "X-Treme", "apto": True, "primer_ingreso": False, "total_boleta": 20000}   
        #when
        result = Reto2_Cliente.cliente(cliente)
        #then
        self.assertEqual(expected, result)
     
if __name__ == '__main__':
    unittest.main()