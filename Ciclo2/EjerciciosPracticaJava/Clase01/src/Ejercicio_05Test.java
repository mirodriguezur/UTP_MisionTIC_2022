import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Ejercicio_05Test {
    //private final Ejercicio_02 ej02 = new Ejercicion_02();

    @Test
    public void esParoImpar_print_numberIsOdd() {
        //given
        String[] numerosImpares = {"13", "1", "3", "7", "9", "11"};
        //when

        for (var impar : numerosImpares) {
            var resultado = Ejercicio_05.esParoImpar(impar);
            //then
            assertEquals(resultado, impar + " es impar");;
        }
    }

    @Test
    public void esParoImpar_print_numberIsEven() {
        //given
        String[] numerosImpares = {"12", "2", "4", "6", "10", "202"};
        //when

        for (var impar : numerosImpares) {
            var resultado = Ejercicio_05.esParoImpar(impar);
            //then
            assertEquals(resultado, impar + " es par");;
        }
    }
}
