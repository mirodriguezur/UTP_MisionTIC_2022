import java.util.Scanner;

public class Ejercicio_03 {

    static int[] dobleyTriple(String n) {
        var numero = Integer.parseInt(n);
        var doble = numero*2;
        var triple = numero*3;
        int[] result = {doble, triple};
        return result;
    }
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        System.out.println("Digite un número: ");
        var numero = sc.nextLine();
        var resultado = dobleyTriple(numero);
        sc.close();
        System.out.println("doble: " + resultado[0]);
        System.out.println("triple: " + resultado[1]);
    }
}
