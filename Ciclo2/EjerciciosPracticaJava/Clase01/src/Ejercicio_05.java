import java.util.Scanner;

public class Ejercicio_05 {
    static String esParoImpar(String n) {
        var numero = Integer.parseInt(n);
        var result = "";

        result = numero % 2 == 0 ? numero + " es par" : numero + " es impar"; 

        return result;  
    }
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Digite un número: ");
        var numero = sc.nextLine();
        var result = esParoImpar(numero);
        System.out.println(result);
        sc.close();
        
    }
}
