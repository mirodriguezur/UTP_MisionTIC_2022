import pandas as pd

# ruta file csv

rutaFileCsv = 'https://github.com/luisguillermomolero/MisionTIC2022_2/blob/master/Modulo1_Python_MisionTIC2022_Main/Semana_5/Reto/movies.csv?raw=true'

def listaPeliculas(rutaFileCsv: str) -> str:
    if rutaFileCsv.split(".")[-1] != "csv":  #divido string y tomo el ultimo que contiene el csv.
        try:
            archivo = pd.read_csv(rutaFileCsv)
            subconjunto = archivo[["Country", "Language", "Gross Earnings"]]
            df = subconjunto.pivot_table(index = ["Country", "Language"])
            
        except:
            print("Error al leer el archivo de datos.")
    
    else:
        print("Extension inválida.")
    return df.head(10)

print(listaPeliculas(rutaFileCsv))