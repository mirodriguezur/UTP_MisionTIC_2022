''' 
Program that reads a person's weight in pounds, and returns their weight in kg
'''

def lbToKgFunc(weight: float) -> float:
    if type(weight) == str or type(weight) == bool:
        raise Exception("Is not a weight")
    elif weight < 0:
        raise Exception("Is a negative number")
    else:
        return weight * 0.453592
   
        
    


#print(lbToKgFunc())