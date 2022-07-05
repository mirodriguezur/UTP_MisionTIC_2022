import java.util.Scanner;

public class Ejercicio_01 {

    private static Integer numeroDeLaSuerte(String anoNacimiento){
        var numerosSeparados = anoNacimiento.split("/");
        var diaChart = numerosSeparados[0].toCharArray();
        var mesChart = numerosSeparados[1].toCharArray();
        var anoChart = numerosSeparados[2].toCharArray();

        var dia = Integer.parseInt(new String(diaChart));
        var mes = Integer.parseInt(new String(mesChart));
        var ano = Integer.parseInt(new String(anoChart));

        var sumaTotal = dia + mes + ano;
        var numeroMagico = 0;

        while (sumaTotal > 0) {
            numeroMagico += sumaTotal % 10;
            sumaTotal = sumaTotal / 10;
        }
        return numeroMagico;
    } 
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        System.out.println("Ingrese fecha de nacimiento en formato DD/MM/AAAA: " );
        var fecha = sc.nextLine();
        System.out.println("numero de la suerte es: " + Ejercicio_01.numeroDeLaSuerte(fecha));
        sc.close();
    }
}