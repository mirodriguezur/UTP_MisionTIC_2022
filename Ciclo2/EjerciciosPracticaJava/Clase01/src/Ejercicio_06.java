import java.util.Scanner;

public class Ejercicio_06 {

    private static Integer suma(Integer n1, Integer n2) {
        return  n1 + n2;
    } 

    private static Integer resta(Integer n1, Integer n2) {
        return n1 - n2;
    }

    private static Integer multiplicacion(Integer n1, Integer n2) {
        return n1 * n2;
    }

    private static Double division(Integer n1, Integer n2) {
        return n1.doubleValue() / n2.doubleValue();
    }

    
    static String seleccionOperacion(String operation) {
        var sc = new Scanner(System.in);
        System.out.println("Digite el primer número: ");
        var numero1 = sc.nextLine();
        var int1 = Integer.parseInt(numero1);
        System.out.println("Digite el segundo número: ");
        var numero2 = sc.nextLine();
        var int2 = Integer.parseInt(numero2);
        sc.close();

        var result = "";
        switch (operation) {
            case "1":
                //Ejercicio_06.suma(int1, int2);
                result = "La suma de " + numero1 + " y " +  numero2 + " es igual a " + Ejercicio_06.suma(int1, int2)+"";
                break;
            case "2":
                result = "La resta de " + numero1 + " y " +  numero2 + " es igual a " + Ejercicio_06.resta(int1, int2)+"";
                break;
            case "3":
                result = "La multiplicacion de " + numero1 + " y " +  numero2 + " es igual a " + Ejercicio_06.multiplicacion(int1, int2)+"";
                break;
            case "4":
                result = "La division de " + numero1 + " y " +  numero2 + " es igual a " + Ejercicio_06.division(int1, int2)+"";
                break;
            default:
                System.out.println("Opción inválida.");
        }
        return result;  
    }

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("--------Seleccione operación----------");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicacion");
        System.out.println("4: Division");
        var operacion = sc.nextLine();
        var result = Ejercicio_06.seleccionOperacion(operacion);
        System.out.println(result);
        sc.close();
    }
}
