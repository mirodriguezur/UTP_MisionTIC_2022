import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Ejercicio_03Test {
    //private final Ejercicio_02 ej02 = new Ejercicion_02();

    @Test
    public void contadorDigitos() {
        //given
        var num = "2";
        int[] expected = {4, 6};
        //when
        var resultado = Ejercicio_03.dobleyTriple(num);
        //then
        assertEquals(expected[0], resultado[0]);;
        assertEquals(expected[1], resultado[1]);;
    }
}
