package co.edu.utp.misiontic2022.michaelrodriguez;
import co.edu.utp.misiontic2022.michaelrodriguez.Modelo.BecaUniversitaria;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BecaUniversitaria becaUniversitaria1 = new BecaUniversitaria();
        System.out.println(becaUniversitaria1.calcularInteresSimple());
        System.out.println(becaUniversitaria1.calcularInteresCompuesto());
        System.out.println(becaUniversitaria1.compararInversion(60, 13000, 1.4));
        System.out.println("-------------------------------------------");

        BecaUniversitaria becaUniversitaria2 = new BecaUniversitaria(48, 10000, 2.0);
        System.out.println(becaUniversitaria2.calcularInteresSimple());
        System.out.println(becaUniversitaria2.calcularInteresCompuesto());
        System.out.println(becaUniversitaria2.compararInversion());
        System.out.println("-------------------------------------------");  

        BecaUniversitaria becaUniversitaria3 = new BecaUniversitaria();
        System.out.println(becaUniversitaria3.calcularInteresSimple());
        System.out.println(becaUniversitaria3.calcularInteresCompuesto());
        System.out.println(becaUniversitaria3.compararInversion()); 
    }
}
