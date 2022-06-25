import java.util.Scanner;

public class Ejercicio_02 {

    static int contadorDigitos(String n) {
        var digitos = n.length();
            return digitos; 
    }    
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        System.out.println("Digite un número: ");
        var numero = sc.nextLine();
        var resultado = contadorDigitos(numero);
        System.out.println(resultado);
        sc.close();
    }
}
