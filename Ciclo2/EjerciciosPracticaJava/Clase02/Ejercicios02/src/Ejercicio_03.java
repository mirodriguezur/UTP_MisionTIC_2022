import java.util.Scanner;

public class Ejercicio_03 {

    private static Integer recortaCifras(String numeroDigitado, String cantidadCifras){
        var cantidadCifrasInt = Integer.parseInt(cantidadCifras);
        var numDigitadoDinamico = new StringBuilder(numeroDigitado);
        var tamano = numDigitadoDinamico.length();

        var resultStringBuilder = numDigitadoDinamico.delete(tamano - cantidadCifrasInt, tamano);
        var resulString = resultStringBuilder.toString();
        var result = Integer.parseInt(resulString);
        
        return result;
    }
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Ingrese un número: " );
        var num = sc.nextLine();
        System.out.println("Ingrese cifras a recortar: ");
        var cifras = sc.nextLine();
        System.out.println("El número recortado es: " + Ejercicio_03.recortaCifras(num, cifras));
        sc.close();
    }
}
