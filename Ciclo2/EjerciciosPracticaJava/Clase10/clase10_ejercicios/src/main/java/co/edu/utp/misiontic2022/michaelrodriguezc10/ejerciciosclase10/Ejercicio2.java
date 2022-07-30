/* Ejercicio 2 clase 10: Crea una aplicación donde pidamos un texto que queremos escribir
 en el fichero de texto, Se debe mostrar el mismo texto por pantalla pero variando entre
 mayusculas y minusculas para los caracteres que apliquen.
 */

package co.edu.utp.misiontic2022.michaelrodriguezc10.ejerciciosclase10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio2 {

    public static void escrituraEnArchivoTxt() {
        String linea = null;
        var archivo = "/Volumes/Z9/Mintic/Programacion/Retos/Ciclo2/EjerciciosPracticaJava/Clase10/clase10_ejercicios/src/main/java/co/edu/utp/misiontic2022/michaelrodriguezc10/ejerciciosclase10/Texto2.txt";
        try {
            var entrada =  new BufferedReader(new InputStreamReader(System.in));  //lee lo que ingresa por teclado y lo almacena en un buffer.
            System.out.println("Escribe un texto: ");
            linea = entrada.readLine();

            var salida = new PrintWriter(archivo);
            salida.print(linea);  // almacena en el archivo texto2.txt lo que se ingresa por teclado.

            entrada.close();
            salida.close();
        } catch (IOException e){
            System.err.println(e);
        }
    }

    public static void mostrarTextoPantalla() throws FileNotFoundException {
        String nombreArchivo = "/Volumes/Z9/Mintic/Programacion/Retos/Ciclo2/EjerciciosPracticaJava/Clase10/clase10_ejercicios/src/main/java/co/edu/utp/misiontic2022/michaelrodriguezc10/ejerciciosclase10/Texto2.txt";
        var archivo = new File(nombreArchivo);
        if(archivo.exists()){
            try {
                var lector =  new Scanner(archivo);
                lector.useDelimiter("\n");  // Para que el scanner acepte espacios entre palabras.
                while (lector.hasNext()) {
                    var texto = lector.next().toCharArray();  // Covierte el string en un array de caracteres
                    for(char p : texto){
                        String letra = Character.toString(p);
                        if (Character.isUpperCase(p)){
                            System.out.print(letra.toLowerCase());
                        } else {
                            System.out.print(letra.toUpperCase());
                        }
                    }
                }
                lector.close();
            } catch (IOException ex){
                System.err.println(ex);
            }
        } else {
            System.out.println("El archivo no existe");
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        escrituraEnArchivoTxt();
        mostrarTextoPantalla();
    }
}
