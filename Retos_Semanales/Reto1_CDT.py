"""
Escriba una función que reciba como parámetros: una cadena con el usuario del cliente como dato alfanumérico, el capital aportado y el
tiempo del CDT y, en consecuencia, retorne una cadena de caracteres que le proporcione al banco la información que desea obtener.     
"""

def cdt(user,amount,time):
    
    if time <= 2:
        percentageToLose = 0.02
        valueToLose = amount * percentageToLose
        totalValue = amount - valueToLose
    
        return "Para el usuario " + user + " La cantidad de dinero a recibir, según el monto inicial " + str(amount) + " para un tiempo de " + str(time) + " meses es: " + str(totalValue)
    else:
        interestPorcentage = 0.03
        interestValue = (amount * interestPorcentage * time) / 12
        totalValue = interestValue + amount
    
        return "Para el usuario " + user + " La cantidad de dinero a recibir, según el monto inicial " + str(amount) + " para un tiempo de " + str(time) + " meses es: " + str(totalValue)
