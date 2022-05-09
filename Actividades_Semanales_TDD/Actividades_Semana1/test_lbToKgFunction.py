import lbToKgFunction
import unittest

class Test_lbToKgFunction(unittest.TestCase):
    
    def test_lbToKgFunc_ifWeightIsNotFloat_returnMessageAndAskToBeFloat(self):
        #given
        weight = "error"
        
        try:
            #when
            _ = lbToKgFunction.lbToKgFunc(weight)
        except:
            #then
            self.assertTrue(Exception("Is not a weight"))
    
    def test_lbToKgFunc_ifWeightIsANegativeNumber_returnErrorMessage(self):
        #given
        weight = -13.31
        
        try:
            #when
            _ = lbToKgFunction.lbToKgFunc(weight)
        except:
            #then
            self.assertTrue(Exception("Is a negative number"))
            
    def test_lbToKgFunc_ifWeightIsValidDate_returnWeighInKg(self):
        #given
        weight = 12.0
        expected = 5.443104
        
        try:
            #when
            result = lbToKgFunction.lbToKgFunc(weight)
        except:
            #then
            print("no deberia entrar aqui")
        
        self.assertEqual(result, expected) 
    
        
if __name__ == '__main__':
    unittest.main()