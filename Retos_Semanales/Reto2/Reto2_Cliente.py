'''
Reto 2
'''



def cliente(informacion: dict) -> dict:
    id_cliente = informacion["id_cliente"]
    nombre = informacion["nombre"]
    edad = informacion["edad"]
    primer_ingreso = informacion["primer_ingreso"]
    apto = False
    
    if edad < 7:
        atraccion = "N/A"
        total_boleta = "N/A"
    elif (edad >= 7 and edad < 15) and primer_ingreso == True:
        atraccion = "Sillas voladoras"
        apto = True
        total_boleta = 10000 - (10000 * 0.05)
    elif (edad >= 7 and edad < 15):
        atraccion = "Sillas voladoras"
        apto = True
        total_boleta = 10000
    elif (edad >= 15 and edad <= 18) and primer_ingreso == True:
        atraccion = "Carros chocones"
        apto = True
        total_boleta = 5000 - (5000 * 0.07)
    elif (edad >= 15 and edad <= 18):
        atraccion = "Carros chocones"
        apto = True
        total_boleta = 5000
    elif edad > 18 and primer_ingreso == True:
        atraccion = "X-Treme"
        apto = True
        total_boleta = 20000 - (20000 * 0.05)
    else:
        atraccion = "X-Treme"
        apto = True
        total_boleta = 20000
    
    return {"nombre": nombre, "edad": edad, "atraccion": atraccion, "apto": apto, "primer_ingreso": primer_ingreso, "total_boleta": total_boleta}
