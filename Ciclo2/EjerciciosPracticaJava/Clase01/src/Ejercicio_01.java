import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Escriba su nombre: ");
        var nombre = sc.nextLine();
        System.out.println("Su nombre es: " + nombre);
        sc.close();
    }
}