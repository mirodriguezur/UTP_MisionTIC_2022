import Reto1_CDT
import unittest

class Test_reto1CDT(unittest.TestCase):
    def test_cdt_ifTimeisLessTwoMonths_loseMoney(self):
        #given
        user = "AB1012"
        amount = 650000
        time = 2
        totalValue = 637000.0
        expected = "Para el usuario " + str(user) + " La cantidad de dinero a recibir, según el monto inicial " + str(amount) + " para un tiempo de " + str(time) + " meses es: " + str(totalValue)
         
        #when
        result = Reto1_CDT.cdt(user,amount,time)
        
        #then
        self.assertEqual(expected, result)

    def test_cdt_ifTimeisGreaterTwoMonths_earnMoney(self):
        #given
        user = "AB1012"
        amount = 10000000
        time = [3, 4, 5]
        totalValue = [10075000.0, 10100000.0, 10125000.0]
         
        #when --- then
        for i in range (len(time)):
            result = Reto1_CDT.cdt(user,amount,time[i])
            expected = "Para el usuario " + str(user) + " La cantidad de dinero a recibir, según el monto inicial " + str(amount) + " para un tiempo de " + str(time[i]) + " meses es: " + str(totalValue[i])
            self.assertEqual(expected, result)     
     
if __name__ == '__main__':
    unittest.main()
