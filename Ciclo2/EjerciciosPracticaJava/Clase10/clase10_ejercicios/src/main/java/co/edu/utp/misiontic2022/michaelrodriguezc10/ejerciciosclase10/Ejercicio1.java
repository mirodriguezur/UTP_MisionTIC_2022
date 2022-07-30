/* Ejercicio 1 clase 10: Crea un fichero de texto con el nombre y contenido que tu quieras.
Ahora crea una aplicación que incluya en el fichero de texto carácter por carácter y su 
contenido debe quedar sin espacios.Por ejemplo si se ingeesa el siguiente texto:  
"Hola michael como estas", deberá quedar en el fichero como "Holamichaelcomoestas." */

package co.edu.utp.misiontic2022.michaelrodriguezc10.ejerciciosclase10;

import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio1 {

    public static void escrituraArhivoText(){
        char caracter;
        System.out.println("Escribe un texto: ");
        var archivo = "/Volumes/Z9/Mintic/Programacion/Retos/Ciclo2/EjerciciosPracticaJava/Clase10/clase10_ejercicios/src/main/java/co/edu/utp/misiontic2022/michaelrodriguezc10/ejerciciosclase10/Texto.txt";
        try {
            var salida = new PrintWriter(archivo);
            do {
                caracter = (char)System.in.read();
                if (caracter == ' '){
                    continue;
                }
                salida.print(caracter);
            } while (caracter != '\n');
            salida.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    public static void main(String[] args) {
        escrituraArhivoText();
    }
}
