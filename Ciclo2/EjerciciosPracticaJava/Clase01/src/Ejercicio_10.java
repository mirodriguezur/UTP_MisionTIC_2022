import java.util.Scanner;
import java.util.Random;

public class Ejercicio_10 {

    private static Boolean adivinaNumero(Integer numeroaAdivinar, Integer numero){
        if (numeroaAdivinar < numero) {
            System.out.println("El número que busca es menor, digite un número: ");
            return true;
        } else if (numeroaAdivinar > numero) {
            System.out.println("El número que busca es mayor, digite un número: ");
            return true;
        } else if (numeroaAdivinar == numero) {
            System.out.println("número adivinado");
        }
        return false;
    }
    public static void main(String[] args) {
        Random numeroaAdivinar = new Random();
        int n = numeroaAdivinar.nextInt(101);
        Boolean seguir = true;
        var sc = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        while (seguir) {
            var numeroIngresado = sc.nextLine();
            var num = Integer.parseInt(numeroIngresado);
            seguir = Ejercicio_10.adivinaNumero(n, num);
        }
        sc.close();
    }
}
