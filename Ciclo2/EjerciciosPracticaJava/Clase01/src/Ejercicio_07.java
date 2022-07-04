import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_07 {

    private static String promedioNotas(String nombreAlumno, ArrayList<Float> notas){
        var suma = notas.stream().reduce((float) 0,(acomulador, element)-> acomulador + element);
        var promedio = suma / (float) 3;
        if (promedio >= 3.0) {
            return String.format("%s está aprobado", nombreAlumno); 
        }
        return String.format("%s está desaprobado", nombreAlumno);
    }
    public static void main(String[] args) {
        ArrayList<Float> notas = new ArrayList<Float>();
        var sc = new Scanner(System.in);
        System.out.println("Escriba el nombre del alumno: ");
        var nombre = sc.nextLine();
        for (var i = 1; i < 4; i++) {
            System.out.println("Digite nota " + i + " : ");
            var nota = sc.nextLine();
            var notaNumerica = Float.valueOf(nota);
            notas.add(notaNumerica);
        }
        sc.close();
        System.out.println(Ejercicio_07.promedioNotas(nombre, notas));
    }
}
